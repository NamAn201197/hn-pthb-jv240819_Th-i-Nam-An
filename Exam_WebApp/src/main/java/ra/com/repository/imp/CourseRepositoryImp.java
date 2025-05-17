package ra.com.repository.imp;

import org.springframework.stereotype.Repository;
import ra.com.model.Course;
import ra.com.repository.CourseRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CourseRepositoryImp implements CourseRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Course> findAll() {
        return em.createQuery("from Course", Course.class).getResultList();
    }

    @Override
    public Course findById(int id) {
        return em.createQuery("from Course where id = :id", Course.class).setParameter("id", id).getSingleResult();
    }

    //
    @Override
    @Transactional
    public boolean save(Course course) {
        try {
            em.persist(course);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    @Transactional
    public boolean update(Course course) {
        try {
            em.merge(course);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        try {
            Course course = findById(id);
            em.remove(course);
            return true;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
