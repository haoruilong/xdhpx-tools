package com.xdhpx.tools.enums;

/**
 * @ClassName: PushMsgTypeEnum 推送消息类型
 * @Description: 设备种类 1用户挤下线 2数据同步 3推送数据
 * @author 郝瑞龙
 */
public enum  PushMsgTypeEnum {

	IS_OFFLINE(1,"用户挤下线"),
	SYN_DATA(2,"数据同步"),
	PUSH_DATA(3,"推送数据"),
    ;

    private int  code;
    private String name;
    PushMsgTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static String getNameByCode(int code){
        PushMsgTypeEnum[] enums = 	PushMsgTypeEnum.values();
        for(PushMsgTypeEnum enu:enums){
            if(code == enu.getCode())
                return enu.getName();
        }
        return "";
    }
}