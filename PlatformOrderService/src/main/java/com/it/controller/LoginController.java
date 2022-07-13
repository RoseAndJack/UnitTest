/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.mapper.order.goodsbrand.GoodsBrandMapper;
import com.it.resultentity.GoodsBrandEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * ClassName: LoginController
 * Package: com.it.controller
 * Description:
 *
 * @create: 2022-07-12 11:06
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@RestController
public class LoginController {

    @Autowired
    private GoodsBrandMapper goodsBrandMapper;

    @RequestMapping("/doLogin")
    public String doLogin(HttpServletRequest request) {
        return "doLogin";
    }

    @RequestMapping("/index")
    public ResultEntity<List<GoodsBrandEntity>> index(Authentication authentication,@Autowired HttpServletRequest request) {
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(request);
        System.out.println(requestURL);
        System.out.println(authentication.isAuthenticated());
        System.out.println(authentication.getName());
        List<GoodsBrandEntity> goodsBrand = goodsBrandMapper.getBrandList();
        System.out.println(goodsBrand);
        return ResultEntityUtils.returnSuccess(goodsBrand);
    }

}
