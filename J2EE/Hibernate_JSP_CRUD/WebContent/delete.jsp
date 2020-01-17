<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="cust" class="beans.CustomerBeans" scope="session"/>
<jsp:setProperty property="*" name="cust"/>
${sessionScope.cust.delete()}
<c:redirect url="home.jsp"/>
