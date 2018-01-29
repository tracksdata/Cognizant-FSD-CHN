<h1>  ${100+200}  </h1>

<h1> ${1000>200} </h1>


<%

session.setAttribute("sname", "Praveen-Ses");
request.setAttribute("rname", "Praveen-Req");
application.setAttribute("aname", "Praveen-App");

%>

<h1>

Session: ${sessionScope.sname}

</h1>

<h1>request: ${requestScope.rname}  </h1>
<h1>Application: ${applicationScope.aname}</h1>