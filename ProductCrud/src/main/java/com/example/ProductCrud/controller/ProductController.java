package com.example.ProductCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.ProductCrud.domain.Product;
import com.example.ProductCrud.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
    private ProductService service;
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Product> listproduct = service.listAll();
        model.addAttribute("listproduct", listproduct);
        System.out.print("Get / ");
        return "index";
    }
 
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("student") Product std) {
        service.save(std);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Product std = service.get(id);
        mav.addObject("product", std);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deleteproduct(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }

}
