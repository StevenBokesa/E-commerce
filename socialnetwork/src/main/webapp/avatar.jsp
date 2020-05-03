<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ChangeProfile" enctype="multipart/form-data" method="post">													
		<div class="form-group">
			<label>Avatar*</label>
			<div class="setting-dp">
			<img src="images/event-view/my-dp.jpg" alt="">
			</div>														
			<div class="setting-upload">
			<span>Upload a new avatar.</span>
			<div class="addpic" id="OpenImgUpload1">															
			<input type="file" id="file1" name="avatar" size="50"/>
			<label for="file">Choose File</label>
			<p>JPEG / PNG 150x150*</p>
			</div>
			</div>
														
			</div>
			<div class="add-profile-btn">
			<button class="setting-save-btn" type="submit">Save Changes</button>
		</div>
	</form>
										
</body>
</html>