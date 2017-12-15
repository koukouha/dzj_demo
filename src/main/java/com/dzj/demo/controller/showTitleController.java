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
public class showTitleController {

    @Autowired
    DzjMapper dzjMapper;

    @RequestMapping(value = "/showTitle.do", method = RequestMethod.GET)
    @ResponseBody
    public List<DzjBean>  showTitle(){
        return dzjMapper.querydzjTitle();
    }
}
