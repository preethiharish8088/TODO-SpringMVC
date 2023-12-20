package todo.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import todo.dao.TodoDao;
import todo.dto.TodoUser;

@Component
public class TodoService {

	@Autowired
	TodoDao dao;

	public String signup(TodoUser user, String date) {
		user.setDob(LocalDate.parse(date));
		
	}

}
