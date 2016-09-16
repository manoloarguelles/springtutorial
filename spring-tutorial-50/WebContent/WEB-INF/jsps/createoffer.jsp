<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Offer</title>
</head>
<body>

<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">

<table >
<tr><td>Name:  </td> <td><sf:input name="name" path="name" type="text" /><br/><sf:errors path="name" cssClass="error"> </sf:errors></td></tr>
<tr><td>Email:  </td> <td><sf:input name="email"  path="email" type="text" /><br/><sf:errors path="email" cssClass="error"> </sf:errors></td></tr>
<tr><td>Your Offer:  </td> <td><sf:textarea  name="text" path="text" rows="10" cols="10" ></sf:textarea><br/><sf:errors path="text" cssClass="error"> </sf:errors></td></tr>
</table>
<input value="Create advert" type="submit" />
</sf:form>

</body>
</html>