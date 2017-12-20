package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjMasterBean;
import com.dzj.demo.mapper.DzjMasterMapper;
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
public class ShowTitleController {

    @Autowired
    DzjMasterMapper dzjMapper;

    @RequestMapping(value = "/showTitle.do", method = RequestMethod.GET)
    @ResponseBody
    public List<DzjMasterBean> showTitle(String id){
        DzjMasterBean dzjMasterBean = new DzjMasterBean();
        dzjMasterBean.setDzj_category_id(Integer.parseInt(id));
        return dzjMapper.querydzjByCategoryID(dzjMasterBean);
    }
}
