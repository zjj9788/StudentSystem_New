package com.isoft.controllor;

import com.isoft.pojo.User;
import com.isoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserControllor {
    @Autowired
    UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public String login(User user) {

        boolean login = userService.login1(user);
        return String.valueOf(login);
    }

    @RequestMapping("/findAllUser.do")
    @ResponseBody
    public List findAllUser() {
        List<Map<String, Object>> allUser = userService.findAllUser();
        return allUser;
    }

    @RequestMapping("/deleteUserById.do")
    @ResponseBody
    public boolean deleteUserById(@RequestParam("id") String id) {
        System.out.println(id);
        boolean temp = userService.deleteUserById(id);
        return temp;
    }

    @RequestMapping("/addUserInfo.do")
    @ResponseBody
    public boolean addUserInfo(String uname, String runame, String role) {
        boolean b = userService.addUserInfo(uname, runame, role);
        return b;
    }

}
