/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service.order;

import com.it.mapper.order.OrderMapper;
import com.it.resultentity.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: IOrderServiceImpl
 * Package: com.it.Service.order
 * Description:
 *
 * @create: 2022-03-25 16:10
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

/*
        1.接口中A、B两个方法，A无@Transactional标签，B有，上层通过A间接调用B，此时事务不生效。

        2.接口中异常（运行时异常）被捕获而没有被抛出。
        默认配置下，spring 只有在抛出的异常为运行时 unchecked 异常时才回滚该事务，
        也就是抛出的异常为RuntimeException 的子类(Errors也会导致事务回滚)，
        而抛出 checked 异常则不会导致事务回滚 。可通过 @Transactional rollbackFor进行配置。

        3.多线程下事务管理因为线程不属于 spring 托管，故线程不能够默认使用 spring 的事务,
        也不能获取spring 注入的 bean 。
        在被 spring 声明式事务管理的方法内开启多线程，多线程内的方法不被事务控制。
        一个使用了@Transactional 的方法，如果方法内包含多线程的使用，方法内部出现异常，
        不会回滚线程中调用方法的事务。
 */

@Service
@Transactional(rollbackFor = {Exception.class})
public class IOrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order queryOrderDataById(Integer id) {
        return orderMapper.queryOrderDataById(id);
    }
}
