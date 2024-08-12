<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>List Page</h1>
<c:forEach var="todo" items="${list1}">

   <div style="border: 1px solid black; padding-left : 10px; padding-right:10px;
   display: inline-block; width: 300px; height: 40px; 
   margin-top : 10px;
   align-items : center; justify-content : center;
   background-color:grey;
   color:white;
   line-height:40px;
   ">
   
   <c:if test='${!todo.finished}'>
   <input type="checkbox" >
   </c:if>
   
   <c:if test='${todo.finished}'>
   <input type="checkbox" checked:chekced >
   </c:if>
   
  
   		${todo.tno}
      제목 :   <a href="/proj3_todo/todo/read?tno=${todo.tno}">${todo.title}</a> 
      마감일 : ${todo.dueDate}
      
      </div>
</c:forEach>
<hr>
   ${ list1[0] }
   <hr>
   ${ list1[0].title }
   <hr>
   ${ list1[0]["title"] } 
   <hr>
   123${null }456
  
 
   
</body>
</html>