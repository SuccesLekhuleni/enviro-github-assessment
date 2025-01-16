package com.enviro.assessment.grad001.succeslekhuleni.demo.repo;

import com.enviro.assessment.grad001.succeslekhuleni.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
}
