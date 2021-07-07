package com.woniu.test0705.controller;

import com.woniu.test0705.entity.User;
import com.woniu.test0705.service.BeginService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create on 2021/7/5
 *
 * @author eli
 * @date 2021年07月05日13:57
 * @Description:
 */
@RestController
public class BeginController {

    @Resource
    private BeginService beginService;

    @GetMapping("/")
    public String test1(){
        return "hahahah";
    }

    @GetMapping("/list")
    public List<User> test2(){
        List<User> list=beginService.userList();
        return list;
    }

    @GetMapping("/findOne/{uid}")
    public User findOne(@PathVariable Integer uid){
        User user=beginService.findOne(uid);
        return user;
    }

    @GetMapping("/addUser/{uname}/{upwd}")
    public Map<Object, Object> addUser(@PathVariable String uname,@PathVariable String upwd){
        Map<Object, Object> map = new HashMap<>();
        System.out.println("BeginController.addUser");
        System.out.println("BeginController.addUser");
        try {
            User user = new User();
            user.setUname(uname);
            user.setUpwd(upwd);
            beginService.addUser(user);
            map.put("result",true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @GetMapping("/updateUser/{uid}/{uname}/{upwd}")
    public Map<Object, Object> updateUser(@PathVariable Integer uid,@PathVariable String uname,@PathVariable String upwd){
        Map<Object, Object> map = new HashMap<>();
        try {
            User user = new User();
            user.setUid(uid);
            user.setUname(uname);
            user.setUpwd(upwd);
            beginService.update(user);
            map.put("result",true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

}
