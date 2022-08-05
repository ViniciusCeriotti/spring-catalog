// Camada de serviço

package com.ceriotti.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceriotti.catalog.entities.Category;
import com.ceriotti.catalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true)
	public List<Category> findAll() {
		return repository.findAll();
	}

}
