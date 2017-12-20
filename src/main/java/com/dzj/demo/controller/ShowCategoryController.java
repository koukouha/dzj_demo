package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjCategoryBean;
import com.dzj.demo.mapper.DzjCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hongbo.gao on 2017/12/6.
 */
@Controller
public class ShowCategoryController {

    @Autowired
    DzjCategoryMapper dzjCategoryMapper;

    @RequestMapping(value = "/showCategory.do", method = RequestMethod.GET)
    @ResponseBody
    public List<DzjCategoryBean> showTitle()
    {
        return dzjCategoryMapper.querydzj();
    }
}
