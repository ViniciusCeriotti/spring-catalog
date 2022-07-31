// Camada de acesso a dados

package com.ceriotti.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceriotti.catalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
