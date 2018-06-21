package cn.ljh.controller.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.ljh.controller.po.Region;
import cn.ljh.controller.po.UserCustom;
import cn.ljh.controller.service.RegionService;
import cn.ljh.controller.service.UserService;
import cn.ljh.controller.util.MyUtil;
import cn.ljh.controller.validator.ValidGroup1;
import cn.ljh.controller.validator.ValidGroup2;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RegionService regionService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView initial() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/user2/login", method = RequestMethod.POST)
    // @WriteLog(value = "${p0.userName}从${ctx.ip}登录成功【${ret}】")
    public String login(@ModelAttribute @Validated UserCustom userCustom, HttpServletRequest request,
            HttpSession session) throws Exception {

        UserCustom userCustom2 = userService.login(userCustom);
        if (userCustom2 != null && !StringUtils.isEmpty(userCustom2.getUserName())) {
            session.setAttribute("loginUserCustom", userCustom2);
        }

        return "forward:/items/initial";
    }

    @RequestMapping(value = "/user/logout")
    public String logout(HttpSession session) throws Exception {

        // session.removeAttribute("loginUserCustom");
        session.invalidate();
        return "login";
    }

    @RequestMapping(value = "/user2/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request) throws Exception {

        this.editUserCustom(request, new UserCustom(), "register");
        return "user/editUser";
    }

    @RequestMapping(value = "/user/edit/{userId}", method = { RequestMethod.POST, RequestMethod.GET })
    public String edit(@PathVariable("userId") Integer userId, HttpServletRequest request) throws Exception {

        UserCustom userCustom = userService.findUserById(userId);

        this.editUserCustom(request, userCustom, "edit");

        return "user/editUser";
    }

    @RequestMapping(value = "/user2/add", method = RequestMethod.POST)
    public String add(@ModelAttribute @Validated(value = { ValidGroup1.class }) UserCustom userCustom,
            BindingResult result, HttpServletRequest request,
            @ModelAttribute @RequestParam("pictureFile") MultipartFile[] pictureFile) throws Exception {
        if (result.hasErrors()) {
            // 返回自画面
            this.editUserCustom(request, userCustom, "add");
            return "user/editUser";
        }

        userCustom = setUserImg(userCustom, pictureFile);
        userService.saveUser(userCustom);

        return "login";
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public String update(@ModelAttribute @Validated(value = { ValidGroup2.class }) UserCustom userCustom,
            BindingResult result, HttpServletRequest request,
            @ModelAttribute @RequestParam("pictureFile") MultipartFile[] pictureFile) throws Exception {

        if (result.hasErrors()) {
            // 返回自画面
            this.editUserCustom(request, userCustom, "update");
            return "user/editUser";
        }
        userCustom = setUserImg(userCustom, pictureFile);
        userService.updateUser(userCustom);
        return "login";
    }

    // 客户端发送JSON数据，服务器端返回JSON数据
    @RequestMapping(value = "/user2/getRegion1", method = RequestMethod.POST)
    public @ResponseBody List<Region> getRegionCityCode1(@RequestBody Region region) throws Exception {

        return regionService.getRegionList(region);
    }

    // 客户端发送key/value数据，服务器端返回JSON数据
    @RequestMapping(value = "/user2/getRegion2", method = RequestMethod.POST)
    public @ResponseBody List<Region> getRegionCityCode2(Region region) throws Exception {

        return regionService.getRegionList(region);
    }

    // check用户名和手机号码是不是已经被使用
    @RequestMapping(value = "/user2/checkUser", method = RequestMethod.POST)
    public @ResponseBody String checkUser(UserCustom userCustom) throws Exception {

        List<UserCustom> userCustoms = userService.findUserList(userCustom);

        if (userCustoms != null && userCustoms.size() > 0) {
            return "{\"used\":\"1\"}";
        }
        return "{\"used\":\"0\"}";
    }

    private void editUserCustom(HttpServletRequest request, UserCustom userCustom, String action) {

        // 用户性别
        if ("register".equals(action)) {
            userCustom.setUserSex("0");
        }
        userCustom.setUserSexMap(MyUtil.getUserSexMap());

        // 用户兴趣爱好
        if ("update".equals(action) || "add".equals(action)) {
            userCustom.setUserHobbies(StringUtils.collectionToCommaDelimitedString(userCustom.getUserHobbiesList()));
        }
        userCustom.setUserHobbiesList(
                Arrays.asList(StringUtils.commaDelimitedListToStringArray(userCustom.getUserHobbies())));
        userCustom.setUserHobbiesMap(MyUtil.getUserHobbiesMap());

        List<Region> userRegionProvinceCodeList = new ArrayList<Region>();
        List<Region> userRegionCityCodeList = new ArrayList<Region>();
        List<Region> userRegionCountyCodeList = new ArrayList<Region>();

        Region region = new Region();
        // 取得省信息
        region.setRegionKind("1");
        userRegionProvinceCodeList = regionService.getRegionList(region);

        // 取得市信息

        if (!StringUtils.isEmpty(userCustom.getUserRegionProvinceCode())
                && !"000".equals(userCustom.getUserRegionProvinceCode())) {
            region.setRegionKind("2");
            region.setRegionProvinceCode(userCustom.getUserRegionProvinceCode());
            userRegionCityCodeList = regionService.getRegionList(region);

            if (!StringUtils.isEmpty(userCustom.getUserRegionCityCode())
                    && !"000".equals(userCustom.getUserRegionCityCode())) {
                // 取得县信息
                region.setRegionKind("3");
                region.setRegionProvinceCode(userCustom.getUserRegionProvinceCode());
                region.setRegionCityCode(userCustom.getUserRegionCityCode());
                userRegionCountyCodeList = regionService.getRegionList(region);
            }
        }

        userCustom.setUserRegionProvinceCodeList(userRegionProvinceCodeList);
        userCustom.setUserRegionCityCodeList(userRegionCityCodeList);
        userCustom.setUserRegionCountyCodeList(userRegionCountyCodeList);

        request.setAttribute("userCustom", userCustom);
    }

    private UserCustom setUserImg(UserCustom userCustom, MultipartFile[] pictureFile)
            throws IllegalStateException, IOException {

        StringBuilder userImgbuilder = new StringBuilder();
        // 判断pictureFile数组不能为空并且长度大于0
        if (pictureFile != null && pictureFile.length > 0) {
            for (MultipartFile multipartFile : pictureFile) {
                if (!multipartFile.isEmpty()) {
                    // 原始文件名称
                    String pictureFile_name = multipartFile.getOriginalFilename();
                    // 新文件名称
                    String newFileName = UUID.randomUUID().toString()
                            + pictureFile_name.substring(pictureFile_name.lastIndexOf("."));

                    // 上传图片
                    File uploadPic = new java.io.File("C:/hd/study/temp/upload/pic/" + newFileName);

                    if (!uploadPic.exists()) {
                        uploadPic.mkdirs();
                    }
                    // 向磁盘写文件
                    multipartFile.transferTo(uploadPic);
                    userImgbuilder.append(newFileName).append(",");
                }
            }
        }
        userCustom.setUserImg(
                userImgbuilder.length() == 0 ? "" : userImgbuilder.substring(0, userImgbuilder.length() - 1));
        return userCustom;
    }

}
