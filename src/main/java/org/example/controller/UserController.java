package org.example.controller;

import com.mysql.cj.Session;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("loginPage")
    public String login() {
        return "login";
    }

    //    @RequestMapping("login")
//    @ResponseBody
//    public String login(String userName, String password) {
//        System.out.println(System.getProperty("file.encoding"));
//        String msg = "";
//        System.out.println("userName：" + userName + "       password：" + password);
//        if (userName != null && password != null) {
//            if (userService.queryUserByUserName(userName) != null) {
//                if ("123".equals(password)) {
//                    msg = "ok";
//                } else {
//                    msg = "error";
//                }
//            }
//        } else {
//            msg = "error";
//        }
//        return msg;
//    }
    @RequestMapping("login")
    public String login(HttpSession session, String userName, String password, Model model) {
        session.setAttribute("userLoginInfo", userName);
        model.addAttribute("aaa", userName);
        return "redirect:/book/allBook";
    }

    @RequestMapping("goOut")
    public String goOut(HttpSession session) {
        session.removeAttribute("userLoginInfo");
        return "redirect:/book/allBook";
    }
}