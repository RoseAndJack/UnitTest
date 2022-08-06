/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.controller;

import cn.shuibo.annotation.Encrypt;
import com.it.Service.goodsbrand.IGoodsBrandService;
import com.it.constant.Constant;
import com.it.mapper.order.PlatformBaseMapper;
import com.it.resultentity.GoodsBrandEntity;
import com.it.resultentity.ResultEntity;
import com.it.utils.ResultEntityUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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

    /**
     * origins:是允许访问的列表(origins=“网址”)
     * maxAge:准备响应前的 缓存持续的 最大时间
     *
     * @param request
     * @return
     */
    //@Decrypt
    @Encrypt
    @CrossOrigin(origins = "*", maxAge = 3600L)
    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public ResultEntity<Object> index() throws IOException {
        List<GoodsBrandEntity> list = goodsBrandService.getBrandList();
        File file = new File("D://test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.exists() && file.canRead()) {
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
        }
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String string = "input a value.";
            byte[] content = string.getBytes();
            for (byte b:content
                 ) {
                System.out.println((char)b);
            }
            outputStream.write(content);
            outputStream.write(56);
            System.out.println();
            outputStream.flush();
        } catch (Exception e) {
        }
        if (null != list) {
            return ResultEntityUtils.returnSuccess(list);
        }
        return ResultEntityUtils.returnFail(Constant.ERROR_CODE, "OK");
    }
}
