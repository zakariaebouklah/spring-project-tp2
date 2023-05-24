package org.example.foo;

import java.util.List;

public interface StudentRepository {

    public void save(Student s);

    public Student findById(int id);

    public List<Student> findAll();

}
