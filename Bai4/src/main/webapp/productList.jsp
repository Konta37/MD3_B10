<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Danh Sách Sản Phẩm</title>
</head>
<body>
<h2>Danh Sách Sản Phẩm</h2>
<ul>
    <c:forEach var="pr" items="${Product}">
        <li>
            <h3>${pr.name}</h3>
            <p>Giá: ${pr.price}</p>
            <p>Số Lượng: ${pr.stock}</p>
            <img src="${pr.imageBase64}" alt="${pr.name}" width="100" height="100"/>
        </li>
    </c:forEach>
</ul>
<a href="addProduct.jsp">Thêm Sản Phẩm Mới</a>
<a href="index.jsp">Back to Home</a>
</body>
</html>
