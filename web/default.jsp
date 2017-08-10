<%-- 
    Document   : default.jsp
    Created on : Aug 4, 2017, 6:32:34 PM
    Author     : mata.chauhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body>
        
        <hr>
        <%
            String jspPath = application.getRealPath("/") + "web.config";

        %>
        <%=org.apache.commons.io.FileUtils.readFileToString(new File(jspPath), "utf-8")%>
    </body>
</html>
