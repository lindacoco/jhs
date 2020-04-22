<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 

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
  #btns{
    width: 400px;
    margin:0 auto;
  }

</style>
<script>
   $(function(){
	   $("#btnMod").click(function(){
		   location.href="${pageContext.request.contextPath }/project/update?no=${project.no }";
	   })
	   $("#btnDel").click(function(){
		   var dd = confirm("삭제하시겠습니까?");
		   if(dd){
		      location.href="${pageContext.request.contextPath }/project/delete?no=${project.no }";
		   }
	   })
	    $("#btnReturn").click(function(){
		   location.href="${pageContext.request.contextPath }/project/list";
	   })
   })
</script>
<h1>
	프로젝트 상세보기
</h1>
<p><a href="${pageContext.request.contextPath }/project/list">[목록으로]</a></p>
<div id="container">
<table>
  <tr>
     <th>번호</th>
     <th>프로젝트이름</th>
     <th>시작날짜</th>
     <th>종료날짜</th>
     <th>상태</th>
  </tr>
 
    <tr>
     <td>${project.no }</td>
     <td>${project.name }</td>
     <td><fmt:formatDate value="${project.regDate }" pattern="yyyy-MM-dd"/></td>
     <td><fmt:formatDate value="${project.endDate }" pattern="yyyy-MM-dd"/></td>
     <td>${project.progress }</td>
    </tr>


</table>
<div id="btns">
  <input type="submit" value="[수정]" id="btnMod">
  <input type="submit" value="[삭제]" id="btnDel">
  <input type="submit" value="[돌아가기]" id="btnReturn">
 </div> 
</div>
</section>

<%@ include file="../include/footer.jsp" %>