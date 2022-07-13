/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LocalLogoutSuccessHandler
 * Package: com.it.config
 * Description:
 *
 * @create: 2022-07-12 15:02
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
public class LocalLogoutSuccessHandler implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("msg", "注销成功！");
        ObjectMapper mapper = new ObjectMapper();
        String message = mapper.writeValueAsString(map);
        response.getWriter().write(message);
    }
}
