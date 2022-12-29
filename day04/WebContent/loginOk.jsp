<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userDAO" class="dao.UserDAO"/>
<%
	String userId = request.getParameter("userId");
	String userPassword = request.getParameter("userPassword");
	response.sendRedirect(userDAO.checkId(userId) ? "login.jsp" : "login.jsp?check=false");
%>