package com.kce.stc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kce.stc.dao.Userdao;
import com.kce.stc.model.User;

@Controller
public class Welcome {
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView doStart()
	{
		return new ModelAndView("success");
	}
	

	
	

}
