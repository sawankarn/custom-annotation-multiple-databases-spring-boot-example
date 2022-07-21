package youtube.java.puzzle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youtube.java.puzzle.college.entity.College;
import youtube.java.puzzle.college.repository.CollegeRepository;
import youtube.java.puzzle.configuration.SwitchDataSource;
import youtube.java.puzzle.student.entity.Student;
import youtube.java.puzzle.student.repository.StudentRepository;

import java.util.List;

@Service
public class TestService {
    @Autowired
    CollegeRepository collegeRepository;
    @Autowired
    StudentRepository studentRepository;

    @SwitchDataSource(value = "college")
    public List<College> getAllColleges(){
        return collegeRepository.findAll();
    }

    @SwitchDataSource(value = "student")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}
