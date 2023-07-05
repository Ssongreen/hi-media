package himedia.alone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@GetMapping("/join")
	public String requestForm(
		@RequestParam("userName") String name,
		@RequestParam("userAge") int age, 
		Model model) {
	model.addAttribute("name", name)
		 .addAttribute("age", age);
	return "member/join";
}
}
