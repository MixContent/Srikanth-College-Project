
<html>
<body>
	<a href="www.google.co.in">
	<input type="button" value="Google">
	</a>
	<br>
	<a href="college/StudentRegistration">
	Register
	</a>
	<br>
	<a href="college/getPassedOutStudents?courseName=${courseName}"><input
		type="radio" name="courseName" value="MECH">MECH <input
		type="radio" name="courseName" value="ECE">ECE <input
		type="radio" name="courseName" value="EEE">EEE <input
		type="radio" name="courseName" value="CSE">CSE <input
		type="radio" name="courseName" value="IT">IT
		<br>
		Select
		any one and Click here to getPassedOutStudents 
		</a>
		<br>
	<a href="college/studentsListByCourse?courseName=${courseName }"><input
		type="radio" name="courseName" value="MECH">MECH <input
		type="radio" name="courseName" value="ECE">ECE <input
		type="radio" name="courseName" value="EEE">EEE <input
		type="radio" name="courseName" value="CSE">CSE <input
		type="radio" name="courseName" value="IT">IT
		<br>
		Select
		any one andClick here to get studentsListByCourset
		</a>
		<br>
	<a href="college/topStudentByCourse?courseName=${courseName }"><input
		type="radio" name="courseName" value="MECH">MECH <input
		type="radio" name="courseName" value="ECE">ECE <input
		type="radio" name="courseName" value="EEE">EEE <input
		type="radio" name="courseName" value="CSE">CSE <input
		type="radio" name="courseName" value="IT">IT
		<br>
		Select
		any one and">Click here to get topStudentByCourse
		</a>
		<br>
	<a href="college/getFailedStudents?courseName=${courseName }"><input
		type="radio" name="courseName" value="MECH">MECH <input
		type="radio" name="courseName" value="ECE">ECE <input
		type="radio" name="courseName" value="EEE">EEE <input
		type="radio" name="courseName" value="CSE">CSE <input
		type="radio" name="courseName" value="IT">IT
		<br>
		Select
		any one and Click here to get FailedStudents
		</a>
		<br>
	<a href="college/getStudentsByCity?city=${city } "><input
		type="search" name="city">
		Click here to get StudentsByCity
		</a>
		<br>
	<a href="college/getStudentsByState?state=${state } "><input
		type="search" name="state">
		Click here to get StudentsByState
		</a>
		<br>
	<a href="college/getStudentsByMinAge?StudentAge=${studentAge }"><input
		type="number" name="studentAge" value="20" readonly="readonly">
		Click
		here to get StudentsByMinAge
		</a>
		<br>
</body>
</html>
