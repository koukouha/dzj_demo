package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjUserInfoBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by hongbo.gao on 2017/12/18.
 */
public interface DzjUserInfoMapper {

	@Insert("insert into dzj_manage_user(username, password) values(#{username}, #{password})")
	int insertDzjManageUser(DzjUserInfoBean object);

	@Update("update dzj_manage_user set username = #{username}, password = #{password} where id=#{id}")
	int updateDzjManageUser(DzjUserInfoBean object);

	@Select("select * from dzj_manage_user")
	List<DzjUserInfoBean> queryDzjManageUser();

	@Select("select * from dzj_manage_user where username = #{username} and password = #{password}") DzjUserInfoBean queryDzjManageUserbyUsernameAndPassword(DzjUserInfoBean object);
}
