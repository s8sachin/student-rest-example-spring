package com.student.rest.studentrestexample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
  // custom query to search to blog post by title or content
  List<Student> findByNameContainingOrContentContaining(String text, String textAgain);
}
