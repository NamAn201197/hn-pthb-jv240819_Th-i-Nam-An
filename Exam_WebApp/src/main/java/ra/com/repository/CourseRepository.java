package ra.com.repository;

import ra.com.model.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> findAll();
    Course findById(int id);
    boolean save(Course course);
    boolean update(Course course);
    boolean delete(int id);


}
