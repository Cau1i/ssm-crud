package org.example.controller;

import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("login")
    public String login(User user, Model model) {
        String msg = "";
        String re = "";
        System.out.println("user" + user);
        User user1 = userService.queryUserByUser(user.getUserName(), user.getPassword());
        System.out.println("user1=" + user1);
        if (user1.getUserName() != null) {
            msg = "ok";
            re = "redirect:/book/allBook";

        } else {
            msg = "’À∫≈√‹¬Î”–ŒÛ";
            re = "redirect:/index.jsp";
        }
        model.addAttribute("msg", msg);
        return re;
    }

}
