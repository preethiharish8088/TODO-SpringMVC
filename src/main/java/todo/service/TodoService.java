package todo.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import todo.dao.TodoDao;
import todo.dto.TodoUser;

@Component
public class TodoService {

	@Autowired
	TodoDao dao;

	public String signup(TodoUser user, String date, ModelMap map) {
		user.setDob(LocalDate.parse(date));
		user.setAge(Period.between(user.getDob(), LocalDate.now()).getYears());
		if(user.getAge()<18) {
			map.put("dob", "* You have to be 18+ to create Account");
			return "Signup";
		}
		else{
			List<TodoUser> list=dao.findByEmail(user.getEmail());
			if(list.isEmpty())
			{
				dao.save(user);
				map.put("pass", "Account Created Success");
				return "Login";
			}
			else {
				map.put("email", "* Email Should be Unique");
				return "Signup";
			}
		}
	}

}
