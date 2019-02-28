package com.xdhpx.tools.utils;

import java.util.UUID;

/**
  * @ClassName: UUIDUtil
  * @Description: uuid工具类,去掉"-"
  * @author 郝瑞龙
 */
public class UUIDUtil {
	public static String uuid(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
