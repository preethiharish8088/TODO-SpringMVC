package todo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import todo.dto.TodoUser;

@Component
public class TodoDao {

	@Autowired
	EntityManager manager;

	public List<TodoUser> findByEmail(String email) {
		return manager.createQuery("select x from TodoUser x where email=?1").setParameter(1, email).getResultList();
	}

	public void save(TodoUser user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
	}
}
