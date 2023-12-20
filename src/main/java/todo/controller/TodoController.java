package todo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import todo.dto.TodoUser;
import todo.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService service;
	
	@GetMapping({ "/", "/login" })
	public String loadLogin() {
		return "Login";
	}

	@GetMapping("/signup")
	public String loadSignup() {
		return "Signup";
	}

	@PostMapping("/signup")
	public String signup(TodoUser user,@RequestParam String date) {
		return service.signup(user,date);
	}

}
