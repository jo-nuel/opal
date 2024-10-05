<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="uts.isd.model.*"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Opal Card</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #0066cc;
            color: white;
            text-align: center;
            padding: 1em 0;
        }

        h1, h2 {
            color: #004080;
        }

        .container {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        label {
            display: block;
            margin-top: 10px;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"], input[type="number"], select {
            padding: 10px;
            width: 100%;
            border: 1px solid #cccccc;
            border-radius: 4px;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #004080;
            color: white;
            border: none;
            border-radius: 4px;
            padding: 10px 20px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #003366;
        }

        a {
            color: #0066cc;
            text-decoration: none;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<header>
    <h1>Opal Card Management</h1>
</header>

<div class="container">
    <h2>Add New Opal Card</h2>

    <form action="AddOpalCardServlet" method="post">
        <label for="cardNumber">Card Number:</label>
        <input type="text" id="cardNumber" name="cardNumber" required>

        <label for="cardName">Card Name:</label>
        <input type="text" id="cardName" name="cardName" required>

        <label for="balance">Initial Balance:</label>
        <input type="number" id="balance" name="balance" step="0.01" required>

        <label for="cardStatus">Card Status:</label>
        <select id="cardStatus" name="cardStatus" required>
            <option value="ACTIVE">Active</option>
            <option value="DISABLED">Disabled</option>
        </select>

        <input type="submit" value="Add Card">
    </form>

    <br>
    <a href="ListOpalCardsServlet?accountId=1">Back to Card List</a>
</div>

</body>
</html>
