<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>

<h3>로그인 페이지</h3>
<hr>
<form name="joinForm" action="checkId.jsp">
      <label>
         아이디 <input type="text" name="userId" placeholder="5자 이상으로 작성해주세요.">
         <input type="button" value="로그인" onclick="send()">
      </label>
      <p id="result">
      </p>
   </form>
</body>
<script>
	function send(){
	   
    var $value = $("input[name='userId']").val();
    if(!$value || $value.length < 5){2
       alert("아이디를 확인해주세요.");
       return;
    }
    
    $.ajax({
       url: "checkId_ajax.jsp",
       type: "get",
       data: "userId=" + $value,
       contentType: "application/x-www-form-urlencoded",
       dataType: "text",
       success: function(result){
          result = result.trim();
          if(JSON.parse(result)){
             $("p#result").text("로그인 성공.");
          }else{
             $("p#result").text("로그인 실패.");
          }
       },
       error: function(xhr, status, error){
          console.log(error);
       }
       
    });
 }
</script>
</html>