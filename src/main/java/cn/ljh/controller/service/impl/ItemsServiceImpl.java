package cn.ljh.controller.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.ljh.controller.mapper.ItemsMapper;
import cn.ljh.controller.po.Items;
import cn.ljh.controller.po.ItemsCustom;
import cn.ljh.controller.po.ItemsExample;
import cn.ljh.controller.service.ItemsService;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapper itemsMapper;

	// @Override
	public List<ItemsCustom> findItemsList(ItemsCustom itemsCustom) throws Exception {
		ItemsExample itemsExample = new ItemsExample();

		ItemsExample.Criteria criteria = itemsExample.createCriteria();

		if (itemsCustom != null && !StringUtils.isEmpty(itemsCustom.getItemsName())) {
			criteria.andItemsNameLike(itemsCustom.getItemsName());
		}
		// 通过ItemsMapperCustom查询数据库
		List<Items> itemsList = itemsMapper.selectByExample(itemsExample);

		ItemsCustom itemsCustom2 = null;
		List<ItemsCustom> itemsCustomsList = new ArrayList<ItemsCustom>();
		for (Items items : itemsList) {
			itemsCustom2 = new ItemsCustom();
			BeanUtils.copyProperties(items, itemsCustom2);

			itemsCustomsList.add(itemsCustom2);
		}

		return itemsCustomsList;
	}

	// @Override
	public ItemsCustom findItemsById(Integer id) throws Exception {

		Items items = itemsMapper.selectByPrimaryKey(id);
		// 中间对商品信息进行业务处理
		// ....
		// 返回ItemsCustom
		ItemsCustom itemsCustom = new ItemsCustom();
		// 将items的属性值拷贝到itemsCustom
		BeanUtils.copyProperties(items, itemsCustom);

		return itemsCustom;

	}

	@Override
	public void updateItemsList(List<ItemsCustom> itemsList) throws Exception {

		Items items;
		// 更新商品信息使用updateByPrimaryKeyWithBLOBs根据id更新items表中所有字段，包括 大文本类型字段
		// updateByPrimaryKeyWithBLOBs要求必须转入id
		for (ItemsCustom itemsCustom : itemsList) {
			items = new Items();
			BeanUtils.copyProperties(itemsCustom, items);
			itemsMapper.updateByPrimaryKey(items);
		}
	}

	@Override
	public void deleteByPrimaryKey(Integer id) throws Exception {
		itemsMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void saveItems(ItemsCustom itemsCustom) throws Exception {
		// TODO Auto-generated method stub
		Items items = new Items();
		BeanUtils.copyProperties(itemsCustom, items);
		itemsMapper.insert(itemsCustom);
	}

}
