package com.bamdule.travelMap.controller;

import com.bamdule.travelMap.db.service.UserService;
import com.bamdule.travelMap.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author MW
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private UserService userService;
    
    @GetMapping(value = "/")
    public String homeView() {
        logger.info("[MYTEST] homeView");
        return "page/main";
    }
}
