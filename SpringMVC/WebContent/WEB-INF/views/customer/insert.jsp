<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Insert</h1>
	${mess}
	<h4>${sessionScope.x}</h4>
	<h4>${applicationScope.x}</h4>
	<form action="insert.php">
		<button name="a">A</button>
		<button name="b">B</button>
	</form>
</body>
</html>