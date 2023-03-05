<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청</title>
</head>
<body>



<div class="jumbotron">
	<div class="container"><h1>수강신청</h1>
	</div>
	<hr>
	<div class="container mt-5">
		<form name="registration" action="/ccProject/course/regist" class="form-horizontal" method="post" onsubmit="return checkForm()">
			<div class="form-group row">
				<label class="col-sm-2">아이디</label>
				<div class="col-sm-3">
					<input type="text" name="userId" class="form-control">
				</div>
			</div>
			<br>
			<div class="form-group row">
				<label class="col-sm-2">신청과목</label>
				<div class="col-sm-3">
					<input type="text" name="studyCode" class="form-control">
				</div>
			</div>
							

			<br>
			<input type="submit" class="btn btn-primary" value="수강신청">
		</form>
		
	</div>
</div>


</body>
</html>