$("#personForm #submit").on("click", function(e) {
   resetErrorMessages();
});

$("#personForm").on("submit", function(e) {
   if ($("#fname").val() != $("#lname").val() + "ov") {
       $("#fnameErrorMessage").append("First name must be last name + ov! ");
       $("#fnameError").show();
       e.preventDefault();
   }

   if (!($("#fname").val().startsWith("A"))) {
       $("#fnameErrorMessage").append("First name must start with 'A'! ");
       $("#fnameError").show();
       e.preventDefault();
   }

   if (!($("#fname").val().substring(1,4)=="abc")) {
       $("#fnameErrorMessage").append("First name must contain 'abc' after the first character! ");
       $("#fnameError").show();
       e.preventDefault();
   }

   if ($("#lname").val() == $("#fname").val() ) {
       $("#lnameErrorMessage").append("Last name and first name must be different! ");
       $("#lnameError").show();
       e.preventDefault();
   }

   if ($("#licensevalidity").val() < $("#licenseexam").val() ) {
       $("#licensevalidityErrorMessage").append("License validity date must be greater than license exam date! ");
       $("#licensevalidityError").show();
       e.preventDefault();
   }
});

$("#fname").on("invalid", function(e) {
   e.preventDefault(); // disable basic HTML validation response

   if ($("#fname")[0].validity.tooShort) {
       $("#fnameErrorMessage").append("First name must be at least 3 characters long! ");
       $("#fnameError").show();
   }

   if ($("#fname")[0].validity.tooLong) {
       $("#fnameErrorMessage").append("First name must be at most 20 characters long! ");
       $("#fnameError").show();
   }

   if ($("#fname")[0].validity.patternMismatch) {
       $("#fnameErrorMessage").append("First name must begin with a capital letter! ");
       $("#fnameError").show();
   }

   if ($("#fname")[0].validity.valueMissing) {
       $("#fnameErrorMessage").append("Input fname 'First name' of type text is mandatory! ");
       $("#fnameError").show();
   }
});

$("#lname").on("invalid", function(e) {
   e.preventDefault(); // disable basic HTML validation response

   if ($("#lname")[0].validity.tooShort) {
       $("#lnameErrorMessage").append("Last name must be at least 3 characters long! ");
       $("#lnameError").show();
   }

   if ($("#lname")[0].validity.tooLong) {
       $("#lnameErrorMessage").append("Last name must be at most 20 characters long! ");
       $("#lnameError").show();
   }

   if ($("#lname")[0].validity.patternMismatch) {
       $("#lnameErrorMessage").append(`Last name (${$("#lname").val()}) must begin with a capital letter! `);
       $("#lnameError").show();
   }

   if ($("#lname")[0].validity.valueMissing) {
       $("#lnameErrorMessage").append("Last name is mandatory! ");
       $("#lnameError").show();
   }
});

$("#height").on("invalid", function(e) {
   e.preventDefault(); // disable basic HTML validation response

   if ($("#height")[0].validity.rangeUnderflow) {
       $("#heightErrorMessage").append("Height must be at least 500 mm! ");
       $("#heightError").show();
   }

   if ($("#height")[0].validity.rangeOverflow) {
       $("#heightErrorMessage").append("Height must be at most 2500 mm! ");
       $("#heightError").show();
   }

   if ($("#height")[0].validity.stepMismatch) {
       $("#heightErrorMessage").append("Millimeter can only be given in steps of 5! ");
       $("#heightError").show();
   }
});

$("#hascar").on("invalid", function(e) {
   e.preventDefault(); // disable basic HTML validation response

});

$("#validlicense").on("invalid", function(e) {
   e.preventDefault(); // disable basic HTML validation response

});

$("#licenseexam").on("invalid", function(e) {
   e.preventDefault(); // disable basic HTML validation response

   if ($("#licenseexam")[0].validity.rangeUnderflow) {
       $("#licenseexamErrorMessage").append("Minimum date must be greater than '1920-01-01'! ");
       $("#licenseexamError").show();
   }

   if ($("#licenseexam")[0].validity.rangeOverflow) {
       $("#licenseexamErrorMessage").append("Maximum date must be less than '2023-10-26'! ");
       $("#licenseexamError").show();
   }
});

$("#licensevalidity").on("invalid", function(e) {
   e.preventDefault(); // disable basic HTML validation response

   if ($("#licensevalidity")[0].validity.rangeUnderflow) {
       $("#licensevalidityErrorMessage").append("Minimum date must be greater than '1920-01-01'! ");
       $("#licensevalidityError").show();
   }

   if ($("#licensevalidity")[0].validity.rangeOverflow) {
       $("#licensevalidityErrorMessage").append("Maximum date must be less than '2027-10-26'! ");
       $("#licensevalidityError").show();
   }
});

 $('#hascar').change(function() {
    if($(this).is(":checked")) {
        $("#validlicenseDiv").show();
    }
    else {
        $("#validlicenseDiv").hide();
    }
});

 $('#validlicense').change(function() {
    if($(this).is(":checked")) {
        $("#license").show();
    }
    else {
        $("#license").hide();
    }
});

function resetErrorMessages() {
    $("#fnameErrorMessage").html("");
    $("#fnameError").hide();

    $("#lnameErrorMessage").html("");
    $("#lnameError").hide();

    $("#licenseexamErrorMessage").html("");
    $("#licenseexamError").hide();

    $("#licensevalidityErrorMessage").html("");
    $("#licensevalidityError").hide();

    $("#validlicenseErrorMessage").html("");
    $("#validlicenseError").hide();

    $("#hascarErrorMessage").html("");
    $("#hascarError").hide();

    $("#heightErrorMessage").html("");
    $("#heightError").hide();
}