package com.muchi.controller;

import com.muchi.domain.Items;
import com.muchi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/showDetail")
    public String showDetail(Model model){
        Items items = itemService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
