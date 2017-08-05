package nhatnghe.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import nhatnghe.bean.UserInfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/account")
public class AccountController {
	@RequestMapping(value="login/{id}",method=RequestMethod.GET)
	public String login(ModelMap model,@PathVariable("id") int id) {
		model.addAttribute("message", "get : " +id);
		return "account/login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("message", "get : " );
		return "account/login";
	}

	@RequestMapping(value="login",method=RequestMethod.POST,params="way1")
	public String login2(HttpServletRequest req,ModelMap model) {
		String id = req.getParameter("id");
		String pw = req.getParameter("password");
		model.addAttribute("message", "POST,"+id+","+pw);
		return "account/login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST,params="way2")
	public String login3(ModelMap model,@RequestParam("id") String id,
						@RequestParam("password") String pw) {		
		model.addAttribute("message", "POST,"+id+","+pw);
		return "account/login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST,params="way3")
	public String login4(ModelMap model,UserInfo user) {		
		model.addAttribute("message", "POST,"+user.getId()+","+user.getPassword());
		return "account/login";
	}
	
	@RequestMapping(value="register")
	public String register() {
		return "account/register";
	}
}
