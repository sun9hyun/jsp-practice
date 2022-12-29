<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userDAO" class="dao.UserDAO"/>
<jsp:useBean id="userVO" class="vo.UserVO"/>
   
<%
String userId = request.getParameter("userId");
String userPassword = request.getParameter("userPassword");
String userName = request.getParameter("userName");
String userAge = request.getParameter("userAge");
String userPhoneNumber = request.getParameter("userPhoneNumber");
String userBirth = request.getParameter("userBirth");
userVO.setUserId(userId);
userVO.setUserId(userPassword);
userVO.setUserId(userName);
userVO.setUserId(userAge);
userVO.setUserId(userPhoneNumber);
userVO.setUserId(userBirth);


 userDAO.insert(userVO);
response.sendRedirect("login.jsp"); //login 
%>
