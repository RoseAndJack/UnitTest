/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.filter.listener;

import com.it.resultentity.GoodsBrandEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName: RabbitMqListener
 * Package: com.it.listener
 * Description:
 *
 * @create: 2022-07-15 14:51
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Component(value = "rabbitMqListener")
@RabbitListener(queues = {"rabbit_test_queue"})
public class RabbitMqListener {

    private final static Logger log = LogManager.getLogger(RabbitMqListener.class);

   // @RabbitHandler(isDefault = true)
    public void consume(GoodsBrandEntity message) {
        log.info("message from queue ：" + message);
        System.out.println(message.hashCode());
    }
}
