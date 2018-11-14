package com.zhning.cloud.Controller;

import com.zhning.cloud.Util.MD5Mapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MD5 {


    @RequestMapping("/MD5test")
    public String dosm(String MD5) {
        System.out.println(MD5);
        if (MD5Mapper.MAP.containsKey(MD5))
            return "{'fast':'true'}";
        else
            return "{'fast':'false'}";
    }
}
