# jsp-practice
9/26 ~ 10/16

# 서버 
사용자의 요청에 맞는 서비스를 제공해주는 것
	요청(request)	:클라이언트 ---> 서버
	응답(response)	:서버 ---> 클라이언트

# 웹(Web)
	 페이지 요청과 응답이 일어나는 장소
	 인터넷에 연결된 컴퓨터들을 통해 사람들이 정보를 공류 할 수 있는 정보 공간

# 웹 서버(http) - 아파치
- 사용자의 요청이 정적 데이터인지 동적 데이터인지 판단한다.
- 정적 데이터일 경우 이미 준비된 HTML문서를 그대로 응답해주며, 동적 데이터라면 웹 컨테이너에 요청을 보낸다.

# 웹 컨테이너(서블릿 컨테이너)
- 동적 데이터일 경우 JSP,서블릿으로 연산 및 제어 그리고 DB까지 접근한다.
- DB에 접근하는 연산을 복잡한 연산이라고 하며,JAVA로 처리한다.
- 동적 데이터가 정제된 데이터(정적 데이터)로 완성되면 이를 웹 서버로 응답해준다.

# WAS(Web Application Serber) - 톰캣
   - 동적 데이터를 처리할 서블릿을 메모리에 할당하며, web.xml을 참조한 뒤 알맞는 서블릿에 재한
   - Thread를 생성한다. 서블릿 응답 객체 생성 후 서블릿에 전달하면, 연산 종료 후 메모리에서 해제시킨다.

# 서블릿(Sevlet)
  - Java코드 안에 HTML코드를 작성할 수 있는 Java프로그램이다.
  - Thread에 의해 서블릿에 있는 service메소드가 호출된다,
  - 전송 방식 요청에 맞게 doGet() 또는 doPost()등의 메소드를 호출한다.
  
# GET방식과 POST방식

* GET
   - 주소에 데이터를 추가하여 전달하는 방식.
   - 보통 쿼리 문자열(query string)에 포함되어 전송되므로,길이에 제한이 있으며 주소에 데이터가 보이므로 보안상 취약점이 존재한다.	
   - 중요한 데이터 혹은 길이가 긴 데이터는 POST방식을 사용하여 요청하는 것이 좋지만 GET방식이 POST방식보다 상대적으로 빠른 전송 방식이다.

* POST
   - 데이터를 별도로 첨부(Header에 첨부)하여 전달하는 방식.
   - 브라우저 히스토리에도 남지 않고 데이터는 쿼리 문자열과는 별도로 전송된다.
   - 따라서 데이터의 길이에 제한도 없으며,GET방식 보다 보안성이 높다.
   - 하지만 GET방식보다 상대적으로 느리다.

# Ajax(Asynchronous Javascript and XML)
- 빠르게 동작하는 동적인 웹 페이지를 만들기 위한 개발 기법이다.
- Ajax는 웹 페이지 전체를 다시 로딩하지 않고도, 웹 페이지 일부분만을 갱신 할 수 있고, 백그라운드 영역에서 서버와 통신하여,그 결과를 웹 페이지 일부분에만 표시할 수 있다.

* Ajax의 장점
  - 웹 페이지 전체를 다시 로딩하지 않고도,웹 페이지 일부분만을 갱신할 수 있다.
  - 웹 페이지가 로드 된 후에 서버로 데이토 요청을 보내거나 받을 수 있다.
  - 다양한 UI(동적 페이지)구현이 가능해진다.
	
* Ajax의 단점
  - 페이지 이동이 없기 때문에 히스토리 관리가 안된다.	
  - 반복적인 데이터를 요청하면 느려지거나 작동하지 않게 된다.

# DBCP(DataBase Connection Pool)
- 사용자 요청이 있을 때 마다 DB연결을 한다면 코드가 복잡해지며, 많은 요청이 있을 때 연결 속도가 저하 될 수 있다.
- 따라서 미리 Connection을 만들어 두고, 필요 시 저장된 공간에서 가져다 쓴 후 반환하는 기법이다.

# JNDI(Java Naming and Directory Interface)
	디렉터리 서비스에서 제공하는 데이터 및 객체를 발견하고 참고하기 위한 자바 API이며, 외부에 있는 객체를 가져오기 위한 기술이다.

# MyBatis Framework
  - 소스코드 안에 SQL문을 작성하면 코드가 길어지고 섞여 있어서 유지보수 및 분업이 쉽지 않다.
  - MyBatis는 기존 JDBC 방식과는 달리 SQL문을 XML파일에 작성함으로써 코드가 줄어들고, SQL문 수정이 편해진다.
  - 또한 DBCP를 사용하여 커넥션을 여러 개 생성하기 때문에 JDBC만 사용하는 것보다는 작업 효율과 가독성이 좋아진다.
