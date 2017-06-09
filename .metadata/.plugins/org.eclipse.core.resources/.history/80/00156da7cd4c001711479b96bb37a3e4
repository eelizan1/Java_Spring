<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome!</title>
</head>
<body>
	<%
		// get ahold of the string array that was stored in the welcome servlet 
		// must cast as a string array because it's stored as an object 
		String messages[] = (String[]) request.getAttribute("myWelcomeMessage"); 
		String welcomeMessage = ""; 
		// go through message array and build a string
		for(String msg: messages){
			welcomeMessage += msg + " "; 
		}
		out.print(welcomeMessage); 
	%>
</body>
</html>