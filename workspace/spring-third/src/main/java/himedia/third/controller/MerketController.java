package himedia.third.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MerketController {

	@GetMapping()
	public String home() {
		return "home";
	}
}
