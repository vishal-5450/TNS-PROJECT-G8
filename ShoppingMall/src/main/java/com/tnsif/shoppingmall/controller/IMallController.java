package com.tnsif.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.shoppingmall.entity.Mall;
import com.tnsif.shoppingmall.services.IMallService;


@RestController
@RequestMapping("/malls")
public class IMallController {

    @Autowired
    private IMallService mallService;

    @PostMapping("/add")
    public void addMall(@RequestBody Mall mall) {
        mallService.addMall(mall);
    }

    @GetMapping("/{id}")
    public Mall getMallById(@PathVariable int id) {
        return mallService.searchMall(id);
    }

    @PutMapping("/{id}")
    public void updateMall(@RequestBody Mall mall, @PathVariable int id) {
        mallService.updateMall(mall, id);
    }

    // Add more methods as needed (e.g., delete, get all)

}
