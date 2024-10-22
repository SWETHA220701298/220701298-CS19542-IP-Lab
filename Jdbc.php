<html>
<head>
    <title>PHP JDBC</title>
</head>
<body>
    <?php
    $n=$_GET["n"];
    $age=$_GET["age"];
    $dob=$_GET["dob"];
    $pn=$_GET["pn"];
    $cn=$_GET["cn"];
    $cc=$_GET["cc"];
    $cre=$_GET["cre"];
    $yr=$_GET["yr"];
    $p='';
    $con = new mysqli("localhost","root",$p,"ip",3307);
    if ($con->connect_error) {
        die("Connection failed: " . $con->connect_error);
    }
    $sql = "Insert into student values('$n','$age','$dob','$pn','$cn','$cc','$cre','$yr')";
    if($con -> query($sql) == TRUE){
        echo "1 row inserted";
    }
    else{
        echo "Failure";
    }
    $con -> close();
    ?>
    <form action="a.php" method="get">
        <input type="Submit" value="View">
    </form>
</body>
</html>