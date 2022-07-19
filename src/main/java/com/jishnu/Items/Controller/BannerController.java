package com.jishnu.Items.Controller;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.jishnu.Items.Service.BannerService;
import com.jishnu.Items.model.Banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/banner")
public class BannerController {
    
    @Autowired
    BannerService bannerService;

    @GetMapping(value = "hello")
    String hello(){
        return "Hello, World";
    }

    @GetMapping(value = "getall")
    Map<String,Banner> getall() throws InterruptedException, ExecutionException{
        return bannerService.getAllBanner();
    }

    @PostMapping(value = "add")
    String add(@RequestBody Banner banner) throws InterruptedException, ExecutionException{
        return bannerService.addItem(banner);
    }
}
