<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>������ web MVC�����ϱ�</h1>
	<hr/>
	<h3>jsp�� �ڵ� ����ϱ� : <%= request.getAttribute("msg") %></h3>
	<h3>EL�� ����ϱ� : ${msg}</h3>
</body>
</html>