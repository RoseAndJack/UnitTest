/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: LocalFilter
 * Package: com.it.filter
 * Description:
 *
 * @create: 2022-07-26 15:22
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@WebFilter(filterName = "localFilter",
        urlPatterns = {"/*"},
        initParams = {@WebInitParam(name = "logFileName", value = "log.txt")})
public class LocalFilter implements Filter {
    private transient FilterConfig filterConfig;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        System.out.println("doFilter-----------------------------------------------");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        lock.lock();
        try {

            filterConfig.getInitParameter("logFileName");

        } catch (Exception e) {

        } finally {
            try {
                filterChain.doFilter(servletRequest, servletResponse);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ServletException e) {
                e.printStackTrace();
            }
            lock.unlock();
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("filter has been destroy.");
    }
}
