<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-" style="background-color:warning;">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Contact</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div>
    <div align="center">
        <h1 align="center">Welcome you for Donar page!!</h1>
        <form action="mix" method="post">
            FirstName <input type="text" placeholder="Enter your FirstName" name="fname"/><br><br>
            LastName <input type="text" placeholder="Enter your LastName" name="lname" maxlength="3" minlength="1" required/><br><br>
            Email <input type="email" placeholder="Enter your email" name="email"/><br><br>
            Amount <input type="amount" placeholder="Enter your amount" name="amount"/><br><br>
            Cause <input type="text" placeholder="Enter your Cause" name="cause"/><br><br>
            <input type="submit" placeholder="submit" value="submit"/> <br><br>

        </form>
    </div>
</div>
</body>
</html>
