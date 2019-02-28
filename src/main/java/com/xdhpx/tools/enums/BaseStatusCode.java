package com.xdhpx.tools.enums;

public enum BaseStatusCode {
	
	/**通用错误码**/
	SUCESS							 	 ("2000000","操作成功"),
    FAIL  							 	 ("1111111","系统繁忙"),
    EMPTY_ERROR 						 ("2222222","非空为空"),
    FORMAT_ERROR						 ("3333333","格式错误"),

    ;


    private String code ;
    private String title;
    BaseStatusCode(String code, String title) {
        this.code = code;
        this.title = title;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return this.code + "_" + this.title;
    }
    public static String getNameByCode(String code){
    	BaseStatusCode[] enums = BaseStatusCode.values();
        for(BaseStatusCode enu:enums){
            if(code.equals(enu.getCode()))
                return enu.getTitle();
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(getNameByCode("2040101"));
    }

}
