/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.utils;

import com.it.ResultContant.ResultConstant;
import com.it.resultentity.ResultEntity;

/**
 * ClassName: ResultEntityUtils
 * Package: com.xxx.utils
 * Description:
 *
 * @create: 2022-03-22 14:05
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
public class ResultEntityUtils {

    public static ResultEntity returnSuccess(Object data) {
        ResultEntity entity = new ResultEntity();
        entity.setCode(ResultConstant.SUCCESS);
        entity.setMessage("success");
        entity.setData(data);
        return entity;
    }

    public static ResultEntity returnFail(int code, String message) {
        ResultEntity entity = new ResultEntity();
        entity.setCode(code);
        entity.setMessage(message);
        return entity;

    }
}
