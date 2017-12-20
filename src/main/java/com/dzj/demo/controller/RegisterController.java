package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjUserInfoBean;
import com.dzj.demo.mapper.DzjUserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hongbo.gao on 2017/12/6.
 */
@Controller
public class RegisterController {

	@Autowired
	DzjUserInfoMapper dzjManageUserMapper;

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	@ResponseBody
	public String init(String username, String password){
		DzjUserInfoBean userBean = new DzjUserInfoBean();
		userBean.setUsername(username);
		userBean.setPassword(password);
		int result = dzjManageUserMapper.insertDzjManageUser(userBean);
		if (result == 1){
			return "注册成功";
		} else {
			return "注册失败";
		}
	}
}
