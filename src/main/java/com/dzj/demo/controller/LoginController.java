package com.dzj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hongbo.gao on 2017/12/6.
 */
@Controller
public class LoginController {

	@RequestMapping(value = "/login.do")
	public ModelAndView init(String username, String password){
		ModelMap model = new ModelMap();
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return new ModelAndView("/dzj_upload", model);
	}
}
