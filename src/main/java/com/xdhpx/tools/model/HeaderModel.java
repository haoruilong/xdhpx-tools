package com.xdhpx.tools.model;

import java.io.Serializable;

/**
 * @ClassName: HeaderModel
 * @Description: Header参数model类
 * @author 郝瑞龙
*/
public class HeaderModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String clinicId;/**诊所id**/
	private String doctorMainId;/**管理员id**/
	private String imei;/**imei码**/
	private String type;/**客户端类型  1.ios平板，2.android，3.一体机，4.PC  5:AI 小鱼**/
	private String v;/**当前版本号**/
	private String currentTime;/**时间戳**/
	private String userToken;/**用户Token**/

	public String getClinicId() {
		return clinicId;
	}

	public void setClinicId(String clinicId) {
		this.clinicId = clinicId;
	}

	public String getDoctorMainId() {
		return doctorMainId;
	}

	public void setDoctorMainId(String doctorMainId) {
		this.doctorMainId = doctorMainId;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
}