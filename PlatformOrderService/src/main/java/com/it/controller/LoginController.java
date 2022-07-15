/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.mapper.order.goodsbrand.GoodsBrandMapper;
import com.it.resultentity.GoodsBrandEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
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
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @RequestMapping(value = "/doLogin")
    public String doLogin(HttpServletRequest request) {
        return "doLogin";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ResultEntity<Object> index(Authentication authentication,@Autowired HttpServletRequest request) throws SQLException {
        List<GoodsBrandEntity> goodsBrand = goodsBrandMapper.getBrandList();
        return ResultEntityUtils.returnSuccess("OK");
    }
}
