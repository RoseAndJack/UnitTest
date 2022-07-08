/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * ClassName: LocalApplicationAware
 * Package: com.it.config
 * Description:
 *
 * @create: 2022-05-10 10:08
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Component
public class LocalApplicationAware implements ApplicationContextAware {

    private static ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        this.init();
    }

    public void init() {
        if (null != applicationContext) {


            {
                int a=12;
                {

                    int b =14;
                }
            }
        }
    }

    /**
     * 获取spring中的bean
     *
     * @param id
     * @return
     */
    public static Object getBean(String id) {
        return applicationContext.getBean(id);
    }
}
