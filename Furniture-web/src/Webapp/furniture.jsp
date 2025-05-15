<html>
<head>
</head>
<body>
<div>
<div align="center">

    <h1 align="center">Furniture Details</h1>
    <form action="furniture.jsp" method="post">
        <form>

        Brand <input type="text" placeholder="Enter the Brand" name="brand"/><br><br>
        Size  <select class="form-select" aria-label="Select the size">
            <option selected>Select Size</option>
            <option value="1">King</option>
            <option value="2">Queen</option>
            <option value="3">L</option>
        </select><br><br>
        Material <input type="text" placeholder="Enter the Material" name="material"/><br><br>
        ModelName <input type="text" placeholder="Enter ModelName" name="model"/><br><br>
        ProductBenefits <input type="text" placeholder="Enter ProductBenefits" name="benefits"/><br><br>
        <input type="submit" placeholder="save" value="submit" style="color:blue"/><br><br>
    </form>

</div>
</div>
</body>
</html>