package com.koreait.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Oper
 */
//@WebServlet("/oper")
public class Oper extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html; charset=UTF-8");
      String input = request.getParameter("input");
      PrintWriter out = response.getWriter();
      
      String opers = "+-*/"; //사칙연산 선언
      String oper = null; 
      String[] nums = null;
      Calc calc = null;
      int result = 0;
      String msg = null;
      
      for (int i = 0; i < input.length(); i++) { //입력한 값 길이만큼 반복 문자열이니까 ()
         for (int j = 0; j < opers.length(); j++) { // 사칙연산 길이만큼 반복
            if(input.charAt(i) == opers.charAt(j)) { //입력한 값 사칙연산 값이랑 문자열 비교 시 같으면
               oper = String.valueOf(input.charAt(i)); // oper에 character->문자열로 변환한 값 저장 
            }
         }
      }
      
      nums = input.split("\\" + oper); //문자열 잘라서 nums에 담는다
      
      try {
         calc = new Calc(nums[0], nums[1]); //Calc.java 메소드 쓰기위해 calc선언 
         if(nums.length > 2) { throw new NumberFormatException(); }
         //정수가 2개 초과이면 예외 처리
      
         switch(oper) {
         case "+": //oper가 +일때
            result = calc.add(); //result안에 add메소드 결과값 담음
            break;
         case "-": //oper가 -일때
            result = calc.sub();//result안에 sub메소드 결과값 담음
            break;
         case "*": //oper가 *일때
            result = calc.mul();//result안에 mul메소드 결과값 담음
            break;
         case "/": //oper가 /일때
            result = calc.div();//result안에 div메소드 결과값 담음
            break;
         }
         
         msg = "<h1> 결과 : " + result + "</h1>";
         
      } catch (ArithmeticException e) {
//         0으로 나눔
         msg = "<h1 style='color: red'> 0으로 나눌 수 없습니다. </h1>";
      } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//         잘못 입력
         msg = "<h1 style='color: red'> 잘못된 수식입니다. </h1>";
      }
      
      out.print(msg);//msg 값 출력
      out.print("<a href='calc'>다시 계산하기</a>"); //다시 계산하기 누르면 jsp페이지로 이동
      out.close(); //출력 닫아줌 
   }
}












