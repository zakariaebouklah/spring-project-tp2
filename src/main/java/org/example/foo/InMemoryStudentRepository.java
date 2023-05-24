package org.example.foo;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository{

    private static List<Student> students = new ArrayList<>();

    @Override
    public void save(Student s) {
        students.add(s);
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }
}
