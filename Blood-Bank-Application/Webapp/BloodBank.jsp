<!DOCTYPE html>
<html>
<head>
    <title>Blood Bank Application</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<!-- Home Button -->
<div class="p-3">
    <a href="index.jsp" class="btn btn-primary">Home Page</a>
</div>

<!-- Main Container -->
<div class="container py-5">
    <h2 class="text-center text-primary mb-4">Add Your Details to Our Website</h2>
    <p class="text-center">Please provide your information below:</p>

    <!-- Success and Failure Messages -->
    <div class="text-center">
        <span style="color:green;">${success}</span>
        <span style="color:red;">${failure}</span>
    </div>

    <!-- Blood Donor Form -->
    <form action="blood" method="post" class="row g-3">

        <div class="col-md-6">
            <label class="form-label">Donor Name</label>
            <input type="text" name="donarName" class="form-control" required value="${dto.donarName}">
        </div>

        <div class="col-md-6">
            <label class="form-label">Blood Group</label>
            <select class="form-select" name="bloodGroup" required>
                <option selected disabled value=" ">Choose group</option>
                <option>A+</option><option>A-</option>
                <option>B+</option><option>B-</option>
                <option>O+</option><option>O-</option>
                <option>AB+</option><option>AB-</option></select>
        </div>

        <div class="col-md-6">
            <label class="form-label">Contact No</label>
            <input type="tel" name="contactNo" class="form-control" required value="${dto.contactNo}">
        </div>

        <div class="col-md-6">
            <label class="form-label">Donor Age</label>
            <input type="number" name="donarAge" class="form-control" required value="${dto.donarAge}">
        </div>

        <div class="col-md-6">
            <label class="form-label">Gender</label>
            <input type="text" name="gender" class="form-control" required value="${dto.gender}">
        </div>

        <div class="col-md-6">
            <label class="form-label">Location</label>
            <input type="text" name="location" class="form-control" value="${dto.location}">
        </div>

        <div class="col-12 text-center mt-4">
            <input type="submit" value="Submit" class="btn btn-success btn-lg px-5">
        </div>
    </form>
</div>

<!-- Scripts -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

</body>
</html>
