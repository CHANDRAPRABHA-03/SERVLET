<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fire Details Page </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <style>
    body{
    background-color : orange;
    }
    input{
    color:green
    }
    </style>
    </head>
<body>
<nav class="navbar navbar-expand-lg navbar-bg:warning;">
    <div class="container-fluid">

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div>
    <div align="center">
        <h1 align="center">Welcome you for Feedback page!!</h1>
        <form action="mix" method="get">
            Name <input type="text" placeholder="Enter your Name" name="name"/><br><br>
            Email <input type="email" placeholder="Enter your email" name="email"/><br><br>
            MobileNo <input type = "mobile" placeholder="Enter Your MobileNo" name="mobile"/><br><br>
            Address <input type="address" placeholder="Enter your address" name="address"/><br><br>
            Feedback <input type="text" placeholder="Enter Your Feedback" name="feedback"/><br><br>
            <input type="submit" placeholder="submit" value="submit"/> <br><br>

        </form>
    </div>
</div>
<div align="center">Click Home to return Home Page</div>
</body>
</html>
