<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


<h1>
<c:out value="Welcome to JSTL"/>
</h1>

<c:if test="${100>200 }">
<h1>Yes</h1>
</c:if>

<c:if test="${100<200 }">
<h1>NO</h1>
</c:if>

<c:forEach var="i" begin="1" end="10" step="1">
<h2> ${i} </h2>
</c:forEach>

