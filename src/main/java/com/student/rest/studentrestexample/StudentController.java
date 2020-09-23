package com.student.rest.studentrestexample;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  // StudentMockedData studentMockedData = StudentMockedData.getInstance();
  @Autowired
  StudentRepository studentRespository;

  @GetMapping("/students")
  public ResponseEntity<?> index(){
    List<Student> students = studentRespository.findAll();
    return ResponseEntity.status(HttpStatus.OK).body(students);
  }

  @GetMapping("/students/{id}")
  public Student show(@PathVariable String id) {
    int studentId = Integer.parseInt(id);
    return studentRespository.findById(studentId).get();
  }

  @PostMapping("/students/search")
  public List<Student> search(@RequestBody Map<String, String> body) {
    String searchTerm = body.get("text");
    return studentRespository.findByNameContainingOrContentContaining(searchTerm, searchTerm);
  }

  @PostMapping("/students")
  public Student create(@RequestBody Map<String, String> body) {
    // int id = Integer.parseInt(body.get("id"));
    String name = body.get("name");
    String content = body.get("content");
    return studentRespository.save(new Student(name, content));
  }

  @PutMapping("/students/{id}")
  public Student update(@PathVariable String id, @RequestBody Map<String, String> body) {
    int studentId = Integer.parseInt(id);
    Student student = studentRespository.findById(studentId).get();
    student.setName(body.get("name"));
    student.setContent(body.get("content"));
    return studentRespository.save(student);
  }

  @DeleteMapping("students/{id}")
  public boolean delete(@PathVariable String id) {
    int studentId = Integer.parseInt(id);
    studentRespository.deleteById(studentId);
    return true;
  }

}
