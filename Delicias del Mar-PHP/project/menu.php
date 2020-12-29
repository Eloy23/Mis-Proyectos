<?php 
session_start();
?>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body id="body3">

	<nav class="navbar navbar-expand-lg fixed-top navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="#"><img src="img/logo12.png" width="30" height="30" class="d-inline-block align-top" alt="">
		Las delicias del mar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item">
					<a class="nav-link" href="index.php">Home <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item active">
					<a class="nav-link" href="menu.php">Menu</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="about.php">About Us</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="contact.php">Contact</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="gallery.php">Gallery</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="app/rating.php">Rating</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="app/admin.php">Admin</a>
				</li>
					
			</ul>
					 <ul class="navbar-nav">
    <?php 
	if(isset($_SESSION["online"])){
	echo '<li class="nav-item">
	        <a class="nav-link" id="close" href="#"> Hello '.$_SESSION["online"].'</a>
	      </li>';
	}else{
		echo '<button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModal">
				  Login
				</button>';
	}
?>
	</ul>
		</div>
	</nav><br><br><br>

<div id="background">
<div class="container-fluid"> 
	<div class="row">
		<div class="col">
			<div class="jumbotron">
		  <div id="container-jumbotron">
		  <h1 class="display font_2">DISCOVER OUR SEASONAL DISHES</h1>
		  </div>
          </div>
		</div>
	</div>
 <div class="p-3 mb-2 bg-secondary text-white" align="center">Food is prepared at the moment that you order it, we appreciate your comprehension!</div><br>

<div class="row">
		<div class="col-1"></div>
		<div class="col">
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div>
			<h2 align="center" class="classic1G-zy font-weight-bold text-dark" data-hook="wixrest-menus-sub-category-title">Breakfast</h2>
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div><br>
			<p class="text"> Hot cakes con miel y jugo .................................................................................................................... $30.00</p><br>
			<p class="text"> Huevos revueltos, estrellados, a la mexicana o carnes frias, jugo y cafe ........................... $38.00</p><br>
			<p class="text"> Coctel de frutas con miel, jugo y cafe .............................................................................................. $35.00</p><br>
			<a href="desayunos.php">	<button type="button" class="btn btn-outline-primary a"  >More..</button></a>
			
		</div>
		<div class="col-1"></div>
</div><br>

<div class="row">
		<div class="col-1"></div>
			<div class="col">
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div>
			<h2 align="center" class="classic1G-zy font-weight-bold text-dark" data-hook="wixrest-menus-sub-category-title">Foods</h2>
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div><br>
			<p class="text"> MENU OLIMPICO: Caldo de pescado, camarones al mojo de ajo o a la diabla, arroz casero, ensalada, frijoles y tortillas ......... $85.00 </p><br>
			<p class="text">MENU TECOLUTEÑO: Coctel de camaron chico, mojarra frita con enchiladas y frijoles ....................................................................... $100.00 </p><br>
			<p class="text">MENU INFANTIL: Milanesa de pollo o filete empanizado, arroz, ensalada, frijoles y tortillas ............................................................... $40.00</p><br>
			<a href="comidas.php"> <button type="button" class="btn btn-outline-primary">More..</button></a>
			</div>
		<div class="col-1"></div>		
</div><br>

<div class="row">
		<div class="col-1"></div>
			<div class="col">
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div>
			<h2 align="center" class="classic1G-zy font-weight-bold text-dark" data-hook="wixrest-menus-sub-category-title">Especialidades de la casa</h2>
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div><br>
			<p class="text"> Lomo de robalo al gusto ................................ $180.00 </p><br>
			<p class="text">Camarones al tequila ....................................... $100.00 </p><br>
			<p class="text">Enchiladas suizas .............................................. $120.00</p><br>
			<a href="especialidades.php"> <button type="button" class="btn btn-outline-primary">More..</button></a>
			</div>
		<div class="col-1"></div>		
</div><br>

<div class="row">
	<div class="col-1"></div>
	<div class="col">
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div>
			<h2 align="center" class="classic1G-zy font-weight-bold text-dark" data-hook="wixrest-menus-sub-category-title">Meats and more...</h2>
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div><br>
			<p class="text">Milanesa de pollo con enchiladas, ensalada y frijoles ...................................................................................................................................... $120.00</p><br>
			<p class="text">Tampiqueña, bistec de res, 3 enchiladas, platanos fritos, arroz, chiles toreados, papas a la francesa y frijoles ........................ $130.00 </p><br>
			<p class="text">Caldos, sopas, filetes, camarones, mojarras, pulpos, tostadas y cocteles.</p><br>
			<a href="carnes.php"> <button type="button" class="btn btn-outline-primary">More..</button></a>
	</div>
	<div class="col-1"></div>
</div><br>

<div class="row">
		<div class="col-1"></div>
		<div class="col">
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div>
			<h2 align="center" class="classic1G-zy font-weight-bold text-dark" data-hook="wixrest-menus-sub-category-title">Antojitos</h2>
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div><br>
			<p class="text">Sopes con pollo .............................................. $50.00</p><br>
			<p class="text">Empipianadas con pollo .............................. $50.00</p><br>
			<p class="text">Sincronizadas (2 piezas) .............................. $35.00</p><br>
			<a href="antojitos.php"> <button type="button" class="btn btn-outline-primary">More..</button></a>
		</div>
		<div class="col-1"></div>
</div><br>

<div class="row">
		<div class="col-1"></div>
		<div class="col">
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div>
			<h2 align="center" class="classic1G-zy font-weight-bold text-dark" data-hook="wixrest-menus-sub-category-title">Drinks</h2>
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div><br>
			<p class="text">Bebidas.</p><br>
			<p class="text">Licuados y esquimos.</p><br>
			<p class="text">Cervezas</p><br>
			<a href="bebidas.php"> <button type="button" class="btn btn-outline-primary">More..</button></a>
		</div>
		<div class="col-1"></div>
</div><br>

<div class="row">
		<div class="col-1"></div>
		<div class="col">
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div>
			<h2 align="center" class="classic1G-zy font-weight-bold text-dark" data-hook="wixrest-menus-sub-category-title">Desserts</h2>
			<div class="classic1rDU_" data-hook="wixrest-menus-sub-category-divider"></div><br>
			<p class="text">Duraznos en almibar ................................................ $35.00</p><br>
			<p class="text">Platanos fritos con crema o lechera ................... $35.00</p><br>
			<p class="text">Duraznos con rompope .......................................... $45.00</p><br>
		</div>
		<div class="col-1"></div>
</div><br>
</div>

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

</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/alert.js"></script>
	
</body>
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
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
		</div>	
		<br>Avenida Vicente Guerrero Esquina Juan Ahumada S/N Tecolutla Ver., Mexico. || 766 145 78 98
        </br>
</nav>

</html>