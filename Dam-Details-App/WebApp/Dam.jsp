<!DOCTYPE html>
<html>
<head>
    <title>Dam Details Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<div>
    <nav class="navbar navbar-light bg-light">
        <div class="container-fluid">
            <span class="navbar-text">Enter Dams Information</span>
        </div>
    </nav>
</div>
<br><br>
<div class="container">
    <form action="Dam" method="post">
        <div class="mb-3">
            <label class="form-label">Dam Name</label>
            <input type="text" class="form-control" name="damName" placeholder="Enter Dam Name" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Location</label>
            <select class="form-select" name="location" required>
                <option selected disabled value="">Choose Location</option>
                <option>Almatti</option>
                <option>Beechanahalli</option>
                <option>Beerwal</option>
                <option>Ganeshgudi</option>
                <option>Gajanur</option>
                <option>Gorur</option>
                <option>Hidkal</option>
                <option>Hudgur</option>
                <option>Kargal</option>
                <option>Karanja</option>
                <option>KRS(Krishna Raja Sagara)</option>
                <option>Lakkavalli</option>
                <option>Mari Kanive</option>
                <option>Markonahalli</option>
                <option>Munirabad</option>
                <option>Navilatirtha</option>
                <option>Narayanapura</option>
                <option>Sulekere</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">District</label>
            <select class="form-select" name="district" required>
                <option selected disabled value="">Choose District </option>
                <option>Bengaluru (Bangalore)</option>
                <option>Mysuru (Mysore)</option>
                <option>Mangaluru (Mangalore)</option>
                <option>Hubballi (Hubli)</option>
                <option>Dharwad</option>
                <option>Belagavi (Belgaum)</option>
                <option>Kalaburagi (Gulbarga)</option>
                <option>Ballari (Bellary)</option>
                <option>Shivamogga (Shimoga)</option>
                <option>Davanagere</option>
                <option>Tumakuru (Tumkur)</option>
                <option>Vijayapura (Bijapur)</option>
                <option>Bidar</option>
                <option>Raichur</option>
                <option>Hassan</option>
                <option>Mandya</option>
                <option>Kolar</option>
                <option>Chikkamagaluru(Chikmagalur)</option>
                <option>Bagalkot</option>
                <option>Udupi</option>
                <option>Chitradurga</option>
                <option>Ramanagara</option>
                <option>Gadag</option>
                <option>Haveri</option>
                <option>Yadgir</option>
                <option>Chikkaballapur</option>
                <option>Kodagu (Madikeri)</option>
                <option>Koppal</option>
                <option>Karwar</option>
                <option>Sirsi</option>
                <option>Hospet (Vijayanagara)</option>
                <option>Tiptur</option>
                <option>Bhadravati</option>
                <option>Sagara</option>
                <option>Dandeli</option>
                <option>Basavakalyan</option>
                <option>Nanjangud</option>
                <option>Ranebennur</option>
                <option>Robertsonpet (KGF)</option>
                <option>Sindhanur</option>
                <option>Gangavathi</option>
                <option>Turuvekere</option>
                <option>Gokarna</option>
                <option>Kanakapura</option>
                <option>Malavalli</option>
                <option>Sakleshpur</option>
                <option>Puttur</option>
                <option>Bantwal</option>
                <option>Channarayapatna</option>
                <option>Harapanahalli</option>
            </select>
        </div>

<!--        <div class="mb-3">-->
<!--            <label class="form-label">Zip Code</label>-->
<!--            <input type="text" class="form-control" name="zip" required>-->
<!--        </div>-->

        <div class="mb-3">
            <label class="form-label">Construction Date</label>
            <input type="date" class="form-control" name="constructionDate" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Capacity (in TMC)</label>
            <input type="number" step="0.1" class="form-control" name="capacity" placeholder="Enter Capacity" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Hydro Electric</label><br>
            <input type="radio" name="hydroElectric" value="true" required> Yes
            <input type="radio" name="hydroElectric" value="false" required> No
        </div>

        <div class="mb-3">
            <button class="btn btn-primary" type="submit">Submit Form</button>
        </div>
    </form>
</div>
</body>
</html>
