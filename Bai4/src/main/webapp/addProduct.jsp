<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 7/24/2024
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Thêm Sản Phẩm Mới</title>
</head>
<body>
<h2>Thêm Sản Phẩm Mới</h2>
<form action="add-product" method="post">
    <label for="name">Tên Sản Phẩm:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="file">Upload Ảnh:</label><br>
    <input type="text" id="file" name="file" required><br><br>

    <label for="price">Giá:</label><br>
    <input type="number" id="price" name="price" required><br><br>

    <label for="stock">Số Lượng:</label><br>
    <input type="number" id="stock" name="stock" required><br><br>

    <input type="submit" value="THÊM MỚI SẢN PHẨM">
</form>
</body>
</html>
