<%@page import="dao.GuestVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.GuestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 전체 목록</title>
</head>
<body>
   <%
      GuestDAO guestDAO = new GuestDAO();
/* 	  ArrayList<GuestVO> guests = guestDAO.selectAll();   */
      ArrayList<GuestVO> guests = guestDAO.up(); 
 
   %>
     <form action="search.jsp" method="get"> 
      <input type="text" name="input" placeholder="이름을 입력해주세요.">
      <input type="submit" value="결과 확인">
      <input type = "submit" value="정렬" name ="sort"onclick="location.href='search2.jsp'" >  
</form> 
   <table border="1">
      <%for(int i=0; i<guests.size(); i++){ %>
         <tr>
            <td><%=guests.get(i).getGuestNumber()%></td>
            <td><%=guests.get(i).getGuestName()%></td>
            <td><%=guests.get(i).getGuestBirth()%></td>
         </tr>
      <%} %>
   <hr>
   </table>
</body>
</html>































