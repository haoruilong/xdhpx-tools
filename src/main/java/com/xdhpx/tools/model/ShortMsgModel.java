package com.xdhpx.tools.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: ShortMsgModel
 * @Description: 短信模版
 * @author 郝瑞龙
 */
@ApiModel(value = "ShortMsgModel", description = "短信模版")
public class ShortMsgModel implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "必填:接受者手机号")
    private String phone ;
    
    @ApiModelProperty(value = "必填:短信签名")
    private String msgSign ;
    
    @ApiModelProperty(value = "必填:短信模板code")
    private String templateCode ;
    
    @ApiModelProperty(value = "可选:模板中的变量替换JSON串")
    private String jsonContent ;
    
    @ApiModelProperty(value = "可选:outId为提供给业务方扩展字段")
    private String outId ;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMsgSign() {
		return msgSign;
	}

	public void setMsgSign(String msgSign) {
		this.msgSign = msgSign;
	}

	public String getTemplateCode() {
		return templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getJsonContent() {
		return jsonContent;
	}

	public void setJsonContent(String jsonContent) {
		this.jsonContent = jsonContent;
	}

	public String getOutId() {
		return outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
	}
	

}

