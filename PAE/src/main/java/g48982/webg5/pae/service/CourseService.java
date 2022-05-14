package g48982.webg5.pae.service;

import g48982.webg5.pae.business.CourseDB;
import g48982.webg5.pae.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseDB courseDB;

    public Course getCourseBySigle(String sigle){
        return courseDB.findCoursesById(sigle);
    }



}
