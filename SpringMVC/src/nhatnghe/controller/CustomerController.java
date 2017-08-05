package nhatnghe.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	//must have autowired when use Servlet Context
	ServletContext app;
	@RequestMapping(value="insert")
	public String insert1(ModelMap model,
						@CookieValue(value="uid",defaultValue="123") String uid,
						HttpSession session
			){
		session.setAttribute("x", "Insert with Session scope");
		app.setAttribute("x", "Insert with Application scope");
		model.addAttribute("mess", "No parameters");
		return "customer/insert";
	}
	
	@RequestMapping(value="insert",params="a")
	public String insert2(ModelMap model){
		model.addAttribute("mess", "Have parameter a");
		return "customer/insert";
	}
	
	@RequestMapping(value="insert",params="b")
	public String insert3(ModelMap model){
		model.addAttribute("mess", "Have parameter b");
		return "customer/insert";
	}
}
