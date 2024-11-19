document.getElementById('f').addEventListener('submit', function(event) {
    event.preventDefault();
    sub();
});

function sub(){ 
    v=true;
    var n1=f1.n.value;
    if(n1 == "" || !isNaN(n1)){
         document.getElementById("en").textContent = "!Invalid name.Enter a correct name"; 
        v= false;
    }                                                
    var a=f1.age.value;
    if(a == "" || a.length > 2 || isNaN(a)){
        document.getElementById("ea").textContent = "!Invalid age.Enter correct age";
       v=false;
    }
    var d = f1.dob.value;
    if(d == ""){
        document.getElementById("ed").textContent = "!Enter DOB";
        v=false;
    }
    var p=f1.pn.value;
    if(p == "" || p.length != 10 || isNaN(p)){
        document.getElementById("ep").textContent = "!Invalid Phone_no.Enter correct Phone_no";
        v=false;
    }
    var co=f1.cn.value;
    if(co == "" || !isNaN(co)){
        document.getElementById("eco").textContent = "!Invalid Course_name.Enter a correct Course_name";
        v= false;
    }
    var cr=f1.cc.value;
    if(cr == "" || cr.length != 7 || !isNaN(cr.charAt(0)) || !isNaN(cr.charAt(1)) || isNaN(cr.substr(2))){
        document.getElementById("ecr").textContent = "!Invalid Course_code.Enter a correct Course_code";
        v=false;
    }
    var cc=f1.cre.value;
    if(cc == " "){
        document.getElementById("ecc").textContent= "!Select an option";
        v=false;
    }
    var y=f1.yr.value;
    if(y == " "){
        document.getElementById("eyr").textContent = "!Select an option";
        v=false;
    }
    if(v == true){
        document.f1.submit();
        alert("Registration Successfull.")
    }   
}
