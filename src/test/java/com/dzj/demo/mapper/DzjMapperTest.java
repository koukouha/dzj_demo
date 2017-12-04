package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjBean;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hongbo.gao on 2017/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DzjMapperTest {

	@Autowired
	DzjMapper dzjMapper;

	@Test
	public void testInsertdzj() throws Exception {
		DzjBean dzj1 = new DzjBean();
		DzjBean dzj2 = new DzjBean();

		dzj1.setDzjText("aaaaaaaaaaaaaaaa");
		dzj1.setDzjTitle("aaa");

		dzj2.setDzjText("bbbbbbbbbbbbbbbb");
		dzj2.setDzjTitle("bbb");

		dzjMapper.insertdzj(dzj1);
		dzjMapper.insertdzj(dzj2);

		Assert.assertEquals(2, dzjMapper.querydzj(new DzjBean()).size());

	}

	public void testUpdatedzj() throws Exception {

	}

	public void testQuerydzj() throws Exception {

	}

	public void testQuerydzjLimit1() throws Exception {

	}
}
