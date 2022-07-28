/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.filter.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: LocalServletRequestListener
 * Package: com.it.listener
 * Description:
 *
 * @create: 2022-07-27 11:22
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@WebListener
public class LocalServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {


    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();


        String method = request.getMethod();

//todo checkout a new branch.

    }
}
