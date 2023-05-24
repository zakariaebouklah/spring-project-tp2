package org.example.foo;

public class StudentServiceImpl implements StudentService{

    private StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository){
        this.repository = repository;
    }

    @Override
    public void createNewStudent(Student s) {
        this.repository.save(s);
    }

    @Override
    public Student searchStudentByID(int id) {
        return this.repository.findById(id);
    }

    @Override
    public String displayStudentInfos(Student s) {
        return "Student : " + s.getId() + " - " + s.getName() + ".";
    }
}
