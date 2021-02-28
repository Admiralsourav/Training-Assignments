function validation(){
    
   
    //Taking input from the user 

    var title = document.getElementById("title").value;
    var type = document.getElementById("type").value;
    var department = document.getElementById("department").value;
    var country = document.getElementById("country").value;
    var description =  document.getElementById("description").value;
    var openingDate =document.getElementById("openingDate").value;

    let today = String(new Date().toISOString().slice(0, 10))

    //checking the whether the anything is empty or not

    if(title == '' || type == 'Default' || department == 'Default' || country == 'Default' || description == ''){
        document.getElementById("err").innerHTML = "None of the fields can be left blank";
    }
    else{

        if(openingDate == today){
        alert("Everything is fine");
        return true;

        }
        else{
            document.getElementById("err").innerHTML = "Date current only";
        }

    }


    return false;
}