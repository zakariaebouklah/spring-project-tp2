package org.example.foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        StudentService studentService = applicationContext.getBean(StudentService.class);

//        studentService.createNewStudent(new Student(1, "student_1"));
//        studentService.createNewStudent(new Student(2, "student_2"));

        Student s = studentService.searchStudentByID(1);

        System.out.println(studentService.displayStudentInfos(s));
    }
}
