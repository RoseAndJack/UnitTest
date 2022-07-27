/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import com.it.Service.goodsbrand.IGoodsBrandService;
import com.it.mapper.order.PlatformBaseMapper;
import com.it.resultentity.GoodsBrandEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
public class LoginController extends BaseController {

    @Autowired
    private IGoodsBrandService goodsBrandService;
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    @Autowired
    PlatformBaseMapper<GoodsBrandEntity> platformBaseMapper;
    private Logger log = LogManager.getLogger(LoginController.class);

    @RequestMapping(value = "/doLogin")
    public String doLogin(HttpServletRequest request) {
      return "doLogin";
    }

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public ResultEntity<Object> index(@Autowired HttpServletRequest request) throws InterruptedException {
        goodsBrandService.getBrandList();
        return ResultEntityUtils.returnSuccess("OK");
    }
}
