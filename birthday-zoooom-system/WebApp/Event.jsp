<%@ page isELIgnored="false" %>
<html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Birthday Ceremony</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: linear-gradient(to right, #fbc2eb, #a6c1ee);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            background: #fff;
            padding: 40px 60px;
            border-radius: 20px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            width: 420px;
        }

        h2, h3 {
            text-align: center;
            color: #6a1b9a;
            margin-bottom: 25px;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            font-weight: bold;
            margin: 8px 0 4px;
            color: #4a148c;
        }

        input[type="text"],
        input[type="date"],
        input[type="tel"],
        input[type="number"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 8px;
            outline: none;
            transition: 0.3s;
        }

        input:focus {
            border-color: #ab47bc;
            box-shadow: 0 0 5px #ce93d8;
        }

        .submit-btn {
            margin-top: 20px;
            padding: 12px;
            font-size: 16px;
            font-weight: bold;
            background: linear-gradient(45deg, #ff4081, #f06292);
            color: white;
            border: none;
            border-radius: 30px;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        .submit-btn:hover {
            background: linear-gradient(45deg, #d81b60, #f06292);
            transform: scale(1.03);
        }

        .message {
            text-align: center;
            font-weight: bold;
            margin: 10px 0;
        }

        .success {
            color: green;
        }

        .error {
            color: red;
        }

        hr {
            margin: 30px 0;
            border: none;
            height: 1px;
            background: #ddd;
        }

        .search-section {
            text-align: center;
        }

        .search-section form {
            display: flex;
            flex-direction: column;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Register Birthday Event</h2>

    <!-- Success/Failure Messages -->
    <div class="message success">${success}</div>
    <div class="message error">${failure}</div>

    <!-- Birthday Registration Form -->
    <form action="Birthday" method="post">
        <label>Name:</label>
        <input type="text" name="person_name"  pattern="[a-zA-Z0-9 ]*" title="No special characters allowed" required>

        <label>Date:</label>
        <input type="date" name="event_date" required>

        <label>Location:</label>
        <input type="text" name="location" pattern="[a-zA-Z0-9 ]*" title="No special characters allowed" required>

        <label>Contact:</label>
        <input type="tel" name="contact" required pattern="[0-9]{10}" title="Enter 10-digit number" maxlength="10" minlength="10">

        <label>Relation:</label>
        <input type="text" name="relation" placeholder="E.g., Friend, Sister" pattern="[a-zA-Z0-9 ]*" title="No special characters allowed"  required>

        <label>Cake Info:</label>
        <input type="text" name="cake_info" placeholder="E.g., Chocolate 2kg Eggless" pattern="[a-zA-Z0-9 ]*" title="No special characters allowed" required>

        <input type="submit" value="Register" class="submit-btn">
    </form>

    <hr>

    <!-- Search by ID -->
    <div class="search-section">
        <h3>View Event by ID</h3>
        <form action="Birthday" method="get"> <!-- If using BirthdayServlet for GET too -->
            <input type="number" name="birthdayId" placeholder="Enter Event ID" required>
            <input type="submit" value="Search" class="submit-btn">
        </form>
    </div>
</div>
</body>
</html>
