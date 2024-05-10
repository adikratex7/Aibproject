<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f5f5f5;
    }
    .container {
        max-width: 600px;
        margin: 50px auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0,0,0,0.1);
    }
    h1 {
        color: #d32f2f;
        text-align: center;
    }
    a {
        display: block;
        text-align: center;
        color: #333;
        text-decoration: none;
        padding: 10px 20px;
        margin: 10px 0;
        background-color: #ffc107;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }
    a:hover {
        background-color: #ffca28;
    }
</style>
</head>
<body>

    <div class="container">
        <h1>Welcome</h1>

        <a href="offers">View Highlights</a>
        <a href="addhighlights">Add Highlights</a>
        <a href="logout">Logout</a>
    </div>

</body>
</html>
