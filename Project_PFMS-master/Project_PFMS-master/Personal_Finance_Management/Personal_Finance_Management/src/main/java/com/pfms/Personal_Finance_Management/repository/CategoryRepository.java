package com.pfms.Personal_Finance_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pfms.Personal_Finance_Management.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	@Query("select c.category from Category c")
	public List<String> getOnlyCategories();

	@Query("select c.categoryId from Category c where c.category = :category")
	public int getIdForCategory(@Param("category") String category);

	public Category findByCategory(String category);

	Category findOne(int id);


	@Query("SELECT c.category, SUM(e.amount) FROM Category c, Expense e WHERE c.categoryId = e.categoryId GROUP BY c.category")
	public List<Object[]> getPieData();




	
	

}
