<!DOCTYPE html>
<html>
<head>
	<title>Register</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	<link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg fixed-top navbar navbar-dark bg-dark">
     <a class="navbar-brand" href="index.php">
    <img src="../img/logo12.png" width="30" height="30" class="d-inline-block align-top" alt="">
    Las Delicias del Mar
     </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="../index.php">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="../menu.php">Menu</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="../about.php">About Us</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="../contact.php">Contact</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="../gallery.php">Gallery</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="../app/rating.php">Rating</a>
        </li>
        <li class="nav-item dropdown">
          
      </ul>

      <ul class="navbar-nav">
            <?php 
          if(isset($_SESSION["online"])){
          echo '<li class="nav-item">
                  <a class="nav-link" id="close" href="#"> Hello '.$_SESSION["online"].'</a>
                </li>';
          }
          ?>
      </ul>
    </div>
  </nav><br><br><br>

<h1 align="center">REGISTER NOW!</h1><br>

		<form class="form-control" method="post">
		<label>User:</label><br>
		<input type="text" id="user" name="user"><br>
		<label>Email:</label><br>
		<input type="text" id="mail" name="mail"><br>
		<label>Password:</label><br>
		<input type="password" id="pass" name="pass"><br>
		<br>
		<input type="submit" id="submit" class="btn btn-outline-primary" name="submit"><br>
		</form><br>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
<script type="text/javascript" src="../js/register.js"></script>

<?php
require_once("../db/db.class.php");
    @$user=$_POST["user"];
    @$mail=$_POST["mail"];
    @$pass=$_POST["pass"];

    $db=new DbCon();
    if(@$_POST["submit"]){
    $db->insert("login","null,'$user','$mail','$pass'");
}
?>
<br><br><br><br><br><br><br><br>
<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  <div class="icons"> 
  &nbsp; &nbsp;
      <a href="https://www.facebook.com/antoniovazqu1/"><img src="../img/face2.png" width="40" height="40"></a>
  &nbsp; &nbsp; 
        <a href="https://www.instagram.com/?hl=es"><img src="../img/insta2.png" width="50" height="50"></a>  
  &nbsp; &nbsp; 
      <a href="https://twitter.com/login?lang=es"><img src="../img/tw2.png" width="40" height="40""></a> 
  &nbsp; &nbsp; 
      <a href="https://www.youtube.com/?gl=MX&hl=es-419"><img src="../img/you.png" width="40" height="40"></a> 
  &nbsp; &nbsp; 
      <a href="https://es.wikipedia.org/wiki/Tecolutla"><img src="../img/t.png" width="35" height="35"></a>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 
</div>
        <br>Avenida Vicente Guerrero Esquina Juan Ahumada S/N Tecolutla Ver., Mexico. || 766 145 78 98
        </br> 
  </nav>
</body>
</html>