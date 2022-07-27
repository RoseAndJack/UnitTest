/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.filter.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LocalApplicationContextListener
 * Package: com.it.listener
 * Description:
 *
 * @create: 2022-07-27 11:13
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@WebListener
public class LocalApplicationContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        Map map=new HashMap();
        map.put("China","ch_zn");
        map.put("America","us");
        servletContext.setAttribute("country_language",map);
        ServletContextListener.super.contextInitialized(sce);
    }
}
