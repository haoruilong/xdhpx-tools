package com.xdhpx.tools.utils;


import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {
	
    private static final String charset = "utf-8";

    /**
     * 	解密
     * @param data
     * @return
     */
    public static String decode(String data) {
        try {
            if (null == data) {
                return null;
            }
            
            return new String(Base64.decodeBase64(data.getBytes(charset)), charset);
        } catch (UnsupportedEncodingException e) {
            System.out.println("字符串：%s，解密异常！" + "_date:"+data +"_异常" + e);
        }

        return null;
    }

    /**
     * 加密
     * @param data
     * @return
     */
    public static String encode(String data) {
        try {
            if (null == data) {
                return null;
            }
            return new String(Base64.encodeBase64(data.getBytes(charset)), charset);
        } catch (UnsupportedEncodingException e) {
            System.out.println("字符串：%s，加密异常！" + "_date:"+data +"_异常" + e);
        }

        return null;
    }
    
    public static void main(String[] args) {
		String aString = "eyJib2R5Ijp7ImNvZGUiOm51bGwsImNvbnRlbnQiOm51bGwsInBhcmFtIjoie1wiYWxpYXNcIjpbXSxcInB1c2hNc2dNb2RlbFwiOm51bGwsXCJzaG9ydE1zZ01vZGVsXCI6e1wianNvbkNvbnRlbnRcIjpcIntcXFwiY29kZVxcXCI6XFxcIjEyM1xcXCJ9XCIsXCJtc2dTaWduXCI6XCLoh7TljLvkupHor4rlrqRcIixcIm91dElkXCI6bnVsbCxcInBob25lXCI6XCIxMzgxMDk0ODIxM1wiLFwidGVtcGxhdGVDb2RlXCI6XCJTTVNfMTI5NzQ4NDA0XCJ9LFwidGFnXCI6bnVsbCxcInRvcGljXCI6bnVsbH0iLCJzeW5Db2RlIjpudWxsfSwiaGVhZGVyIjp7ImNsaW5pY0lkIjpudWxsLCJjdXJyZW50VGltZSI6bnVsbCwiZG9jdG9yTWFpbklkIjpudWxsLCJpbWVpIjpudWxsLCJ0eXBlIjpudWxsLCJ1c2VyVG9rZW4iOm51bGwsInYiOm51bGx9fQ==";
		System.out.println(decode(aString));
    }

}
