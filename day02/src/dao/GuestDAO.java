package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GuestDAO {
   public Connection connection;
   public PreparedStatement preparedStatement;
   public ResultSet resultSet;
   
//   전체 회원 조회
   public ArrayList<GuestVO> selectAll(){
      String query = "select guest_number, guest_name, guest_birth from tbl_guest";
      ArrayList<GuestVO> guests = new ArrayList<>();

      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            GuestVO guestVO = new GuestVO();
            guestVO.setGuestNumber(resultSet.getInt(1));
            guestVO.setGuestName(resultSet.getString(2));
            guestVO.setGuestBirth(resultSet.getString(3));
            
            guests.add(guestVO);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      return guests;
   }
 //검색
	 public ArrayList<GuestVO> select(String guestName){
	      String query = "select * from tbl_guest where guest_name = ?";
	      ArrayList<GuestVO> guests = new ArrayList<>();

	      try {
	         connection = DBConnecter.getConnection();
	         preparedStatement = connection.prepareStatement(query);
	         preparedStatement.setString(1, guestName);
	         resultSet = preparedStatement.executeQuery();
	         
	         while(resultSet.next()) {
	            GuestVO guestVO = new GuestVO();
	            guestVO.setGuestNumber(resultSet.getInt(1));
	            guestVO.setGuestName(resultSet.getString(2));
	            guestVO.setGuestBirth(resultSet.getString(3));
	            
	            guests.add(guestVO);
	         }
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(resultSet != null) {
	               resultSet.close();
	            }
	            if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            throw new RuntimeException(e);
	         }
	      }
	      return guests;
	   }
// 오름차순,내림차순
	 
	  public ArrayList<GuestVO> up(){
		  boolean check = true;
		  String query ="";

		  if(check) {
			  query = "select * from tbl_guest order by guest_number desc";
		  }else {
			  query = "select * from tbl_guest order by guest_number asc";
		  }
		  
	      ArrayList<GuestVO> guests = new ArrayList<>();
	      try {
	          connection = DBConnecter.getConnection();
	          preparedStatement = connection.prepareStatement(query);
	          resultSet = preparedStatement.executeQuery();
	          
	          while(resultSet.next()) {
	             GuestVO guestVO = new GuestVO();
	             guestVO.setGuestNumber(resultSet.getInt(1));
	             guestVO.setGuestName(resultSet.getString(2));
	             guestVO.setGuestBirth(resultSet.getString(3));
	             
	             guests.add(guestVO);
	          }
	          
	       } catch (SQLException e) {
	          e.printStackTrace();
	       } catch (Exception e) {
	          e.printStackTrace();
	       } finally {
	          try {
	             if(resultSet != null) {
	                resultSet.close();
	             }
	             if(preparedStatement != null) {
	                preparedStatement.close();
	             }
	             if(connection != null) {
	                connection.close();
	             }
	          } catch (SQLException e) {
	             throw new RuntimeException(e);
	          }
	       }
	       return guests;
	    }

	 // 이름,생일 추가
	  
	   public ArrayList<GuestVO> info(String guestName,String guestBirth){
		      String query = "insert into tbl_guest "
		              + "(guest_name, guest_birth)"
		              + "VALUES(?, ?)";
		      ArrayList<GuestVO> guests = new ArrayList<>();

		      try {
//		    	  연결 객체 가져오기
		         connection = DBConnecter.getConnection();
//		         작성한 쿼리문을 preparedStatement에 전달
		         preparedStatement = connection.prepareStatement(query);
//		         ?채우기 좌에서 우로 1씩 증가
		         preparedStatement.setString(1, guestName);
		         preparedStatement.setString(2, guestBirth);
	
//		         업데이트 실행
		         preparedStatement.executeUpdate();
		         
		      } catch (SQLException e) {
		         System.out.println(e);
		         System.out.println("insert()에서 쿼리문 오류");
//		         연결 된 순서랑 반대로 진행 
		      } finally {
		         try {
		            if(preparedStatement != null) {
		               preparedStatement.close();
		            }
		            if(connection != null) {
		               connection.close();
		            }
		         } catch (SQLException e) {
		            throw new RuntimeException(e.getMessage());
		         }
		      }
			return guests;
	   }
}
		   





















