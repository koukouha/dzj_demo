package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjBean;

import java.util.List;
/**
*  @author author
*/
public interface DzjMapper {

    int insertdzj(DzjBean object);

    int updatedzj(DzjBean object);

    List<DzjBean> querydzj(DzjBean object);

    DzjBean querydzjLimit1(DzjBean object);

}
