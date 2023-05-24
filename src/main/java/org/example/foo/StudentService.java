package org.example.foo;

public interface StudentService {

    public void createNewStudent(Student s);

    public Student searchStudentByID(int id);

    public String displayStudentInfos(Student s);

}
