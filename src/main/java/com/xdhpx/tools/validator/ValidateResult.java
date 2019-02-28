package com.xdhpx.tools.validator;

import java.util.Arrays;

/**
 * @ClassName: ValidateResult
 * @Description: 校验结果Model
 * @author 郝瑞龙
*/
public class ValidateResult {
	
    private boolean result = false; /**校验结果**/

    private String[] errMsg; /**错误信息**/

    public ValidateResult(boolean result, String[] errMsg) {
        this.result = result;
        this.errMsg = errMsg;
    }


    public boolean getResult() {
        return result;
    }

    public String[] getErrMsg() {
        return errMsg;
    }


    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ValidateResult [result=" + result +", errMsg=" + Arrays.toString(errMsg) + "]";
    }
}