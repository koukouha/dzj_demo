package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjManageUserBean;
import com.dzj.demo.mapper.DzjManageUserMapper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by hongbo.gao on 2017/12/6.
 */
@Controller
public class LoginController {

	@Autowired
	DzjManageUserMapper dzjManageUserMapper;

	@RequestMapping(value = "/login.do")
	public ModelAndView init(String username, String password){

		ModelMap model = new ModelMap();
		model.addAttribute("message", "用户名或密码不存在");

		DzjManageUserBean userBean = new DzjManageUserBean();
		userBean.setUsername(username);
		userBean.setPassword(password);
		DzjManageUserBean result = dzjManageUserMapper.queryDzjManageUserbyUsernameAndPassword(userBean);
		if (result == null) {
			return new ModelAndView("/login", model);
		} else {
			return new ModelAndView("/dzj_upload", model);
		}
	}
}
