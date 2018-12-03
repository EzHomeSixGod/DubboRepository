package com.ezhomesixgod.service.impl;

import com.ezhomesixgod.service.DemoService;

/**
 * @author renyang
 * @description
 * @createTime 2018-11-30 9:43
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "provider-"+name;
    }
}
