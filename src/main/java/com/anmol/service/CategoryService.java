package com.anmol.service;

import com.anmol.entity.Category;
import com.anmol.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Transactional
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void insert(Category category) {
        categoryRepository.save(category);
    }


    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
    }

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void updateCategory(Category category) {

        categoryRepository.save(category);
    }

    public void deleteCategory(Category category) {

        categoryRepository.delete(category);
    }


}
