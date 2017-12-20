package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjCategoryBean;
import com.dzj.demo.mapper.DzjCategoryMapper;
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
public class CreateCategoryController {

	@Autowired
	DzjCategoryMapper dzjCategoryMapper;

	@RequestMapping(value = "/createCategory.do", method = RequestMethod.POST)
	@ResponseBody
	public Integer createCategory(String category){
		DzjCategoryBean dzjCategoryBean = new DzjCategoryBean();
		dzjCategoryBean.setDzj_category_text(category);
		if (dzjCategoryMapper.querydzjByCategoryText(dzjCategoryBean) == null) {
			dzjCategoryMapper.insertdzj(dzjCategoryBean);
		}
		int categoryID = dzjCategoryMapper.querydzjByCategoryText(dzjCategoryBean).getDzj_category_id();
		return categoryID;
	}
}
