package cn.ljh.controller.po;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import cn.ljh.controller.validation.constraints.CheckItemsName;

public class Items {
	private Integer itemsId;

	@CheckItemsName
	private String itemsName;

	@NumberFormat(pattern = "#,##0.00")
	@NotNull
	private Float itemsPrice;

	private String itemsDetail;

	private String itemsPic;

	private String itemsDetailpic;

	@NotNull
	private Date itemsCreatetime;

	@NotEmpty
	private String itemsFitpeople;

	private String itemsSellinglevel;

	private String itemsItemtype;

	public Integer getItemsId() {
		return itemsId;
	}

	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName == null ? null : itemsName.trim();
	}

	public Float getItemsPrice() {
		return itemsPrice;
	}

	public void setItemsPrice(Float itemsPrice) {
		this.itemsPrice = itemsPrice;
	}

	public String getItemsDetail() {
		return itemsDetail;
	}

	public void setItemsDetail(String itemsDetail) {
		this.itemsDetail = itemsDetail == null ? null : itemsDetail.trim();
	}

	public String getItemsPic() {
		return itemsPic;
	}

	public void setItemsPic(String itemsPic) {
		this.itemsPic = itemsPic == null ? null : itemsPic.trim();
	}

	public String getItemsDetailpic() {
		return itemsDetailpic;
	}

	public void setItemsDetailpic(String itemsDetailpic) {
		this.itemsDetailpic = itemsDetailpic == null ? null : itemsDetailpic.trim();
	}

	public Date getItemsCreatetime() {
		return itemsCreatetime;
	}

	public void setItemsCreatetime(Date itemsCreatetime) {
		this.itemsCreatetime = itemsCreatetime;
	}

	public String getItemsFitpeople() {
		return itemsFitpeople;
	}

	public void setItemsFitpeople(String itemsFitpeople) {
		this.itemsFitpeople = itemsFitpeople == null ? null : itemsFitpeople.trim();
	}

	public String getItemsSellinglevel() {
		return itemsSellinglevel;
	}

	public void setItemsSellinglevel(String itemsSellinglevel) {
		this.itemsSellinglevel = itemsSellinglevel == null ? null : itemsSellinglevel.trim();
	}

	public String getItemsItemtype() {
		return itemsItemtype;
	}

	public void setItemsItemtype(String itemsItemtype) {
		this.itemsItemtype = itemsItemtype == null ? null : itemsItemtype.trim();
	}
}