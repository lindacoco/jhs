<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<style>
 table {
    border-collapse: collapse;
    width: 600px;
    margin: 50px;
  }
  
  th, td{
    border: 1px solid black;
  }
  #container{
     width: 800px;
     margin: 0 auto;
  }

</style>
<h1>
	프로젝트 리스트
</h1>
<p><a href="${pageContext.request.contextPath }/project/register">[새 프로젝트 등록]</a></p>
<div id="container">
<table>
  <tr>
     <th>번호</th>
     <th>프로젝트이름</th>
     <th>시작날짜</th>
     <th>종료날짜</th>
     <th>상태</th>
  </tr>
  <c:forEach var="pList" items="${list }">
    <tr>
     <td>${pList.no }</td>
     <td><a href="${pageContext.request.contextPath }/project/read?no=${pList.no}">${pList.name }</a></td>
     <td><fmt:formatDate value="${pList.regDate }" pattern="yyyy-MM-dd"/></td>
     <td><fmt:formatDate value="${pList.endDate }" pattern="yyyy-MM-dd"/></td>
     <td>${pList.progress }</td>
    </tr>
  </c:forEach>

</table>
</div>
</section>

<%@ include file="../include/footer.jsp" %>