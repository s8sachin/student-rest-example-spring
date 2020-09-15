package com.student.rest.studentrestexample;

import java.util.List;
import java.util.Map;

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

  StudentMockedData studentMockedData = StudentMockedData.getInstance();

  @GetMapping("/students")
  public ResponseEntity<List<Student>> index(){
    List<Student> students = studentMockedData.fetchStudents();
    return ResponseEntity.status(HttpStatus.OK).body(students);
}

  @GetMapping("/students/{id}")
  public Student show(@PathVariable String id) {
    int studentId = Integer.parseInt(id);
    return studentMockedData.getStudentById(studentId);
  }

  @PostMapping("/students/search")
  public List<Student> search(@RequestBody Map<String, String> body) {
    String searchTerm = body.get("text");
    return studentMockedData.searchStudents(searchTerm);
  }

  @PostMapping("/students")
  public Student create(@RequestBody Map<String, String> body) {
    int id = Integer.parseInt(body.get("id"));
    String title = body.get("title");
    String content = body.get("content");
    return studentMockedData.createStudent(id, title, content);
  }

  @PutMapping("/students/{id}")
  public Student update(@PathVariable String id, @RequestBody Map<String, String> body) {
    int studentId = Integer.parseInt(id);
    String title = body.get("title");
    String content = body.get("content");
    return studentMockedData.updateStudent(studentId, title, content);
  }

  @DeleteMapping("students/{id}")
  public boolean delete(@PathVariable String id) {
    int studentId = Integer.parseInt(id);
    return studentMockedData.delete(studentId);
  }

}
