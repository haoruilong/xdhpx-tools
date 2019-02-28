package com.xdhpx.tools.model;

import com.xdhpx.tools.enums.BaseStatusCode;

public class ResponseBodyModel extends BodyModel{

	private static final long serialVersionUID = 1L;

	/**
     * 失败
     * @return
     */
    public static ResponseBodyModel fail(){
        ResponseBodyModel rbm = new ResponseBodyModel();
        rbm.setCode(BaseStatusCode.FAIL.getCode());
        rbm.setContent(BaseStatusCode.FAIL.getTitle());
        return rbm;
    }
    
    public static ResponseBodyModel fail(String code){
        ResponseBodyModel rbm = new ResponseBodyModel();
        rbm.setCode(code);
        return rbm;
    }

    public static ResponseBodyModel fail(String code,Object data){
        ResponseBodyModel rbm = new ResponseBodyModel();
        rbm.setCode(code);
        rbm.setContent(data);
        return rbm;
    }

    /**
     * 成功
     * @return
     */
    public static ResponseBodyModel success(){
        ResponseBodyModel rbm = new ResponseBodyModel();
        rbm.setCode(BaseStatusCode.SUCESS.getCode());
        return rbm;
    }
    public static ResponseBodyModel success(Object data){
        ResponseBodyModel rbm = new ResponseBodyModel();
        rbm.setCode(BaseStatusCode.SUCESS.getCode());
        rbm.setContent(data);
        return rbm;
    }
    public static ResponseBodyModel success(Object data,String synCode){
        ResponseBodyModel rbm = new ResponseBodyModel();
        rbm.setCode(BaseStatusCode.SUCESS.getCode());
        rbm.setContent(data);
        rbm.setSynCode(synCode);
        return rbm;
    }


    public static ResponseBodyModel analyseException(Exception e){
        String message = e.getMessage();
        try {
            String apiStatusCode = message.substring(message.lastIndexOf(":")+1,message.length()).trim();
            if(apiStatusCode.length()!=7){
                return fail();
            }else {
                return fail(apiStatusCode);
            }
        }catch (Exception e2) {
            return fail();
        }

    }


}