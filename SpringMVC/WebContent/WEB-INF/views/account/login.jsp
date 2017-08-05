<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	${message}
	<form action="login.php" method="post">
	<div>
		<label>Username</label>
		<input name="id">
	</div>
	
	<div>
		<label>Password</label>
		<input name="password">
	</div>
		<button name="way1">Login way 1</button>
		<button name="way2">Login way 2</button>
		<button name="way3">Login way 3</button>
	</form>
</body>
</html>