<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${data}<br/>
		<c:if test="${!data.isEmpty()}">
		<c:forEach items="${data}" var="flight">
		${flight}
		 </c:forEach>
		</c:if>
		<c:if test="${data.isEmpty()}">
		<h2>no flight info available</h2>
		</c:if>
		
</body>
</html>