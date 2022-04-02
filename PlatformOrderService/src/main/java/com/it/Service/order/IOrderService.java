/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.Service.order;

import com.it.resultentity.order.Order;

/**
 * ClassName: IOrderService
 * Package: com.it.Service.order
 * Description:
 *
 * @create: 2022-03-25 16:09
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
public interface IOrderService {

    Order queryOrderDataById(Integer id);
}
