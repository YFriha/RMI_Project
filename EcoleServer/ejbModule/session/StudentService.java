package session;

import java.util.List;

import dao.IDao;
import entities.Student;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class StudentService implements IDao<Student>  {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean create(Student student) {
		em.persist(student);
		return true;
	}

	@Override
	public boolean update(Student o) {
		
		return false;
	}

	@Override
	public boolean delete(Student o) {
		em.remove(o);
		return true;
	}

	@Override
	public Student findById(int id) {
		
		return em.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		jakarta.persistence.Query query = em.createQuery("select e from Student e");
		return query.getResultList();
	}

}
