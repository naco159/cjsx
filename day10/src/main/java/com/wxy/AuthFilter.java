package com.wxy;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AuthFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            httpResponse.sendRedirect("login.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }

    public void destroy() {}
}