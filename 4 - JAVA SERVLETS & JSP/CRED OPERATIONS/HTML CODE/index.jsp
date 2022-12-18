
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
  <title>STUDENT DETAIL FORM</title>
</head>
 
<body>
<h2>STUDENT DETAIL FORM</h2>
<form method="post" action="Create_Servlet">
  <fieldset>
    <legend>Personal Particular</legend>
    Name: <input type="text" name="name" /><br /><br />
    RollNo: <input type="text" name="RollNo" /><br /><br />
    Specialisation: <input type="radio" name="Specialisation" value="Full Stack" checked />Full Stack
    <input type="radio" name="Specialisation" value="Data Science" />Data Science
    <input type="radio" name="Specialisation" value="AI_ML " />AI ML<br /><br />
  </fieldset>
 
  <input type="hidden" name="secret" value="888" />
  <input type="submit" value="SEND" />
  <input type="reset" value="CLEAR" />
</form>
</body>
</html>