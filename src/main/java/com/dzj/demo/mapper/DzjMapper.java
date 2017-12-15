package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
/**
*  @author author
*/
public interface DzjMapper {

    @Insert("insert into dzj_txt_mt(dzjText, dzjTitle) values(#{dzjText}, #{dzjTitle})")
    int insertdzj(DzjBean object);

    @Update("update dzj_txt_mt set dzjText = #{dzjText}, dzjTitle = #{dzjTitle} where Id=#{Id}")
    int updatedzj(DzjBean object);

    @Select("select * from dzj_txt_mt")
    List<DzjBean> querydzj();

    @Select("select * from dzj_txt_mt where Id = #{Id}")
    DzjBean querydzjLimit1(DzjBean object);

    @Select("select Id, dzjTitle from dzj_txt_mt")
    List<DzjBean> querydzjTitle();

}
