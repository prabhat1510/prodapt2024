package springwebmvcannotationexample.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import springwebmvcannotationexample.exceptions.BookNotFoundException;

@ControllerAdvice
public class CentralExceptionHandler {

	@ExceptionHandler(BookNotFoundException.class	)
	public ModelAndView handleBookNotFoundException(HttpServletRequest req, Exception ex) {
		ModelAndView mav = new ModelAndView();
	    mav.addObject("errorMsg", ex.getMessage());
	    mav.addObject("url", req.getRequestURL());
	    mav.setViewName("errormsg");
	    return mav;
	}
	
}
