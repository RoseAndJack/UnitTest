/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;

/**
 * ClassName: AplicationConfig
 * Package: com.it.config
 * Description:
 *
 * @create: 2022-07-12 13:15
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
@Order(value = 1)
@Configuration
public class ApplicationConfig extends DispatcherServlet implements WebMvcConfigurer {


    @Bean(value = {"passwordEncoder"})
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean(value = {"roleHierarchy"})
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl hierarchy = new RoleHierarchyImpl();
        hierarchy.setHierarchy("admin>do_update>do=do_inert=do_delete");
        return hierarchy;
    }

    @Bean(value = {"sqlSession"})
    public SqlSession session(@Autowired SqlSessionFactory sqlSessionFactory) throws IOException {
        ClassPathResource resource =new ClassPathResource("");
        return sqlSessionFactory.openSession();
    }

    /**
     * 配置资源文件访问器
     * @param path
     * @return
     */
    @Bean(value = {"classPathResource"})
    public Resource classPathResource(@Value("${platformorderservice.classpathdir}")String path){
        ClassPathResource resource =new ClassPathResource(path);
        return  resource;
    }


    @Bean(value = {"rabbitmqQueue"})
    public Queue rabbitmqQueue(){
        return new Queue("rabbit_test_queue");
    }
    /**
     * 配置可访问静态路径
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/META-INF/resources/");
    }
}
