package com.zgd.controller;

import com.zgd.bean.Food;
import com.zgd.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @RestController是@Controller和@ResponseBody的组合
 * 返回json形式的相应结果，而不是视图(jsp,html...)
 */
@RestController
public class JsonController {

    /**
     * food.rice=rice
     * food.meat=meat
     * @Value通过${}结构获得配置文件中的属性值
     */
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json() {
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
