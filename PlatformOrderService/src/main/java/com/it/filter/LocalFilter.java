/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * ClassName: LocalFilter
 * Package: com.it.filter
 * Description:
 *
 * @create: 2022-07-26 15:22
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@WebFilter(filterName = "localFilter",urlPatterns = "/*")
public class LocalFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
