<%--
  Created by IntelliJ IDEA.
  User: Mohamed_Ozil
  Date: 7/16/2020
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>StudentInfo</title>
  </head>
  <body>
  <table>
  <form method="get" action="ServletStudent">
    <label>Name:</label>
    <input type="text" name="name"><br/> <br/>
    <label>Registration Number:</label>
    <input type="text" name="reg"><br/> <br/>
    <label>Grade:</label>
    <input type="text" name="grade"><br/> <br/>
    <label>Phone Number:</label>
    <input type="number" name="phone"><br/> <br/>
    <label>Email:</label>
    <input type="email" name="email"><br/> <br/>
    <label>Gender:</label>
    <input type="radio" name="gender">Male
    <input type="radio" name="gender">Female
    <br/><br/>
    <label>Courses:</label>
    <select name="course">
      <option>Mobile</option>
    <option>website</option>
      <option>Quickbook</option>
      <option>Research</option>
      <option>Networking</option>
      <option>Visual Programming</option>
    </select><br/><br/>
    <input type="button" name="submit" value="Submit">
    <input type="reset" name="" value="Reset">

  </form>
  </table>
  </body>
</html>
