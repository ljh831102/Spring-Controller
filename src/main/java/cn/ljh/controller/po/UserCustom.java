package cn.ljh.controller.po;

import java.util.List;
import java.util.Map;

import cn.ljh.controller.validation.constraints.PropertyScriptAssert;
import cn.ljh.controller.validator.ValidGroup1;
import cn.ljh.controller.validator.ValidGroup2;

@PropertyScriptAssert(property = "userConfirmation", script = "_this.userPassword==_this.userConfirmation", lang = "javascript", alias = "_this", groups = {
		ValidGroup1.class, ValidGroup2.class }, message = "{user.userPassword.confirmation.error}")
public class UserCustom extends User {

	private String userConfirmation;

	private Map<String, String> userSexMap;

	private List<String> userHobbiesList;

	private Map<String, String> userHobbiesMap;

	private List<Region> userRegionProvinceCodeList;

	private List<Region> userRegionCityCodeList;

	private List<Region> userRegionCountyCodeList;

	public String getUserConfirmation() {
		return userConfirmation;
	}

	public void setUserConfirmation(String userConfirmation) {
		this.userConfirmation = userConfirmation;
	}

	public Map<String, String> getUserSexMap() {
		return userSexMap;
	}

	public void setUserSexMap(Map<String, String> userSexMap) {
		this.userSexMap = userSexMap;
	}

	public List<String> getUserHobbiesList() {
		return userHobbiesList;
	}

	public void setUserHobbiesList(List<String> userHobbiesList) {
		this.userHobbiesList = userHobbiesList;
	}

	public Map<String, String> getUserHobbiesMap() {
		return userHobbiesMap;
	}

	public void setUserHobbiesMap(Map<String, String> userHobbiesMap) {
		this.userHobbiesMap = userHobbiesMap;
	}

	public List<Region> getUserRegionProvinceCodeList() {
		return userRegionProvinceCodeList;
	}

	public void setUserRegionProvinceCodeList(List<Region> userRegionProvinceCodeList) {
		this.userRegionProvinceCodeList = userRegionProvinceCodeList;
	}

	public List<Region> getUserRegionCityCodeList() {
		return userRegionCityCodeList;
	}

	public void setUserRegionCityCodeList(List<Region> userRegionCityCodeList) {
		this.userRegionCityCodeList = userRegionCityCodeList;
	}

	public List<Region> getUserRegionCountyCodeList() {
		return userRegionCountyCodeList;
	}

	public void setUserRegionCountyCodeList(List<Region> userRegionCountyCodeList) {
		this.userRegionCountyCodeList = userRegionCountyCodeList;
	}

}
