/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LocalAuthenticationFailureHandler
 * Package: com.it.config
 * Description:
 *
 * @create: 2022-07-12 13:41
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

public class LocalAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        Map<String, Object> map = new HashMap<>();
        map.put("status", 500);
        map.put("msg", "登录失败！" + exception.getMessage());
        ObjectMapper mapper = new ObjectMapper();
        String message = mapper.writeValueAsString(map);
        response.getWriter().write(message);
    }
}
