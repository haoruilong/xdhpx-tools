package com.xdhpx.tools.model;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "BaseDTO", description = "基础DTO")
public class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @ApiModelProperty(value="主键id")
    private String id;
    
	@ApiModelProperty(value="创建时间",example = "2018-08-18 18:18:18")
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	
	@ApiModelProperty(value="修改时间",example = "2018-08-18 18:18:18")
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
