/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.it.Service.order.IOrderService;
import com.it.resultentity.ResultEntity;
import com.it.resultentity.order.Order;
import com.it.utils.ResultEntityUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: OrderController
 * Package: com.it.controller
 * Description:Order控制器
 *
 * @create: 2022-03-23 11:39
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    private Logger log = LogManager.getLogger(OrderController.class);

    @Autowired
    private IOrderService orderService;

    /**
     * @param id
     * @return
     * @throws JsonProcessingException
     */
    @ResponseBody
    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
    public ResultEntity<Order> index(@PathVariable(value = "id") String id) throws JsonProcessingException {
        log.info("param id ===> "+id);
        log.info("web hook for our system.");
        Order order = orderService.queryOrderDataById(Integer.parseInt(id));
        return ResultEntityUtils.returnSuccess(order);
    }
}
