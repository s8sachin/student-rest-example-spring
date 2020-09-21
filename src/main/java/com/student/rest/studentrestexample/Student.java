package com.student.rest.studentrestexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "name")
  private String name;

  @Column(name = "score")
  private String score;

  @Column(name = "content")
  private String content;

  public Student() {  }

  public Student(String name, String content) {
      this.setId(id);
      this.setName(name);
      this.setContent(content);
  }

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getContent() {
      return content;
  }

  public void setContent(String content) {
      this.content = content;
  }

  @Override
  public String toString() {
      return "Student{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", content='" + content + '\'' +
              '}';
  }
}
