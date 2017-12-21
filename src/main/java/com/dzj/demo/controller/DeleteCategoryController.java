package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjCategoryBean;
import com.dzj.demo.domain.DzjMasterBean;
import com.dzj.demo.mapper.DzjCategoryMapper;
import com.dzj.demo.mapper.DzjMasterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hongbo.gao on 2017/12/6.
 */
@Controller
public class DeleteCategoryController {

	@Autowired
	DzjMasterMapper dzjMasterMapper;

	@Autowired
	DzjCategoryMapper dzjCategoryMapper;

	@ResponseBody
	@RequestMapping(value = "/delete_category.do")
	public String delete(String category){
		DzjCategoryBean dzjCategoryBean = new DzjCategoryBean();
		dzjCategoryBean.setDzj_category_text(category);
		DzjCategoryBean selectedCategory = dzjCategoryMapper.querydzjByCategoryText(dzjCategoryBean);
		if (selectedCategory != null) {
			DzjMasterBean selectedMaster = new DzjMasterBean();
			selectedMaster.setDzj_category_id(selectedCategory.getDzj_category_id());
			dzjMasterMapper.deletedzjByCategoryID(selectedMaster);
			dzjCategoryMapper.deletedzjByCategoryID(selectedCategory);
			return "删除分类["+category+"]";
		} else {
			return "删除失败";
		}
	}
}
