package info.linianjun.web;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import info.linianjun.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	
	 @RequestMapping("/login")
	    public String login() {
		 log.info("==============in login controller=============");
	        return "login";
	    }

	    @RequestMapping("/index")
	    public String index() {
	    	log.info("==============in index controller=============");
	        return "index";
	    }

	    @RequestMapping("/logout")
	    public String logout() {
	        Subject subject = SecurityUtils.getSubject();
	        if (subject != null) {
	            subject.logout();
	        }
	        return "login";
	    }

	    @RequestMapping("unauthorized")
	    public String unauthorized() {
	        return "unauthorized";
	    }

	    @RequestMapping("/admin")
	    @ResponseBody
	    public String admin() {
	        return "admin success";
	    }

	    @RequestMapping("/edit")
	    @ResponseBody
	    public String edit() {
	        return "edit success";
	    }

	    @RequestMapping("/loginUser")
	    public String loginUser(@RequestParam("username") String username,
	                            @RequestParam("password") String password,
	                            HttpSession session) {
	        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
	        Subject subject = SecurityUtils.getSubject();
	        try {
	            subject.login(token);
	            User user = (User) subject.getPrincipal();
	            session.setAttribute("user", user);
	            return "index";
	        } catch (Exception e) {
	            return "login";
	        }
	    }

}
