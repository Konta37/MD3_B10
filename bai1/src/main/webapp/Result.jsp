<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" href="resources/css/index.css">
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table>
  <tr>
    <th>Tên</th>
    <th>Ngày Sinh</th>
    <th>Địa Chỉ</th>
    <th>Ảnh</th>
  </tr>
  <c:forEach items="${Customer}" var="cus">
    <tr>
      <td>${cus.name}</td>
      <td>${cus.dateOfBirth}</td>
      <td>${cus.address}</td>
      <td>
        <img src="${cus.customerImage}" alt="">
      </td>
    </tr>
  </c:forEach>
</table>
<a href="index.jsp">Back</a>
</body>
</html>