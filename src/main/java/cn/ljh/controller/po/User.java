package cn.ljh.controller.po;

import java.io.Serializable;
import java.util.Date;

import cn.ljh.controller.validation.constraints.CheckUserBirthday;
import cn.ljh.controller.validation.constraints.CheckUserMobilephone;
import cn.ljh.controller.validation.constraints.CheckUserName;
import cn.ljh.controller.validation.constraints.CheckUserPassword;
import cn.ljh.controller.validator.ValidGroup1;
import cn.ljh.controller.validator.ValidGroup2;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer userId;

	private String userRegionProvinceCode;

	private String userRegionCityCode;

	private String userRegionCountyCode;

	private String userAddressdetail;
	@CheckUserBirthday(groups = { ValidGroup1.class, ValidGroup2.class })
	private Date userBirthday;

	private String userHobbies;
	@CheckUserMobilephone(groups = { ValidGroup1.class })
	private String userMobilephone;
	@CheckUserPassword(groups = { ValidGroup1.class, ValidGroup2.class })
	private String userPassword;

	private String userSex;
	@CheckUserName(groups = { ValidGroup1.class })
	private String userName;

	private String userImg;

	private String userDetail;

	private String userEmail;

	private String userFavoritecolor;

	private Integer userSalary;

	private String userFavoriteurl;

	private String userGrade;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserRegionProvinceCode() {
		return userRegionProvinceCode;
	}

	public void setUserRegionProvinceCode(String userRegionProvinceCode) {
		this.userRegionProvinceCode = userRegionProvinceCode == null ? null : userRegionProvinceCode.trim();
	}

	public String getUserRegionCityCode() {
		return userRegionCityCode;
	}

	public void setUserRegionCityCode(String userRegionCityCode) {
		this.userRegionCityCode = userRegionCityCode == null ? null : userRegionCityCode.trim();
	}

	public String getUserRegionCountyCode() {
		return userRegionCountyCode;
	}

	public void setUserRegionCountyCode(String userRegionCountyCode) {
		this.userRegionCountyCode = userRegionCountyCode == null ? null : userRegionCountyCode.trim();
	}

	public String getUserAddressdetail() {
		return userAddressdetail;
	}

	public void setUserAddressdetail(String userAddressdetail) {
		this.userAddressdetail = userAddressdetail == null ? null : userAddressdetail.trim();
	}

	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserHobbies() {
		return userHobbies;
	}

	public void setUserHobbies(String userHobbies) {
		this.userHobbies = userHobbies == null ? null : userHobbies.trim();
	}

	public String getUserMobilephone() {
		return userMobilephone;
	}

	public void setUserMobilephone(String userMobilephone) {
		this.userMobilephone = userMobilephone == null ? null : userMobilephone.trim();
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex == null ? null : userSex.trim();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg == null ? null : userImg.trim();
	}

	public String getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(String userDetail) {
		this.userDetail = userDetail == null ? null : userDetail.trim();
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}

	public String getUserFavoritecolor() {
		return userFavoritecolor;
	}

	public void setUserFavoritecolor(String userFavoritecolor) {
		this.userFavoritecolor = userFavoritecolor == null ? null : userFavoritecolor.trim();
	}

	public Integer getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(Integer userSalary) {
		this.userSalary = userSalary;
	}

	public String getUserFavoriteurl() {
		return userFavoriteurl;
	}

	public void setUserFavoriteurl(String userFavoriteurl) {
		this.userFavoriteurl = userFavoriteurl == null ? null : userFavoriteurl.trim();
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade == null ? null : userGrade.trim();
	}
}