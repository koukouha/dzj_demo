package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjBean;
import com.dzj.demo.mapper.DzjMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class showTextController {

    @Autowired
    DzjMapper dzjMapper;

    @RequestMapping(value = "/showText.do", method = RequestMethod.GET)
    @ResponseBody
    public String showTitle(int id){
        DzjBean dzjBean = new DzjBean();
        dzjBean.setId(id);
        return dzjMapper.querydzjLimit1(dzjBean).getDzjText();
    }
}
