// package com.student.rest.studentrestexample;

// import java.util.ArrayList;
// import java.util.List;

// public class StudentMockedData {
//   // list of blog posts
//   private List<Student> students;

//   private static StudentMockedData instance = null;

//   public static StudentMockedData getInstance() {
//     if (instance == null) {
//       instance = new StudentMockedData();
//     }
//     return instance;
//   }

//   public StudentMockedData() {
//     students = new ArrayList<Student>();
//     // students.add(new Student(1, "A", "one"));
//     // students.add(new Student(2, "B", "two"));
//     // students.add(new Student(3, "C", "three"));
//     // students.add(new Student(4, "D", "four"));
//     // students.add(new Student(5, "E", "five"));
    
//   }

//   // return all students
//   public List<Student> fetchStudents() {
//     return students;
//   }

//   // return blog by id
//   public Student getStudentById(int id) {
//     for (Student b : students) {
//       if (b.getId() == id) {
//         return b;
//       }
//     }
//     return null;
//   }

//   // search blog by text
//   public List<Student> searchStudents(String searchTerm) {
//     List<Student> searchedStudents = new ArrayList<Student>();
//     for (Student b : students) {
//       if (b.getName().toLowerCase().contains(searchTerm.toLowerCase())
//           || b.getContent().toLowerCase().contains(searchTerm.toLowerCase())) {
//         searchedStudents.add(b);
//       }
//     }

//     return searchedStudents;
//   }

//   // create blog
//   // public Student createStudent(int id, String name, String content) {
//   //   Student newStudent = new Student(name, content);
//   //   students.add(newStudent);
//   //   return newStudent;
//   // }

//   // update blog
//   public Student updateStudent(int id, String name, String content) {
//     for (Student b : students) {
//       if (b.getId() == id) {
//         int blogIndex = students.indexOf(b);
//         b.setName(name);
//         b.setContent(content);
//         students.set(blogIndex, b);
//         return b;
//       }

//     }

//     return null;
//   }

//   // delete blog by id
//   public boolean delete(int id) {
//     int blogIndex = -1;
//     for (Student s : students) {
//       if (s.getId() == id) {
//         blogIndex = students.indexOf(s);
//         continue;
//       }
//     }
//     if (blogIndex > -1) {
//       students.remove(blogIndex);
//     }
//     return true;
//   }

// }