<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Student Registration Page</title>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h1>Student Registration</h1>
			</div>
			<div class="panel-body">
				<form action="doSaveStudent" method="post"
					class="form-horizontal">
					<div class="form-group">
						<label class="control-label col-sm-3" for="studentRollNo">Roll
							No :</label>
						<div class="input-group">
							<div class="col-sm-5">
								<span class="input-group-addon">123</span> <input type="text"
									name="studentRollNo" placeholder="Enter Student RollNO" id="studentRollNo" class="form-control">
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="studentName">Name
							:</label>
						<div class="input-group">
							<div class="col-sm-5">
								<span class="input-group-addon">ABC</span> <input type="text"
									name="studentName" placeholder="Enter Student Name" id="studentName" class="form-control">
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="studentAge">Age
							:</label>
						<div class="input-group">
							<div class="col-sm-5">
								<span class="input-group-addon">12</span> <input type="text"
									name="studentAge" placeholder="Enter Student Age" id="studentAge" class="form-control">
							</div>
						</div>
					</div>

					<label class="control-label">Address :</label>

					<div class="form-group">
						<label class="control-label col-sm-3">Street :</label>
						<div class="input-group">
							<div class="col-sm-5">
								<span class="input-group-addon">ABC</span> <input type="text"
									name="street" placeholder="Enter Street name">
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3" for="city">City :</label>
						<div class="input-group">
							<div class="col-sm-5">
								<span class="input-group-addon">ABC</span> <input type="text"
									name="city" placeholder="Enter Student City" id="city" class="form-control">
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3" for="state">State :</label>
						<div class="input-group">
							<div class="col-sm-5">
								<span class="input-group-addon">ABC</span> <input type="text"
									name="state" placeholder="Enter Student State" id="state" class="form-control">
							</div>
						</div>
					</div>

	<div class="form-group">
		<label class="control-label col-sm-3" for="zip">ZIP :</label>
		<div class="input-group">
			<div class="col-sm-5">
				<span class="input-group-addon">509190</span> <input type="text"
					name="zip" placeholder="Enter Area PIN code" id="zip" class="form-control">
			</div>
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-3">Course Name :</label>
		<div class="input-group">
			<div class="col-sm-5">
				<span class="input-group-addon">509190</span> <select
					name="courseName" class="form-control">
					<option value="MECH" />
					<option value="ECE" />
					<option value="CSE" />
					<option value="IT" />
				</select>
			</div>
		</div>
	</div>

	<input type="submit" value="Save" class="btn btn-primary">
	<a href="viewAllLocs"><input type="button" value="View All Students" class="btn btn-primary"></a>
	<span>
	${responseMessage }
	</span> 

	</form>
	</div>
	</div>
	</div>

</body>
</html>