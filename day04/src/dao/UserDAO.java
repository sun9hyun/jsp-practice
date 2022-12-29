package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import com.koreait.mybatis.config.MyBatisConfig;

import vo.UserVO;

public class UserDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	public SqlSession sqlSession;
	
	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlsessionFactory().openSession(true);
	} // UserDAO선언 
	
//	중복검사
	public boolean checkId(String userId) {
		return (Integer)sqlSession.selectOne("User.checkId", userId) == 1;
	}
		
//	회원가입
	public void insert(UserVO userVO) {
		sqlSession.insert("User.insert", userVO);

//  로그인
	
//	 public int login(String userId, String userPassword) {
//		 sqlSession.selectList("User.login", userId,userPassword);
	 }
}









