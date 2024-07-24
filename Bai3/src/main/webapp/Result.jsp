<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" href="resources/css/bai3">
</head>
<body>
<table>
  <tr>
    <th>STT</th>
    <th>Name</th>
    <th>Image</th>
    <th>Price</th>
    <th>Stock</th>
    <th>Action</th>
  </tr>
  <c:forEach items="${Product}" var="pr">
    <tr>
      <td>${pr.id}</td>
      <td>${pr.name}</td>
      <td>
        <img src="${pr.image}" alt="">
      </td>
      <td>${pr.price}</td>
      <td>${pr.stock}</td>
      <td>
        <button class="edit-btn">Edit</button>
      </td>
      <td>
        <button class="del-btn">Delete</button>
      </td>
    </tr>
  </c:forEach>
</table>
<a href="index.jsp">Back to Home</a>
</body>
</html>