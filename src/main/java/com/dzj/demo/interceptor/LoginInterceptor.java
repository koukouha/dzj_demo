package com.dzj.demo.interceptor;

import com.dzj.demo.constant.Global;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hongbo.gao on 2017/12/19.
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		if ((uri.equals("/dzj/top"))
				|| (uri.equals("/dzj/login.do"))
				|| (uri.equals("/dzj/register.do"))
				|| (request.getSession().getAttribute(Global.USER_KEY) != null)) {
			return true;
		} else {
			response.sendRedirect("/dzj/top");
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
}
