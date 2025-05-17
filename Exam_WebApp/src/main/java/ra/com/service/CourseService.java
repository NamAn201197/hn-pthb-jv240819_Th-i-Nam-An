package ra.com.service;

import ra.com.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findById(int id);
    boolean save(Course course);
    boolean update(Course course);
    boolean delete(int id);
}
