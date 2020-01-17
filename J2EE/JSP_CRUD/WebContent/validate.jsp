<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="shop" class="beans.CustBeans" scope="session"/>
<jsp:setProperty property="*" name="shop"/>
<c:redirect url="${sessionScope.shop.validateUser()}.jsp"/>
 