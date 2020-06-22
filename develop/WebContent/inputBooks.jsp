<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/base_style.css">
<link rel="stylesheet" href="css/input.css">
<title>蔵書登録</title>
</head>
<body>
	<header>蔵書登録
		<form action="Input" method="post">
			<br><a href="main.jsp">メインページへ</a>
			<br><a href="ownBooks.jsp">所有図書の検索</a>
			<br><a href="purchasePlans.jsp">購入予定図書</a>
		</form>

	</header>
	<!-- Input.javaのPOSTメソッドに送信 -->
	<form action="Input"method="POST" >
		<p>本の名前:<input type="text" name="bookTitleInput"></p>
		<p>本の著者：<input type="text" name="bookWriterInput"></p>
		<p>出版社：   <input type="text" name="bookCompanyInput"></p>
		<input type="submit" name="submit" value="登録">
	</form>
</body>
</html>