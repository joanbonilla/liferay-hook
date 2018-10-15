<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<liferay-util:buffer var="html">
    <liferay-util:include page="/html/portlet/login/login.portal.jsp" useCustomPage="false" />
</liferay-util:buffer>

<div style="border: 4px solid red; padding: 4px;">
    <%= html %>
</div>

<div>Developing with Liferay!</div>