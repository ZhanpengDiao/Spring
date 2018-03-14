<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>
<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
	<br /><br />
	Last name: <form:input path="lastName" />
	<br /><br />
	<form:select path="country">
		<!-- <form:option label="Brazil" value="Brazil" /> -->
		<form:options items="${student.countryOptions}" />
	</form:select>
	<br /><br />
	Java <form:radiobutton path="language" value="Java" />
	C++ <form:radiobutton path="language" value="C++" />
	<br /><br />
	Operating Systems:
	Linux <form:checkbox path="operatingSystems" value="Linux" />
	OSX <form:checkbox path="operatingSystems" value="OSX" />
	Windows <form:checkbox path="operatingSystems" value="Windows" />
	<br /><br />
	<input type="submit" value="Submit" />
</form:form>
</body>
</html>