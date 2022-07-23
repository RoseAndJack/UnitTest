///**************************************************************************************
// *                               @湖南千金医药股份有限公司                                 *
// *                                  @版权所有翻版必究                                    *
// * ************************************************************************************/
//
//package com.it.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.core.Authentication;
////import org.springframework.security.core.GrantedAuthority;
////import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
///**
// * ClassName: UserController
// * Package: com.it.controller
// * Description:
// *
// * @create: 2022-07-12 15:05
// * @author: fengwensdl@qq.com
// * @version: 1.0.0
// */
//@RestController
//public class UserController {
//    @GetMapping("/user")
//    public void userInfo(@Autowired Authentication auto) {
//        boolean authenticated = auto.isAuthenticated();
//        if (authenticated) {
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
//            for (GrantedAuthority authority : authorities) {
//                System.out.println(authority.getAuthority());
//            }
//        }
//    }
//}
