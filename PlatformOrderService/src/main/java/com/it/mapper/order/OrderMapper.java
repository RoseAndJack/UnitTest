/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.mapper.order;

import com.it.resultentity.order.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: OrderMaper
 * Package: com.it.mapper.order
 * Description:OrderMapper接口
 *
 * @create: 2022-03-25 16:07
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Mapper
public interface OrderMapper {
    Order queryOrderDataById(Integer id);
}
