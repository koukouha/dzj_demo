package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjCategoryBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hongbo.gao on 2017/12/18.
 */
public interface DzjCategoryMapper {

    @Insert("insert into dzj_category(dzj_category_text) "
            + "values(#{dzj_category_text})")
    int insertdzj(DzjCategoryBean object);

    @Select("select * from dzj_category")
    List<DzjCategoryBean> querydzj();

    @Select("select * from dzj_category where dzj_category_id = #{dzj_category_id}")
    DzjCategoryBean querydzjByID(DzjCategoryBean object);

    @Select("select * from dzj_category where dzj_category_text = #{dzj_category_text}")
    DzjCategoryBean querydzjByCategoryText(DzjCategoryBean object);

    @Select("select dzj_category_id, dzj_category_text from dzj_category")
    List<DzjCategoryBean> querydzjTitle();

    @Delete("delete from dzj_category where dzj_category_id = #{dzj_category_id}")
    int deletedzjByCategoryID(DzjCategoryBean object);
}
