package springwebmvcxmlexample.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

	//http://localhost:8080/springwebmvcxmlexample/?name="Supriya"
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");

		Map<String, String> model = new HashMap<String,String>();
		model.put("name", name);

		return new ModelAndView("welcome", model);
		
		/**
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("welcome");
		return mv;**/
	}

	

}
