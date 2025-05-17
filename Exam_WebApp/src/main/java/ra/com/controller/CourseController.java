package ra.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.com.model.Course;
import ra.com.repository.CourseRepository;
import ra.com.service.CourseService;
import ra.com.service.imp.CourseServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/courseController")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/findAll")
    public String findAllCourse(Model model) {
        model.addAttribute("listCourses", courseService.findAll());
        return "course/list";
    }

    @GetMapping("initCreate")
    public String initCreateCourse(Model model) {
        model.addAttribute("course", new Course());
        return "newCourse";
    }

    @PostMapping("/create")
    public String createCourse(Course course) {
        boolean result = courseService.save(course);
        if (result) {
            return "redirect:findAll";
        }
        return "error";
    }
}
