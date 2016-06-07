package com.springapp.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")


public class HelloController {

//	@Autowired
//	private myService myService;
//
//	@RequestMapping(method = RequestMethod.GET)
//	public String printWelcome(ModelMap model) {
//		model.addAttribute("message", "Kill all people");
//		return "hello";
//	}
//
//	@RequestMapping(value = "/kill", method = RequestMethod.POST)
//	@ResponseBody
//	public String kill(MultipartFile file) {
//		String f = "d";
//		try {
//			f = myService.doPost(file);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("adding complite");
//		return f;
//
//	}
}