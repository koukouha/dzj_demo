package com.dzj.demo.mapper;

import com.dzj.demo.domain.DzjMasterBean;
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
	DzjMasterMapper dzjMapper;

	@Test
	public void testInsertdzj() throws Exception {
		DzjMasterBean dzj1 = new DzjMasterBean();
		DzjMasterBean dzj2 = new DzjMasterBean();

		dzj1.setDzj_text("aaaaaaaaaaaaaaaa");
		dzj1.setDzj_title_text("aaa");

		dzj2.setDzj_text("bbbbbbbbbbbbbbbb");
		dzj2.setDzj_title_text("bbb");

		dzjMapper.insertdzj(dzj1);
		dzjMapper.insertdzj(dzj2);

		Assert.assertEquals(2, dzjMapper.querydzj().size());

	}

	public void testUpdatedzj() throws Exception {

	}

	public void testQuerydzj() throws Exception {

	}

	public void testQuerydzjLimit1() throws Exception {

	}
}
