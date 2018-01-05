package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjMasterBean;
import com.dzj.demo.mapper.DzjMasterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShowTextController {

    @Autowired
    DzjMasterMapper dzjMapper;

    @RequestMapping(value = "/showText.do", method = RequestMethod.GET)
    @ResponseBody
    public String showTitle(int id){
        DzjMasterBean dzjBean = new DzjMasterBean();
        dzjBean.setDzj_id(id);
        return dzjMapper.querydzjByID(dzjBean).getDzj_text();
    }
}
