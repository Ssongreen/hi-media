package himedia.firstspring.controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item") // class level mapping
public class ItemController {

	@GetMapping
	public String welcome() {
		return "/item/welcome";
	}
	@GetMapping("/item-list")
	public String item() {
		return "item/item";
	}

	@GetMapping("/item-view")
		public String itemView(Model model) {
		model.addAttribute("title", "새우깡");
		model.addAttribute("price", 1500);
			return "item/item-view";
		}
}
