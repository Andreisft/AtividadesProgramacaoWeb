package br.ucsal.bes.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class PermissionFilter
 */
@WebFilter("/admin/*")
public class PermissionFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Object user = ((HttpServletRequest) request).getSession().getAttribute("user");
		if (user != null) {
			chain.doFilter(request, response);
		} else {
			((HttpServletResponse) response).sendRedirect("/Atividade03/index.jsp");
		}
		// pass the request along the filter chain
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}
}
