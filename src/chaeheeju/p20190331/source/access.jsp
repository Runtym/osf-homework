<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.getAttribute("msg");%>
<%request.setAttribute("message","response");    %>
<script>
	alert("${messge}");
</script>