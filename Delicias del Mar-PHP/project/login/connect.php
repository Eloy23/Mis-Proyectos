<?php
session_start();
require_once("../db/db.class.php");

if (!isset($_SESSION["online"])) {
	
$mail=$_POST["email"];
$pass=$_POST["pass"];

$con=new DBCon();
$result=$con->search("*","login","mail='$mail'and pass='$pass'");
$num_result=$result->num_rows;
	if ($num_result==1) {
		echo "User conected!.<br>";
		$_SESSION["online"]=$mail;
		echo "<script>location.href='../'</script>";
	}else{
		echo "User unregistered!.<br>";
	}

}else{
	echo "You are online. <br>";
	echo "<a href='close.php'>Logout</a>";
}
?>