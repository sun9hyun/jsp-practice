<%@page import="dao.GuestVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.GuestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	   <%
   String keyword = request.getParameter("name");

   GuestDAO guestDAO = new GuestDAO();
   GuestVO guestVO = new GuestVO();
   
  ArrayList<GuestVO> guests = guestDAO.selectAll();     
	/*  ArrayList<GuestVO> guests = guestDAO.info(sname,sbirth); */
    
         
   %>
<form action="search2.jsp" method="get">
<div>
      <input type="text" name="name" placeholder="이름을 입력해주세요.">
      </div>
      <div>
      <input type="text" name="birth" placeholder="생일을 입력해주세요.">
      </div>
      <input type="submit" value="결과 확인">
      <input type = "submit" value="정렬" name ="sort"onclick="location.href='guest_jdbc.jsp'" > 
      <input type="submit" value="추가" name = "add"  >
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