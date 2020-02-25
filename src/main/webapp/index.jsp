<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Spring Rest Demo !!! </h1>
 <a href="test/hello">See Hello Rest Message</a>
 <!-- or if  we wanna give /test/hello we should write whole path like
 <a href="${pageContext.request.contextPath}/test/hello">See Hello Rest Message</a>
 
  -->
  <hr />
  
  <a href="api/students">List Students</a>
  
</body>
</html>