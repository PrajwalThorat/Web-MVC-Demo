<%@page import="java.util.* " %>

<html>
<body bgcolor="orange">
<h1 align="center">Beer Recommendation Page</h1>
<p>
<%
List styles=(List)request.getAttribute("styles");
Iterator it=styles.iterator();
while(it.hasNext())
{
	out.println("<br> Try : "+it.next());
}
%>
</body>
</html>