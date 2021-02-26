<!DOCTYPE html>
<html>
<body bgcolor="red">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">Profile</a>
<a href="appointment.jsp">Appointment</a>
<a href="index.html">Logout</a>
<br><br><br>
<form action="apply_appointment.jsp" align="center">
<input type="text" name="patientname" placeholder="Enter Name">
<input type="number" name="phone" placeholder="Enter phone Number">
<input type="email" name="email" placeholder="Enter email">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<select name="bloodgroup">
<option value="A+">A+</option>
<option value="B+">B+</option>
<option value="O+">O+</option>
<option value="AB+">AB+</option>
<option value="B+">B+</option>
<option value="O-">O-</option>
<option value="AB-">AB-</option>
</select>
<select name="specialiazation">
<option value="DENTIST">DENTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>
</select>
<input type="date" name="doa" value="Enter Date of Appointment">
<input type="text" name="toa" value="Enter time of Appointment">
<input type="submit" value="register">

</form>
</body>
</html>