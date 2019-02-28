package com.xdhpx.tools.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class FastJsonUtil {

    private static SerializeConfig config  = new SerializeConfig();

    private static String dateFormat;
    static {
        dateFormat = "yyyy-MM-dd HH:mm:ss";
        config .put(Date.class, new SimpleDateFormatSerializer(dateFormat));
    }

    private static final SerializerFeature[] features = {SerializerFeature.WriteMapNullValue, // 输出空置字段
            SerializerFeature.WriteNullListAsEmpty, // list字段如果为null，输出为[]，而不是null
//            SerializerFeature.WriteNullNumberAsZero, // 数值字段如果为null，输出为0，而不是null
//            SerializerFeature.WriteNullBooleanAsFalse, // Boolean字段如果为null，输出为false，而不是null
//            SerializerFeature.WriteNullStringAsEmpty // 字符类型字段如果为null，输出为""，而不是null
    };

    public static String toJSONString(Object object) {
        return JSON.toJSONString(object, config, features);
    }
    public static String toJSONNoFeatures(Object object) {
        return JSON.toJSONString(object, config);
    }

    public static Object toBean(String text) {
        return JSON.parse(text);
    }

    public static <T> T toBean(String text, Class<T> clazz) {
        return JSON.parseObject(text, clazz);
    }

    /**转换为数组**/
    public static <T> Object[] toArray(String text) {
        return toArray(text, null);
    }
    public static <T> Object[] toArray(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz).toArray();
    }

    /**转换为List**/
    public static <T> List<T> toList(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz);
    }

    /**将string转化为序列化的json字符串**/
    public static Object textToJson(String text) {
        Object objectJson  = JSON.parse(text);
        return objectJson;
    }

    /**将map转化为string**/
    @SuppressWarnings("rawtypes")
	public static String collectToString(Map m) {
        String s = JSONObject.toJSONString(m);
        return s;
    }
    /**json字符串转化为map**/
    @SuppressWarnings("rawtypes")
	public static Map stringToCollect(String s) {
        Map m = JSONObject.parseObject(s);
        return m;
    }

}
