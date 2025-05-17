package ra.com.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.com.model.Course;
import ra.com.repository.CourseRepository;
import ra.com.service.CourseService;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService {
    @Autowired
    private CourseRepository courseRepository;


    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(int id) {
        return courseRepository.findById(id);
    }

    @Override
    public boolean save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public boolean update(Course course) {
        return courseRepository.update(course);
    }

    @Override
    public boolean delete(int id) {
        return courseRepository.delete(id);
    }
}
