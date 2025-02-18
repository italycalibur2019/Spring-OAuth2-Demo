package com.italycalibur.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 调用接口
 * @author dhr
 * @date 2025-02-18 17:59:45
 * @version 1.0
 */
@RestController
public class ResourceController {

    @GetMapping(value = "/resources")
    public String[] getResources() {
        return new String[] {"Resource 1", "Resource 2", "Resource 3"};
    }
}

