<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.getAttribute("msg");%>
<%request.setAttribute("messages","response");    %>
<script>
	alert("${messges}");
</script>