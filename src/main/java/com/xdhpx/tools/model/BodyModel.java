package com.xdhpx.tools.model;

import java.io.Serializable;

/**
 * @ClassName: BodyModel
 * @Description: Body参数model类
 * @author 郝瑞龙
*/
public class BodyModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String  code;/**状态码**/
	private Object content;/**返回数据**/
	private String param;/**入参参数**/
	private String synCode;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getSynCode() {
		return synCode;
	}
	public void setSynCode(String synCode) {
		this.synCode = synCode;
	}
	
}
