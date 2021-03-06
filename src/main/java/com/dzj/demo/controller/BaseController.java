package com.dzj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hongbo.gao on 2017/12/6.
 */
@Controller
public class BaseController {

	@RequestMapping(value = "/init.do")
	public ModelAndView init(){
		ModelMap model = new ModelMap();
		model.addAttribute("name", "Spring Boot");
		return new ModelAndView("/dzj_upload", model);
	}
}
