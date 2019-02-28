package com.xdhpx.tools.exception;
/**
  * @ClassName: BaseException
  * @Description: 自定义异常
  * @author 郝瑞龙
 */
public class BaseException extends Exception {

	private static final long serialVersionUID = -7068557153706428362L;

	public BaseException() {
		super();
	}

	/**
	  * <p>Title: </p>
	  * <p>Description: </p>
	  * @param message
	  * @param cause
	  * @param enableSuppression
	  * @param writableStackTrace
	  */
	
	public BaseException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	  * <p>Title: </p>
	  * <p>Description: </p>
	  * @param message
	  * @param cause
	  */
	
	public BaseException(String message, Throwable cause) {
		super(message, cause);
		
		// TODO Auto-generated constructor stub
	}

	/**
	  * <p>Title: </p>
	  * <p>Description: </p>
	  * @param message
	  */
	
	public BaseException(String message) {
		super(message);
		
		// TODO Auto-generated constructor stub
	}

	/**
	  *  SOAServiceException. 
	  * <p>Title: </p>
	  * <p>Description: </p>
	  * @param cause
	  */
	
	public BaseException(Throwable cause) {
		super(cause);
		
	}
	
	
}
