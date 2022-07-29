/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.Service.order.IOrderService;
import com.it.resultentity.ResultEntity;
import com.it.resultentity.order.Order;
import com.it.utils.ResultEntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    private final Logger log = LogManager.getLogger(OrderController.class);

    @Autowired
    private IOrderService orderService;


    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
    public ResultEntity<Order> index(@PathVariable(value = "id") String id) {
        log.info("param id ===> " + id);
        Order order = orderService.queryOrderDataById(Integer.parseInt(id));
        return ResultEntityUtils.returnSuccess(order);
    }
}
