<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Kindergarten Payment Control</title>
</head>
<body>
    <h1>playfulness Payment Control</h1>
    
    <h2>Add New Parent</h2>
    <form action="addParent" method="post">
        Parent Name: <input type="text" name="parentName" required><br>
        Email: <input type="email" name="email" required><br>
        Phone: <input type="text" name="phone" required><br>
        <input type="submit" value="Add Parent">
    </form>

    <h2>Add New Student</h2>
    <form action="addStudent" method="post">
        Student Name: <input type="text" name="studentName" required><br>
        Age: <input type="number" name="age" required><br>
        Parent ID: <input type="number" name="parentId" required><br>
        <input type="submit" value="Add Student">
    </form>

    <h2>Generate Payment Statement</h2>
    <form action="generatePaymentStatement" method="post">
        Student ID: <input type="number" name="studentId" required><br>
        <input type="submit" value="Generate Payment Statement">
    </form>

    <h2>Query Payments for Student</h2>
    <form action="queryPayments" method="post">
        Student ID: <input type="number" name="studentId" required><br>
        <input type="submit" value="Query Payments">
    </form>

    <h2>Delete Parent</h2>
    <form action="deleteParent" method="post">
        Parent ID: <input type="number" name="parentId" required><br>
        <input type="submit" value="Delete Parent">
    </form>

    <h2>Delete Student</h2>
    <form action="deleteStudent" method="post">
        Student ID: <input type="number" name="studentId" required><br>
        <input type="submit" value="Delete Student">
    </form>
</body>
</html>
