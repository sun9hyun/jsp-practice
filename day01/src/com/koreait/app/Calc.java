package com.koreait.app;

public class Calc {
   public int number1;
   public int number2;
   
   public Calc() {;}

   public Calc(int number1, int number2) {
      super();
      this.number1 = number1;
      this.number2 = number2;
   }

   public Calc(String number1, String number2) {
      this(Integer.parseInt(number1), Integer.parseInt(number2));
   }
   

   public int add() {return number1 + number2;}
   public int sub() {return number1 - number2;}
   public int mul() {return number1 * number2;}
   public int div() {return number1 / number2;}
}

















