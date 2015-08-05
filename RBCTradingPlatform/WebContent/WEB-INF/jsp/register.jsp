<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<table id="registration">
	<tbody>
		<sf:form id="registrationform" modelAttribute="account"
			method="POST" action="CompleteRegistration">
			<tr>
				<td>
					<sf:label path="username" for="username">User Name:</sf:label>
				</td>
				<td>
					<sf:input path="username" name="username" id="username"/>
					<sf:errors path="username" cssClass="formError" />
				</td>
			</tr>
			<tr>
				<td>
					<sf:label path="password" for="password">Password:</sf:label>
				</td>
				<td>
					<sf:input path="password" type="password" name="password" id="password" />
					<sf:errors path="password" cssClass="formError" />
				</td>
					<c:if test="${not empty errorMessage}">
									<c:out value="${errorMessage}"/>
					</c:if>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register" /></td>
			</tr>
		</sf:form>
	</tbody>
</table>

