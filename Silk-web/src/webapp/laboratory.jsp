<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Silk Web App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<nav class=" nav justify-content-center navbar navbar-expand-lg navbar-light bg-warning">
    <li class="nav-item">
        <a class="nav-link active" aria-current="page" href="#">CashewApp</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="index.jsp">Home</a>
</nav>
<div>
    <form action="lab" method="post">
        <fieldset aria-activedescendant="center" >
            <legend>Laboratory Section</legend>
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" placeholder="Enter your Name">
            </div>
            <div class="mb-3">
                <label for="mobile" class="form-label">Mobile Number</label>
                <input type="tel" class="form-control" id="mobile" placeholder="Enter MobileNumber">
            </div>
            <div class="mb-3">
                <label for="sample" class="form-label">TestSample</label>
                <input type="text" class="form-control" id="sample" placeholder="Enter TestSample">
            </div>
            <div class="mb-3">
                <label for="address" class="form-label">Address</label>
                <input type="text" class="form-control" id="address" placeholder="Enter Address">
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </fieldset>
</div>
</body>
</html>