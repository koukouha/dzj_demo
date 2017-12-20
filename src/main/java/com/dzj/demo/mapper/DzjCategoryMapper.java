package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjMasterBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hongbo.gao on 2017/12/18.
 */
public interface DzjCategoryMapper {

    @Insert("insert into dzj_category(dzj_category_id, dzj_category_text) "
            + "values(#{dzj_category_id}, #{dzj_category_text})")
    int insertdzj(DzjMasterBean object);

    @Select("select * from dzj_category")
    List<DzjMasterBean> querydzj();

    @Select("select * from dzj_category where dzj_category_id = #{dzj_category_id}")
    DzjMasterBean querydzjLimit1(DzjMasterBean object);

    @Select("select dzj_category_id, dzj_category_text from dzj_category")
    List<DzjMasterBean> querydzjTitle();

}
