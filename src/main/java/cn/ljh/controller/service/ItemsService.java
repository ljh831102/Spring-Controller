package cn.ljh.controller.service;

import java.util.List;

import cn.ljh.controller.po.ItemsCustom;

public interface ItemsService {

	// 商品查询列表
	public List<ItemsCustom> findItemsList(ItemsCustom itemsCustom) throws Exception;

	// 根据id查询商品信息
	public ItemsCustom findItemsById(Integer id) throws Exception;

	// 修改商品信息
	public void updateItemsList(List<ItemsCustom> itemsList) throws Exception;

	// 添加商品信息
	public void saveItems(ItemsCustom itemsCustom) throws Exception;

	// 根据id删除商品信息
	public void deleteByPrimaryKey(Integer id) throws Exception;

}
