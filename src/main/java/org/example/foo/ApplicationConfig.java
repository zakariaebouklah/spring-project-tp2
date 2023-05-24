package org.example.foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentService createStudentService(){
//        return new StudentServiceImpl(createStudentRepository());
        return new StudentServiceMock();
    }

    @Bean
    public StudentRepository createStudentRepository(){
        return new InMemoryStudentRepository();
    }

}
