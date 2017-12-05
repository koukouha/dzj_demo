package com.dzj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hongbo.gao on 2017/12/5.
 */
@Controller
public class UploadController {

	@RequestMapping(value = "upload.do", method = RequestMethod.POST)
	public ModelAndView upload(@RequestParam(value="file",required=false)MultipartFile file){

	}
}
