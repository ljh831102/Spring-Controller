package cn.ljh.controller.po;

import java.util.List;

public class ItemsQueryVo {

	// 商品信息
	private List<ItemsCustomVo> itemsCustomVoList;

	// 为了系统 可扩展性，对原始生成的po进行扩展
	private ItemsCustom itemsCustom;

	public List<ItemsCustomVo> getItemsCustomVoList() {
		return itemsCustomVoList;
	}

	public void setItemsCustomVoList(List<ItemsCustomVo> itemsCustomVoList) {
		this.itemsCustomVoList = itemsCustomVoList;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

}
