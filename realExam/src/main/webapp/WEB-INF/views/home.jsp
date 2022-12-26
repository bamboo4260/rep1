<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  trimDirectiveWhitespaces="true"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>


<P>  <a href="/yangdoll/login">로그인</a> </P>


<p>${userInfo.getMemName() } 님 환영합니다... 위의 링크는 로그아웃으로 바꿔집니다...</p>
</body>
</html>
