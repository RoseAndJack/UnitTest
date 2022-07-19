/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

/**
 * ClassName: ApplicationSecurityConfig
 * Package: com.it.config
 * Description:
 *
 * @create: 2022-07-12 09:14
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */

@Configuration
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
         auth.userDetailsService(null);
    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/Login.html")
                .loginProcessingUrl("/doLogin")
                .defaultSuccessUrl("/index")
               // .failureUrl("/Login.html")
                .successHandler(new LocalAuthenticationSuccessHandler())
                .failureHandler(new LocalAuthenticationFailureHandler())
                .usernameParameter("uname")
                .passwordParameter("passwd")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutSuccessHandler(new LocalLogoutSuccessHandler())
                ///.logoutSuccessUrl("/Login.html")//指定注销成功后的跳转地址
                .and()
                .csrf()
                .disable();
            }

    SimpleUrlAuthenticationFailureHandler failureHandler() {
        SimpleUrlAuthenticationFailureHandler handler = new SimpleUrlAuthenticationFailureHandler("/mylogin.html");
        handler.setUseForward(true);
        return handler;
    }

}
