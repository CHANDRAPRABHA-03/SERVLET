
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(document).ready(function () {
        $("form").submit(function (e) {
            let isValid = true;

            const donarName = $("input[name='donarName']").val().trim();
            if (donarName.length < 3) {
                alert("Donar name must be at least 3 characters.");
                isValid = false;
            }

            const bloodGroup = $("input[name='bloodGroup']").val().trim();
            if (bloodGroup.length < 2) {
                alert("Blood group must be at least 2 characters.");
                isValid = false;
            }

            const contactNo = $("input[name='contactNo']").val().trim();
            if (contactNo === "" || isNaN(contactNo) || Number(contactNo) <= 0) {
                alert("Contact number must be a valid positive number.");
                isValid = false;
            }

            const donarAge = $("input[name='donarAge']").val().trim();
            if (donarAge === "" || isNaN(donarAge) || Number(donarAge) <= 0) {
                alert("Please enter a valid donor age.");
                isValid = false;
            }

            const gender = $("input[name='gender']:checked").val();
            if (!gender) {
                alert("Please select a gender.");
                isValid = false;
            }

            if (!isValid) {
                e.preventDefault(); // Prevent form submission
            }
        });
    });
</script>
