package in.sonu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping(path = "/google")
	public String redirectpage() {
		return "redirect:https://www.google.com";
	}

	@RequestMapping(path = "/yahoo")
	public RedirectView redirectpage2() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://in.search.yahoo.com");
		return redirectView;
	}

	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String search(@RequestParam("keyword") String keyword) {

		String url = "http://www.google.com/search?q=" + keyword;
		return "redirect:" + url;

	}
}
