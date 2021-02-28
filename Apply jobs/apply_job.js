//finction for checked box

var status = 0;
function showDiv(checkBox){

    var employed = document.getElementById("EmployeeDetails");
    employed.style.display = checkBox.checked ? "block" : "none";

    status =1;

}

function validation(textFeild){
    
    var fName = document.getElementById("fName").value;
    var lName = document.getElementById("lName").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;
    var address = document.getElementById("address").value;
    var city = document.getElementById("city").value;
    var state = document.getElementById("state").value;
    var zip = document.getElementById("zip").value;
    var country = document.getElementById("country").value;
    var education = document.getElementById("eductaion").value;
    var file = document.getElementById("file").value;
    var checkBox = document.getElementById("checkBox");
    var currentEmployer = document.getElementById("currentEmployer").value;
    var yearsOfExperience = document.getElementById("yearsOfExperience").value;

    // if(checkBox){
    //     alert("kiya hua babu");
    //      if(yearsOfExperience == '' || currentEmployer == ''){
    //         document.getElementById("error").innerHTML = "Any checkbox fields cannot be left blank";
    //         return false;
    //     } 
    //     }




    if(fName == '' || lName == ''|| email == ''|| phone == ''|| address == '' || city == ''|| state == '' || zip == '' || country == 'Default' || education == 'Default' || file ==''){     
            document.getElementById("error").innerHTML = "Any fields cannot be left blank";
            return false;
    }

    if(status){
        if(yearsOfExperience == '' || currentEmployer == ''){
           document.getElementById("error").innerHTML = "Any checkbox fields cannot be left blank";
           return false;
       } 
       }

    
   



        var numbers = /^[0-9]+$/;
        var emailPattern = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/;
        phoneLength = phone.length;
        zipLength = zip.length;
        if(!phone.match(numbers) && !(phoneLength == 10))
        {
            document.getElementById("error").innerHTML = "phone-number should be 10 numeric letters only";
            return false;

        }
        else if(!zip.match(numbers)){
            document.getElementById("error").innerHTML = "zip-number should be numeric letters only";
            return false;
        }
        else if(!email.match(emailPattern)){
            document.getElementById("error").innerHTML = "email pattern incorrect";
            return false;
        }
        else{
            return true;
        }


    return false;

}