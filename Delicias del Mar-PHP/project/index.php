<?php 
session_start();
?>
<!DOCTYPE html>
<html>
<head>
	<title>Las Delicias del Mar</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body id="body1">
	
	<nav class="navbar navbar-expand-lg fixed-top navbar navbar-dark bg-dark">
		 <a class="navbar-brand" href="index.php">
    <img src="img/logo12.png" width="30" height="30" class="d-inline-block align-top" alt="">
    Las Delicias del Mar
     </a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="index.php">Home <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item">
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
			<a class="btn btn-outline-success" align="center" href="login/register2.php">Register</a>
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

	<div class="container">
			<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img class="d-block w-100" src="img/b.jpg" alt="First slide" width="408" height="500">
						<div class="carousel-caption d-none d-md-block">
							<h3 class="font-weight-bold">Welcome to "Las Delicias del Mar"</h3>
							<p>Know more about us</p>
						</div>
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" src="img/12.jpg" alt="Second slide" width="408" height="500">
						<div class="carousel-caption d-none d-md-block">
							<h3 class="font-weight-bold text-dark">We are a the best restaurant of the state!</h3>
							<p class="text-dark">All users have greate deal</p>
						</div>
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" src="img/2.2.jpg" alt="Third slide" width="408" height="500">
						<div class="carousel-caption d-none d-md-block">
							<h3 class="font-weight-bold text-dark">Explore our food! </h3>
							<p class="text-dark">We have many typical food</p>
						</div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
	</div> 
<br><br>
	<div class="container-fluid">
		<div class="row">
			<div class="col">
			  	<div class="card">
			  	<h1 class="font-weight-bold font-italic" align="center">Our kitchen</h1><br>
			    <img class="card-img-top" src="img/flecha.png" alt="Card image cap"><br>
			    <h2 class="font-weight-bold font-italic" align="center">Discover our seasonal</h2><br>
			    <h1 class="font-weight-bold font-italic" align="center">Dishes</h1>
			    <div class="card-body"></div>
			  	</div>
		  	</div>
  			<div class="col">
				  <div class="card">
				  <img class="card-img" src="img/logo12.png" alt="Card image">
				  </div>
 			</div>
 			<div class="col">
				  <div class="card text-center">
				  <div class="card-body">
				  <h4 class="card-title font-weight-bold font-italic">Breakfast</h4>
				  <p class="card-text text-justify">Breakfasts at "Las delicias del mar" satisfies your appetite. Hotcakes with honey, orange juice and coffee make up a tasty combination.</p>
				  <p class="card-text"><small class="text-muted"><a href="desayunos.php"><button type="button" class="btn btn-outline-primary" >Our suggestions..</button></a></small></p>
				  </div>
				  </div>
  			</div>
  		</div>
<br><br>
  <div class="row">
  			<div class="col">
				  	<div class="card">
				    <blockquote class="blockquote mb-0 card-body">
				    <p class="text-justify">El cocinero sin probar un bocado de los manjares que ha hecho, suele quedar satisfecho de solo haberlos guisado.</p>
				    <footer class="blockquote-footer">
				    <small class="text-muted">Calderón de la Barca <cite title="Source Title"></cite></small>
				    </footer>
				    </blockquote>
				    </div>
  			</div>
  			<div class="col">
					  <div class="card text-white bg-dark ">
					  <blockquote class="blockquote mb-0 card-body">
					  <p class="text-justify">The cook without having tasted a mouthful of the delicacies he has made, is often satisfied with just having cooked them.</p>
					  <footer class="blockquote-footer">
					  <small class="text-muted">Calderón de la Barca <cite title="Source Title"></cite></small>
					  </footer>
					  </blockquote>
					  </div>
  			</div>
  			<div class="col">
						  <div class="card">
						  <div class="card-body">
						  <h4 class="card-title font-weight-bold font-italic" align="center">Food's</h4>
						  <p class="card-text text-justify">Las delicias del mar kitchen seeks to evoke the Mexican province. Our dishes, served with distinction, recreate recipes from along most of the Mexican territory and dignify our national-popular cuisine.</p>
						  <p class="card-text" align="center"><small class="text-muted"><a href="menu.php"><button type="button" class="btn btn-outline-primary">Our suggestions..</button></a></small></p>
						  </div>
						  </div>
  			</div>
  		</div>
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
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
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