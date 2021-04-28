package com.anmol.controller;

import com.anmol.entity.TheLogConverter;
import com.anmol.entity.Category;
import com.anmol.service.CategoryLogService;
import com.anmol.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;
    @Autowired
    private CategoryLogService categoryLogService;

    @RequestMapping("")
    public Iterable<Category> getAllCategory() {
        return categoryService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Category> searchCategory(@PathVariable int id) {
        return categoryService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addCategory(@RequestBody Category category) {
        categoryService.insert(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteCategory(@RequestBody Category category) {
        categoryService.deleteCategory(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }


}
