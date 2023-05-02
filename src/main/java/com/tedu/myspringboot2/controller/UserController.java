package com.tedu.myspringboot2.controller;

import com.tedu.myspringboot2.etity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/regUser")
//    public void reg(HttpServletRequest request, HttpServletResponse response){
/**将表单参数直接作为方法参数即可
 * 类型可以自动转换*/
//        public void reg(String username,String password,String nickname,
//                        int age,HttpServletResponse response){
    public void reg(User user,HttpServletResponse response){

       //获取表单信息
//        String username=request.getParameter("username");
//        String password=request.getParameter("password");
//        String nickname=request.getParameter("nickname");
//        String age=request.getParameter("age");

//        System.out.println(username+","+password+","+nickname+","+age);
//
//       int a=Integer.parseInt(age);

//        User user=new User(username,password,nickname,age);
        System.out.println(user);
    }
}
