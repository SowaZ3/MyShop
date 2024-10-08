package com.MyShop.MyShop.controller;

import com.MyShop.MyShop.model.Item;
import com.MyShop.MyShop.repository.ItemRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

@Controller
public class HomeController {
    private final ItemRepository itemRepository;
    @Autowired
    public HomeController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @GetMapping("/")
    public String home(Model model, HttpSession httpSession) {
        model.addAttribute("items", itemRepository.findAll());
        return "home";
    }
}
