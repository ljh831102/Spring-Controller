package cn.ljh.controller.po;

public class ItemsCustomVo extends ItemsCustom {
	/* 适用人群 */
	private String view_itemsFitpeople;

	/* 销售级别 */
	private String view_itemsSellinglevel;

	/* 商品种类 */
	private String view_itemsItemtype;

	public String getView_itemsFitpeople() {
		return view_itemsFitpeople;
	}

	public void setView_itemsFitpeople(String view_itemsFitpeople) {
		this.view_itemsFitpeople = view_itemsFitpeople;
	}

	public String getView_itemsSellinglevel() {
		return view_itemsSellinglevel;
	}

	public void setView_itemsSellinglevel(String view_itemsSellinglevel) {
		this.view_itemsSellinglevel = view_itemsSellinglevel;
	}

	public String getView_itemsItemtype() {
		return view_itemsItemtype;
	}

	public void setView_itemsItemtype(String view_itemsItemtype) {
		this.view_itemsItemtype = view_itemsItemtype;
	}

}
