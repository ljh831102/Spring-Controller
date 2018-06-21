package cn.ljh.controller.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import cn.ljh.controller.po.ItemsCustom;
import cn.ljh.controller.po.ItemsCustomVo;
import cn.ljh.controller.po.ItemsQueryVo;
import cn.ljh.controller.service.ItemsService;
import cn.ljh.controller.util.MyUtil;
import cn.ljh.controller.validator.ValidGroup2;

@Controller
@RequestMapping(value = { "items" })
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    // 商品查询
    @RequestMapping(value = "/initial", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView queryItems(HttpSession session) throws Exception {

        // 返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();

        // 调用service查找数据库，查询商品列表
        List<ItemsCustom> itemsCustomList = itemsService.findItemsList(null);

        List<ItemsCustomVo> itemsCustomVoList = new ArrayList<ItemsCustomVo>();
        ItemsCustomVo itemsCustomVo = null;

        for (ItemsCustom itemsCustom : itemsCustomList) {
            itemsCustomVo = new ItemsCustomVo();
            BeanUtils.copyProperties(itemsCustom, itemsCustomVo);
            itemsCustomVo.setView_itemsFitpeople(
                    MyUtil.getViewString(itemsCustom.getItemsFitpeople(), MyUtil.getFiteopleList()));
            itemsCustomVo.setView_itemsSellinglevel(
                    MyUtil.getViewString(itemsCustom.getItemsSellinglevel(), MyUtil.getSellinglevelList()));
            itemsCustomVo.setView_itemsItemtype(
                    MyUtil.getViewString(itemsCustom.getItemsItemtype(), MyUtil.getItemtypeList()));

            itemsCustomVoList.add(itemsCustomVo);
        }

        ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
        itemsQueryVo.setItemsCustomVoList(itemsCustomVoList);

        modelAndView.addObject("itemsQueryVo", itemsQueryVo);
        // 指定视图
        // 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
        // modelAndView.setViewName("/WEB-INF/view/items/itemsList.jsp");
        // 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
        modelAndView.setViewName("items/itemsList");
        return modelAndView;

    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String queryItemsByName(HttpServletRequest request,
            @ModelAttribute @Validated(value = { ValidGroup2.class }) ItemsCustom itemsCustom, BindingResult result)
            throws Exception {

        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError objectError : errors) {
                System.out.println(objectError.getCode() + ": " + objectError.getDefaultMessage());
            }
            request.setAttribute("itemsQueryVo", request.getAttribute("itemsQueryVo"));
            // 返回自画面
            return "items/itemsList";
        }

        List<ItemsCustom> itemsCustomList = itemsService.findItemsList(itemsCustom);

        List<ItemsCustomVo> itemsCustomVoList = new ArrayList<ItemsCustomVo>();
        ItemsCustomVo itemsCustomVo = null;

        for (ItemsCustom itemsCustom1 : itemsCustomList) {
            itemsCustomVo = new ItemsCustomVo();
            BeanUtils.copyProperties(itemsCustom1, itemsCustomVo);
            itemsCustomVo.setView_itemsFitpeople(
                    MyUtil.getViewString(itemsCustom1.getItemsFitpeople(), MyUtil.getFiteopleList()));
            itemsCustomVo.setView_itemsSellinglevel(
                    MyUtil.getViewString(itemsCustom1.getItemsSellinglevel(), MyUtil.getSellinglevelList()));
            itemsCustomVo.setView_itemsItemtype(
                    MyUtil.getViewString(itemsCustom1.getItemsItemtype(), MyUtil.getItemtypeList()));

            itemsCustomVoList.add(itemsCustomVo);
        }

        ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
        itemsQueryVo.setItemsCustomVoList(itemsCustomVoList);

        request.setAttribute("itemsQueryVo", itemsQueryVo);

        return "items/itemsList";

    }

    // 画面重置
    @RequestMapping(value = "/reset", method = RequestMethod.GET)
    public String reset() throws Exception {
        return "forward:/items/initial";
    }

    // update
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute @Validated ItemsCustom itemsCustom, BindingResult result,
            MultipartFile pictureFile) throws Exception {

        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError objectError : errors) {
                System.out.println(objectError.getCode() + ": " + objectError.getDefaultMessage());
            }
            // 返回自画面
            return "items/editItem";
        }

        this.setItemsPic(itemsCustom, pictureFile);
        List<ItemsCustom> itemsList = new ArrayList<ItemsCustom>();
        itemsList.add(itemsCustom);
        itemsService.updateItemsList(itemsList);

        // 通过redirect重定向防止刷新页面重复提交
        return "redirect:/items/initial";
    }

    // add
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute @Validated ItemsCustom itemsCustom, BindingResult result,
            MultipartFile pictureFile) throws Exception {

        // try {
        // userService.changePassword(user.getPassword(), user.getConfirmation());
        // } catch (Exception throwable) {
        // System.out.println(throwable.getClass());
        // if (throwable instanceof ConstraintViolationException) {
        // Set<ConstraintViolation<?>> constraintViolations =
        // ((ConstraintViolationException) throwable)
        // .getConstraintViolations();
        // for (ConstraintViolation<?> constraint : constraintViolations) {
        // System.out.println("PropertyPath: " + constraint.getPropertyPath().toString()
        // + " Message: "
        // + constraint.getMessage() + " MessageTemplate: " +
        // constraint.getMessageTemplate());
        // }
        // }
        // return "items/editItem";
        // }

        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError objectError : errors) {
                System.out.println(objectError.getCode() + ": " + objectError.getDefaultMessage());
            }

            // 返回自画面
            return "items/editItem";
        }

        this.setItemsPic(itemsCustom, pictureFile);

        itemsService.saveItems(itemsCustom);

        // 通过redirect重定向防止刷新页面重复提交
        return "redirect:/items/initial";
    }

    // delete
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@ModelAttribute ItemsCustom itemsCustom) throws Exception {

        itemsService.deleteByPrimaryKey(itemsCustom.getItemsId());

        // 通过redirect重定向防止刷新页面重复提交
        return "redirect:/items/initial";
    }

    @RequestMapping(value = "/edit", method = { RequestMethod.POST, RequestMethod.GET })
    // @RequestParam里边指定request传入参数名称和形参进行绑定。
    // 通过required属性指定参数是否必须要传入
    // 通过defaultValue可以设置默认值，如果id参数没有传入，将默认值和形参绑定。
    public String editItems(Model model, @RequestParam(value = "items_id", required = false) Integer items_id)
            throws Exception {

        ItemsCustom itemsCustom = new ItemsCustom();

        // 调用service根据商品id查询商品信息
        if (items_id != null && items_id != 0) {
            itemsCustom = itemsService.findItemsById(items_id);
        }

        // 通过形参中的model将model数据传到页面
        // 相当于modelAndView.addObject方法
        model.addAttribute("itemsCustom", itemsCustom);

        return "items/editItem";
    }

    // 商品分类
    @ModelAttribute("itemtypes")
    public Map<String, String> getItemTypes() {

        return MyUtil.getItemtypeList();
    }

    private ItemsCustom setItemsPic(ItemsCustom itemsCustom, MultipartFile pictureFile)
            throws IllegalStateException, IOException {

        itemsCustom.setItemsPic(savePic(pictureFile));
        return itemsCustom;
    }

    private String savePic(MultipartFile pictureFile) throws IllegalStateException, IOException {

        if (!pictureFile.isEmpty()) {
            // 原始文件名称
            String pictureFile_name = pictureFile.getOriginalFilename();
            // 新文件名称
            String newFileName = UUID.randomUUID().toString()
                    + pictureFile_name.substring(pictureFile_name.lastIndexOf("."));

            // 上传图片
            File uploadPic = new java.io.File("C:/hd/study/temp/upload/pic/" + newFileName);

            if (!uploadPic.exists()) {
                uploadPic.mkdirs();
            }
            // 向磁盘写文件
            pictureFile.transferTo(uploadPic);

            return newFileName;
        }

        return "";
    }

    @RequestMapping("/uploadDetailpic")
    @ResponseBody
    public String fileUpload(String inputId, MultipartHttpServletRequest request)
            throws IllegalStateException, IOException {
        // 拿到文件
        MultipartFile realPicFile = request.getFile(inputId);

        String newFileName = savePic(realPicFile);

        if (!StringUtils.isEmpty(newFileName)) {
            return "{\"newFileName\":\"" + newFileName + "\"}";
        }
        return "{\"newFileName\":\"\"}";
    }

    @RequestMapping(value = "/deletePic")
    public @ResponseBody String deletePic(String delete_file_name) {

        String[] filearray = StringUtils.commaDelimitedListToStringArray(delete_file_name);

        for (int i = 0; i < filearray.length; i++) {
            File deletePic = new java.io.File("C:/hd/study/temp/upload/pic/" + filearray[i]);
            if (deletePic.exists()) {
                deletePic.delete();
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }

        return "{\"error\":\"0\"}";
    }

    @RequestMapping(value = "/downloadPic")
    public ResponseEntity<byte[]> downloadPic(String download_file_name) throws IOException {

        File downloadPic = new java.io.File("C:/hd/study/temp/upload/pic/" + download_file_name);
        byte[] body = null;
        // 获取文件
        InputStream is = new FileInputStream(downloadPic);
        body = new byte[is.available()];
        is.read(body);
        is.close();
        HttpHeaders headers = new HttpHeaders();
        // 下载显示的文件名，解决中文名称乱码问题
        String downloadFielName = new String(downloadPic.getName().getBytes("UTF-8"), "iso-8859-1");
        // 设置文件类型
        headers.add("Content-Disposition", "attchement;filename=" + downloadFielName);
        // application/octet-stream ： 二进制流数据（最常见的文件下载）。
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // 设置Http状态码
        HttpStatus statusCode = HttpStatus.OK;
        // 返回数据
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }

}
