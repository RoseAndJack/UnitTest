/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.exception;

import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * ClassName: BaseException
 * Package: com.xxx.exception
 * Description:基础异常类
 *
 * @create: 2022-03-22 08:53
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

/**
 * Controller里面的全局异常处理,定义出现异常后接口返回数据
 */

@ControllerAdvice(annotations = {RestController.class, Controller.class})
class ControllerGlobalExceptionHandler {

    public static final Logger log = LogManager.getLogger(ControllerGlobalExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultEntity handleException(Exception e) {
        log.error(e.getMessage());
        return ResultEntityUtils.returnFail(400, e.getMessage());
    }
}
