/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: OrderTest
 * Package: PACKAGE_NAME
 * Description:Order测试类
 *
 * @create: 2022-03-24 10:01
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestOrder {

    @Test
    public void test() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("admin");
    }
}

