package com.dzj.demo.controller;

import com.dzj.demo.domain.DzjBean;
import com.dzj.demo.mapper.DzjMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 * Created by hongbo.gao on 2017/12/5.
 */
@Controller
public class UploadController {

	@Autowired
	DzjMapper dzjMapper;

	@RequestMapping(value = "/upload.do", method = RequestMethod.POST)
	@ResponseBody
	public String upload(MultipartHttpServletRequest request){
		try {
			Iterator<String> itr = request.getFileNames();
			MultipartFile file = request.getFile(itr.next());
			String text = convertInputStreamToString(file.getInputStream());
			//text = new String(text.getBytes("gb2312"),"utf-8");
			DzjBean dzj = new DzjBean();
			dzj.setDzjTitle(file.getOriginalFilename());
			dzj.setDzjText(text);
			dzjMapper.insertdzj(dzj);
			return "success:" + dzj.getDzjTitle();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "fail";
	}

	static String convertInputStreamToString(InputStream is) throws IOException {
		InputStreamReader reader = new InputStreamReader(is);
		StringBuilder builder = new StringBuilder();
		char[] buffer = new char[512];
		int read;
		while (0 <= (read = reader.read(buffer))) {
			builder.append(buffer, 0, read);
		}
		return builder.toString();
	}


}
