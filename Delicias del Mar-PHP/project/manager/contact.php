<?php 
session_start();
?>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<link rel="stylesheet" href="fonts/css/font-awesome.min.css">
	 <link rel="stylesheet" type="text/css" href="css/tcal.css" />
	 <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body id="body8" background="img/e.jpg" height="100%" width="100%" >
		<nav class="navbar navbar-expand-lg fixed-top navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="#"><img src="img/logo12.png" width="30" height="30" class="d-inline-block align-top" alt="">
		Las delicias del mar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item">
					<a class="nav-link" href="index.php">Home </a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="menu.php">Menu</a>
				</li>
				<li class="nav-item active">
					<a class="nav-link" href="contact.php">Contact</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="gallery.php">Gallery</a>
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
	</nav><br><br><br><br>

<div class="container-fluid">

<h1 class="font_2" align="center">CONTACT US!</h1>	

	<div class="row">
		<div class="col-1"></div>

		<div class="col" id="container">
			<br><br>
			<h5 class="display-5 text-center font_4"> LAS DELICIAS DEL MAR RESTAURANT </h5>
			<p class="text-center"><img class="card-img-top" src="img/0.png" alt="Card image cap"></p>
			<p class="text-center">lasdeliciasdelmar.tec@gmail.com</p>
			<p class="text-center">784 112 33 33 || 766 145 78 98</p>
			<p class="text-center">Avenida Vicente Guerrero Esquina Juan Ahumada S/N Tecolutla Ver., Mexico. </p>
			<br>
			<br><br>					
		</div>
		<div class="col">
			
		</div>
		<div class="col" id="container2">
			<br><br>
		<div class="maps" >
	<img align="center" width="100%" height="100%" src="img/1.1.jpg">
   <iframe align="center" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d934.4256267502307!2d-97.00962957084482!3d20.477408455504566!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x85dbb4005c3fed7b%3A0xcb03200be8cc6423!2sCalle+Guerrero%2C+Tecolutla%2C+Ver.!5e0!3m2!1ses-419!2smx!4v1506788863421" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe><br><br>

			</div>
		</div>

		<div class="col-1"></div>
	</div>
</div><br>


<?php
require_once("db/db.class.php");
    @$name=$_POST["name"];
    @$date=$_POST["date"];
    @$hour=$_POST["hour"];
    @$people=$_POST["people"];


    $db=new DbCon();
    if(@$_POST["b1"]){
    $db->insert("book","null,'$name','$date','$hour','$people'");
}
?>	
	<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Log in</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form method="post" action="login/connect.php">
  <div class="form-group">
    <label for="email">Email address</label>
    <input type="email" class="form-control" name="email" id="email" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="pass">Password</label>
    <input type="pass" class="form-control" name="pass" id="pass" placeholder="Password">
  </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Login</button>
        </form>
      </div>
    </div>
  </div>
</div>

<!-- Modal -->
<div class="modal fade" id="ModalAlert" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Log out</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       <h2> Are you sure?</h2>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
        <button type="button" id="alert-yes" class="btn btn-primary">Yes</button>
      </div>
    </div>
  </div>
</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	 <script type="text/javascript" src="js/tcal.js"></script>
	 <script type="text/javascript" src="js/alert.js"></script>
	 
<br><br>		
    	<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
	<div class="icons"> 
	&nbsp; &nbsp;
			<a href="https://www.facebook.com/antoniovazqu1/"><img src="img/face2.png" width="40" height="40"></a>
	&nbsp; &nbsp; 
		<a href="https://www.instagram.com/?hl=es"><img src="img/insta2.png" width="50" height="50"></a>	
	&nbsp; &nbsp; 
			<a href="https://twitter.com/login?lang=es"><img src="img/tw2.png" width="40" height="40""></a>	
	&nbsp; &nbsp; 
			<a href="https://www.youtube.com/?gl=MX&hl=es-419"><img src="img/you.png" width="40" height="40"></a>	
	&nbsp; &nbsp; 
			<a href="https://es.wikipedia.org/wiki/Tecolutla"><img src="img/t.png" width="35" height="35"></a>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
		</div>
		<br>Avenida Vicente Guerrero Esquina Juan Ahumada S/N Tecolutla Ver., Mexico. || 766 145 78 98
        </br>	
		</nav>
</body>
</html>