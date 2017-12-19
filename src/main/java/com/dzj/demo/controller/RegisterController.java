package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjManageUserBean;
import com.dzj.demo.mapper.DzjManageUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hongbo.gao on 2017/12/6.
 */
@Controller
public class RegisterController {

	@Autowired
	DzjManageUserMapper dzjManageUserMapper;

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	@ResponseBody
	public String init(String username, String password){
		DzjManageUserBean userBean = new DzjManageUserBean();
		userBean.setUsername(username);
		userBean.setPassword(password);
		int result = dzjManageUserMapper.insertDzjManageUser(userBean);
		if (result == 1){
			return "register successful";
		} else {
			return "register failed";
		}
	}
}
