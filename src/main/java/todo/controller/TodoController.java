package todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String signup(TodoUser user,@RequestParam String date,ModelMap map) {
		return service.signup(user,date,map);
	}

}
