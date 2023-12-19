package todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
	@GetMapping({"/","/login"})
	public String loadLogin() {
		return "Login";
	}
}
