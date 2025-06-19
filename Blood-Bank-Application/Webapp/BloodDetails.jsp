<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Duster Information Collector</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="p-3">
    <a href="index.jsp" class="btn btn-primary">Home Page</a>
</div>

<div class="container py-5">

    <form action="search" method="get" class="row g-3">

        <label class="form-label">Blood ID</label>
        <input type="number" name="bloodId" class="form-control" required placeholder="Enter Blood Id">



        <div class="col-12 text-center mt-4">
            <input type="submit" value="Search" class="btn btn-success btn-lg px-5">
        </div>

    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</body>
</html>