package com.student.rest.studentrestexample;

public class Student {
  private int id;
  private String name;
  private String content;

  public Student() {  }

  public Student(int id, String name, String content) {
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
              ", title='" + name + '\'' +
              ", content='" + content + '\'' +
              '}';
  }
}
