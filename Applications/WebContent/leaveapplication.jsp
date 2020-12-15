<!DOCTYPE html>
<html>
<body bgcolor="pink">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE LEAVE APPLICATION</h1></center>
<br><br><br>
<a href="emp_home.html">Home</a>
<a href="emp_profile.jsp">Profile</a>
<a href="leaveapplication.jsp">Leave Application</a>
<a href="index.html">Logout</a>
<br><br><br>
<form action="apply_leaveapplication.jsp" align="center">
<input type="text" name="name" placeholder="Enter Name">
<input type="email" name="email" placeholder="Enter email">
<input type="text" name="reason" placeholder="Please specify reason">
<input type="date" name="doa" placeholder="From">
<input type="date" name="doj" value="Till">
<select name="department">
<option value="DEVELOPER">DEVELOPER</option>
<option value="TESTER">TESTER</option>
<option value="OTHER">OTHER</option>
</select> 
<input type="submit" value="register">

</form>
</body>
</html>