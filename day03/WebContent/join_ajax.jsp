<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
   <form name="joinForm">
      <label>
         아이디 <input type="text" name="userId" placeholder="5자 이상으로 작성해주세요.">
         <input type="button" value="중복검사" onclick="send()">
      </label>
      <p id="result">
      </p>
      <input type="button" value="완료" onclick = "add()">
   </form>
</body>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
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
               $("p#result").text("중복된 아이디입니다.");
            }else{
               $("p#result").text("사용가능한 아이디입니다.");
            }
         },
         error: function(xhr, status, error){
            console.log(error);
         }
         
      });
   }
      
      
   function add(){

      var $value = $("input[name='userId']").val();

      $.ajax({
         url: "joinOk.jsp",
         type: "get",
         data: "userId=" + $value,
         contentType: "application/x-www-form-urlencoded",
         dataType: "text",
         success: function(result){
            result = result.trim();
            if(result){
               $("p#result").text("회원가입 성공.");
               console.log(result);
            }else{
               $("p#result").text("회원가입 실패.");
            }
         },
         error: function(xhr, status, error){
            console.log(error);
         }
      });
   }
      
   
</script>
</html>












