package com.xdhpx.tools.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * @ClassName: PushMsgModel
 * @Description: 推送消息模版
 * @author 郝瑞龙
 */
@ApiModel(value = "PushMsgModel", description = "推送消息模版")
public class PushMsgModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "消息类型码")
    private String typeCode ;

    @ApiModelProperty(value = "推送内容:json格式字符串")
    private String data ;


    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}

