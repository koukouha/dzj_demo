package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjMasterBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by hongbo.gao on 2017/12/18.
 */
public interface DzjMasterMapper {

    @Insert("insert into dzj_master(dzj_category_id, dzj_title_text, dzj_text) "
            + "values(#{dzj_category_id}, #{dzj_title_text}, #{dzj_text})")
    int insertdzj(DzjMasterBean object);

    @Update("update dzj_master set dzj_category_id = #{dzj_category_id}, "
            + "dzj_title_text = #{dzj_title_text}, dzj_text = #{dzj_text} where dzj_id=#{dzj_id}")
    int updatedzj(DzjMasterBean object);

    @Select("select * from dzj_master")
    List<DzjMasterBean> querydzj();

    @Select("select * from dzj_master where dzj_id = #{dzj_id}")
    DzjMasterBean querydzjLimit1(DzjMasterBean object);

    @Select("select dzj_id, dzj_title_text from dzj_master")
    List<DzjMasterBean> querydzjTitle();

}
