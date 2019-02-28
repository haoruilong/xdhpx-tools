package com.xdhpx.tools.model;

import java.io.Serializable;

/**
 * @ClassName: ParamModel
 * @Description: 出入参数model类
 * @author 郝瑞龙
*/
public class ParamModel implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private HeaderModel header;
	private BodyModel body;
	
	public HeaderModel getHeader() {
		return header;
	}
	public void setHeader(HeaderModel header) {
		this.header = header;
	}
	public BodyModel getBody() {
		return body;
	}
	public void setBody(BodyModel body) {
		this.body = body;
	}

	
}

