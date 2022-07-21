package youtube.java.puzzle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import youtube.java.puzzle.college.repository.CollegeRepository;
import youtube.java.puzzle.model.Response;
import youtube.java.puzzle.service.TestService;
import youtube.java.puzzle.student.repository.StudentRepository;

@RestController
public class CombineController {

    @Autowired
    TestService service;

    @GetMapping("/")
    public Response getResponse(){
        Response response = new Response();
        response.setColleges( service.getAllColleges());
        response.setStudents( service.getAllStudents() );
        return response;
    }
}
