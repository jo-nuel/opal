<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saved Trips</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        /* Header styling */
        .header {
            background-color: #007cba;
            color: white;
            padding: 15px;
            text-align: center;
        }

        .header nav a {
            color: white;
            margin: 0 10px;
            text-decoration: none;
            font-size: 1.1em;
        }

        .header nav a:hover {
            text-decoration: underline;
        }

        /* Main container */
        .container {
            width: 80%;
            margin: 20px auto;
            padding: 20px;
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
        }

        h3 {
            color: #007cba;
            margin-bottom: 15px;
        }

        .trip-section, .add-trip-section {
            margin-bottom: 30px;
        }

        .trip-list {
            display: flex;
            flex-direction: column;
        }

        .trip-item {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px;
            border-bottom: 1px solid #ddd;
            background-color: #fff;
            margin-bottom: 10px;
            border-radius: 5px;
        }

        .trip-name {
            font-size: 1.1em;
        }

        button {
            padding: 8px 12px;
            font-size: 1em;
            background-color: #007cba;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #005f9a;
        }

        /* Form styling */
        form {
            display: flex;
            flex-direction: column;
        }

        label {
            margin: 10px 0 5px;
            font-size: 1.1em;
        }

        input {
            padding: 10px;
            font-size: 1em;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 15px;
        }

        .save-btn {
            background-color: #28a745;
        }

        .save-btn:hover {
            background-color: #218838;
        }

        /* Footer styling */
        footer {
            text-align: center;
            padding: 15px;
            background-color: #007cba;
            color: white;
            position: absolute;
            bottom: 0;
            width: 100%;
        }

        footer a {
            color: white;
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Opal Saved Trips</h1>
        <nav>
            <a href="#">Home</a>
            <a href="#">My Trips</a>
            <a href="#">Add Trip</a>
            <a href="#">Support</a>
        </nav>
    </div>

    <div class="container">
        <h2>Manage Your Saved Trips</h2>
        
        <!-- Display Saved Trips -->
        <div class="trip-section">
            <h3>Your Saved Trips</h3>
            <div class="trip-list">
                <!-- Example of a saved trip -->
                <div class="trip-item">
                    <span class="trip-name">Work Commute</span>
                    <button class="rename-btn">Rename</button>
                    <button class="remove-btn">Remove</button>
                </div>
                <!-- Add more trips dynamically -->
            </div>
        </div>

        <!-- Add a new trip -->
        <div class="add-trip-section">
            <h3>Add a New Trip</h3>
            <form action="#" method="post">
                <label for="tripName">Trip Name:</label>
                <input type="text" id="tripName" name="tripName" placeholder="e.g. Daily Commute">
                
                <label for="tripRoute">Trip Route:</label>
                <input type="text" id="tripRoute" name="tripRoute" placeholder="Enter your route">
                
                <button type="submit" class="save-btn">Save Trip</button>
            </form>
        </div>
    </div>

    <footer>
        <p>© 2024 Opal System | <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
    </footer>
</body>
</html>
