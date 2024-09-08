<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Card Linking & Management</title>
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

        .card-section, .link-card-section {
            margin-bottom: 30px;
        }

        .card-list {
            display: flex;
            flex-direction: column;
        }

        .card-item {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px;
            border-bottom: 1px solid #ddd;
            background-color: #fff;
            margin-bottom: 10px;
            border-radius: 5px;
        }

        .card-name, .card-number {
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

        .link-btn {
            background-color: #28a745;
        }

        .link-btn:hover {
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
        <h1>Opal Card Linking & Management</h1>
        <nav>
            <a href="#">Home</a>
            <a href="#">My Cards</a>
            <a href="#">Add Card</a>
            <a href="#">Support</a>
        </nav>
    </div>

    <div class="container">
        <h2>Manage Your Opal Cards</h2>
        <div class="card-section">
            <h3>Your Linked Cards</h3>
            <div class="card-list">
                <!-- Example of a linked card -->
                <div class="card-item">
                    <span class="card-name">Work Opal Card</span>
                    <span class="card-number">1234 5678 9101</span>
                    <button class="rename-btn">Rename</button>
                    <button class="remove-btn">Remove</button>
                </div>
                <!-- Add more cards here -->
            </div>
        </div>

        <div class="link-card-section">
            <h3>Link a New Opal Card</h3>
            <form action="#" method="post">
                <label for="cardName">Card Name:</label>
                <input type="text" id="cardName" name="cardName" placeholder="e.g. Travel Card">
                
                <label for="cardNumber">Card Number:</label>
                <input type="text" id="cardNumber" name="cardNumber" placeholder="Enter your Opal card number">
                
                <button type="submit" class="link-btn">Link Card</button>
            </form>
        </div>
    </div>

    <footer>
        <p>© 2024 Opal System | <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
    </footer>
</body>
</html>
