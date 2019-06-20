package cm.lmc.aigou.web.controller;

import cm.lmc.aigou.common.AjaxResult;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){

        if("xxx".equals(user.getUsername())&"ooo".equals(user.getPassword())){
            return AjaxResult.succeed(null);
        }else {
            return AjaxResult.mistake("操作失败",null);
        }
    }
    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult tttt(){
        //select * from t_employee where username ="xxx" and password ="xxxooo"
        //组null的判断

        return AjaxResult.succeed(null);
    }
}
