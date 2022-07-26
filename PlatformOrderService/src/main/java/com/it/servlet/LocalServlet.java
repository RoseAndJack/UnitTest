/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.servlet;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * ClassName: LocalServlet
 * Package: com.it.servlet
 * Description:
 *
 * @create: 2022-07-26 14:51
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Component(value = "localServlet")
public class LocalServlet extends DispatcherServlet {
    private transient ServletConfig servletConfig=super.getServletConfig();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public ServletContext getServletContext() {
        return servletConfig.getServletContext();
    }
}
