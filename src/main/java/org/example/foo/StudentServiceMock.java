package org.example.foo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentServiceMock implements StudentService{

    private static List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "student_1"),
                    new Student(2, "student_2"),
                    new Student(3, "student_3")
            )
    );

    @Override
    public void createNewStudent(Student s) {
        students.add(s);
    }

    @Override
    public Student searchStudentByID(int id) {
        return students.get(id);
    }

    @Override
    public String displayStudentInfos(Student s) {
        return "Student : " + s.getId() + " - " + s.getName() + ".";
    }
}
