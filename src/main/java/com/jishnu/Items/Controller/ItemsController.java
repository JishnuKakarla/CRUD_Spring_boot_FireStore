package com.jishnu.Items.Controller;

import java.util.Map;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.cloud.firestore.WriteResult;
import com.jishnu.Items.Service.ItemService;
import com.jishnu.Items.model.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ItemsController {

    @Autowired
    ItemService itemService;

    @GetMapping(value = "hello")
    String hello(){
        return "Hello, World";
    }

    @GetMapping(value = "getall")
    Map<String,Items> getall() throws InterruptedException, ExecutionException{
        return itemService.getAllItems();
    }

    @PostMapping(value = "add")
    String add(@RequestBody Items item) throws InterruptedException, ExecutionException{
        System.out.println(item.toString());
        return itemService.addItem(item);
    }

    @GetMapping(value = "getbyid/{Id}")
    Map<String, Object> getById(@PathVariable String Id) throws InterruptedException, ExecutionException{
        return itemService.getById(Id);
    }

    @PutMapping(value = "update/{Id}")
    Map<String, Object> update(@PathVariable String Id,@RequestBody Items item) throws InterruptedException, ExecutionException{
        return itemService.update(Id,item);
    }

    @DeleteMapping(value = "deletebyid/{Id}")
    WriteResult delete(@PathVariable String Id) throws InterruptedException, ExecutionException {
        return itemService.delete(Id);
    }

    @GetMapping(value = "grt/{price1}")
    List<String> greaterthan(@PathVariable int price1) throws InterruptedException, ExecutionException{
        return itemService.greater(price1);
    }

    @GetMapping(value = "less/{price1}")
    List<String> lessthan(@PathVariable int price1) throws InterruptedException, ExecutionException{
        return itemService.lesser(price1);
    }
}
