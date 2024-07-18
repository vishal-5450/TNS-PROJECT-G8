package com.tnsif.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.shoppingmall.entity.MallAdmin;
import com.tnsif.shoppingmall.services.IMallAdminService;

import java.util.List;

@RestController
@RequestMapping("/malladmins")
public class IMallAdminController {

    @Autowired
    private IMallAdminService mallAdminService;

    @PostMapping("/add")
    public void addMallAdmin(@RequestBody MallAdmin mallAdmin) {
        mallAdminService.addMallAdmin(mallAdmin);
    }

    @GetMapping("/{id}")
    public MallAdmin getMallAdminById(@PathVariable int id) {
        return mallAdminService.searchMallAdmin(id);
    }

    @PutMapping("/{id}")
    public void updateMallAdmin(@RequestBody MallAdmin mallAdmin, @PathVariable int id) {
        mallAdminService.updateMallAdmin(mallAdmin, id);
    }

    @DeleteMapping("/{id}")
    public void deleteMallAdmin(@PathVariable int id) {
        mallAdminService.deleteMallAdmin(id);
    }

    // You can add more methods as needed

}
