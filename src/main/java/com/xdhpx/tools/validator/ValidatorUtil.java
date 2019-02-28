package com.xdhpx.tools.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @ClassName: ValidatorUtil
 * @Description: 校验工具类
 * @author 郝瑞龙
*/
public class ValidatorUtil {
	
    private static Validator validator;
    
    static {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public static <T> ValidateResult validator(T object) {
    	
    	/**空校验**/
        if (null == object) {
            return new ValidateResult(false,new String[]{"校验的对象不可为空"});
        }
        
        /**数据校验**/
        Set<ConstraintViolation<T>> violations = validator.validate(object);
        int errSize = violations.size();
        /**声明错误信息数组**/
        String[] errMsg = new String[errSize];
        boolean result = true;
        if (errSize > 0) {
            int i = 0;
            for (ConstraintViolation<T> violation : violations) {
                errMsg[i] = violation.getMessage();
                i++;
            }
            result = false;
        }
        
        return new ValidateResult(result, errMsg);
    }
}
