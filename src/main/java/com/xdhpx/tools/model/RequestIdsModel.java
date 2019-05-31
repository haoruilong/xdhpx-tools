package com.xdhpx.tools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "RequestIdsModel", description = "ID入参对象")
public class RequestIdsModel {
	
	@ApiModelProperty(value="id")
    private String id;
	
	@ApiModelProperty(value="id数组")
    private String[] ids;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

}
