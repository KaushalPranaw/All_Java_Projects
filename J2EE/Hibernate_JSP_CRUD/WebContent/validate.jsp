 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="cust" class="beans.CustomerBeans" scope="session"/>
<jsp:setProperty property="*" name="cust"/>
 
<c:redirect url="${sessionScope.cust.validate()}.jsp"/>  
 
 
 