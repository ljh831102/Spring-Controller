package cn.ljh.controller.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MyUtil {

	public static Map<String, String> getFiteopleList() {
		Map<String, String> fitpeopleList = new HashMap<String, String>();

		fitpeopleList.put("01", "男人");
		fitpeopleList.put("02", "女人");
		fitpeopleList.put("03", "小孩");

		return fitpeopleList;
	}

	/*
	 * 根据表的数据来编辑画面显示
	 */
	public static String getViewString(String before, Map<String, String> map) {

		if (before == null || "".equals(before)) {
			return "";
		} else {
			StringBuilder sBuilder = new StringBuilder();
			List<String> beforeList = Arrays.asList(before.split(","));

			for (String str_before : beforeList) {
				sBuilder.append(map.get(str_before));
				sBuilder.append(",");
			}

			return sBuilder.length() == 0 ? "" : sBuilder.substring(0, sBuilder.length() - 1);
		}

	}

	public static Map<String, String> getSellinglevelList() {
		Map<String, String> sellinglevelList = new HashMap<String, String>();

		sellinglevelList.put("01", "特销品");
		sellinglevelList.put("02", "畅销品");
		sellinglevelList.put("03", "滞销品");

		return sellinglevelList;
	}

	public static Map<String, String> getItemtypeList() {
		Map<String, String> itemtypeList = new HashMap<String, String>();

		itemtypeList.put("   ", "请选择");
		itemtypeList.put("101", "手机");
		itemtypeList.put("102", "电脑");
		itemtypeList.put("103", "电视");
		itemtypeList.put("104", "冰箱");

		return itemtypeList;
	}

	public static Map<String, String> getUserHobbiesMap() {
		Map<String, String> userHobbiesMap = new HashMap<String, String>();

		userHobbiesMap.put("01", "看书");
		userHobbiesMap.put("02", "打球");
		userHobbiesMap.put("03", "看电视");
		userHobbiesMap.put("04", "玩游戏");
		userHobbiesMap.put("04", "上网");

		return userHobbiesMap;
	}

	public static Map<String, String> getUserSexMap() {
		Map<String, String> userSexMap = new HashMap<String, String>();

		userSexMap.put("0", "不详");
		userSexMap.put("1", "男");
		userSexMap.put("2", "女");

		return userSexMap;
	}
}
