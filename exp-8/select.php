<html>
<head>
    <title>PHP</title>
</head>
<body>
    <?php
    $p='';
    $con = new mysqli("localhost","root",$p,"ip",3307);
    if ($con->connect_error) {
        die("Connection failed: " . $con->connect_error);
    }
    
    $sql = "Select * from student";
    $res = $con -> query($sql);
    echo "<table border='1'><tr><th> Name </th><th> Age </th><th> DOB </th>
        <th> Phone_no </th><th> Course_name </th><th> Course_code </th><th> Couse_credit </th>
        <th> Year </th> </tr>";
        if ($res->num_rows > 0) {
            while($row = $res->fetch_assoc()) {
                echo "<tr>
                        <td>".$row['Name']."</td>
                        <td>".$row['Age']."</td>
                        <td>".$row['DOB']."</td>
                        <td>".$row['Phone_no']."</td>
                        <td>".$row['Course_name']."</td>
                        <td>".$row['Course_id']."</td>
                        <td>".$row['Course_credit']."</td>
                        <td>".$row['Year']."</td>
                      </tr>";
            }
        } else {
            echo "<tr><td colspan='8'>No data found</td></tr>";
        }
    echo "</table>";
    $con -> close();
    ?>
</body>
</html>
