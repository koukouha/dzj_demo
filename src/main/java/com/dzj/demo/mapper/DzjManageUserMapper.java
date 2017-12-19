package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjManageUserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by hongbo.gao on 2017/12/18.
 */
public interface DzjManageUserMapper {

	@Insert("insert into dzj_manage_user(username, password) values(#{username}, #{password})")
	int insertDzjManageUser(DzjManageUserBean object);

	@Update("update dzj_manage_user set username = #{username}, password = #{password} where id=#{id}")
	int updateDzjManageUser(DzjManageUserBean object);

	@Select("select * from dzj_manage_user")
	List<DzjManageUserBean> queryDzjManageUser();

	@Select("select * from dzj_manage_user where username = #{username} and password = #{password}")
	DzjManageUserBean queryDzjManageUserbyUsernameAndPassword(DzjManageUserBean object);
}
