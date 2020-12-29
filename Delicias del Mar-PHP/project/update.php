<?php  
require_once("db/db.class.php");
$con=new DbCon();

@$id=$_POST["id"];
@$name=$_POST["name"];
@$email=$_POST["email"];
@$sex=$_POST["sex"];
@$age=$_POST["age"];
@$rate=$_POST["rate"];
@$opinion=$_POST["opinion"];

$con->update("customer","$name","$email","$sex","$age","$rate","$opinion","id","$id");
echo "<script>location.href='tabla1.php'</script>";

?>