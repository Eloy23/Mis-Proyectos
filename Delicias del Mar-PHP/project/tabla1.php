<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link rel="stylesheet" href="fonts/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
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
				<li class="nav-item">
					<a class="nav-link" href="menu.php">Menu</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="about.php">About Us<span class="sr-only">(current)</span> </a>
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
	</nav><br>
<br><br>
<?php
	require_once("db/db.class.php");
	@$name=$_POST["name"];
    @$email=$_POST["email"];
    @$sex=$_POST["sex"];
    @$age=$_POST["age"];
    @$rate=$_POST["rate"];
    @$opinion=$_POST["opinion"];

$con = new DbCon();

$result=$con->search("*","customer","1");
	$num_result=$result->num_rows;
?>
	<div class="container-fluid">
		<div class="row">
			<div class="col-1"></div>
			<div class="col-3">
			<!---x-->	
		<form  method="POST" action="update.php" enctype="multipart/form-data">
		<div class="form-group">
		<label>ID:</label><br>
		<div class="input-group">
		 <span class="input-group-addon"><span class="glyphicon glyphicon-earphone"></span></span>
		<input type="text" name="id" required class="form-control" ><br>
		</div>
		</div>
		<div class="form-group">
		<label>Name:</label><br>
		<div class="input-group">
		<span class="input-group-addon"><span class="glyphicon glyphicon-earphone"></span></span>
		<input type="text" name="name" required class="form-control" ><br>
		</div>
		</div>
		<div class="form-group">
		<label>Mail:</label><br>
		<div class="input-group">
		<span class="input-group-addon"><span class="glyphicon glyphicon-earphone"></span></span>
		<input type="text" name="email"  required class="form-control" ><br>
		</div>
		</div>
		<div class="form-group">
		<label>Sex:</label><br>
		<div class="input-group">
		<span class="input-group-addon"><span class="glyphicon glyphicon-earphone"></span></span>
		<input type="text" name="sex"  required class="form-control" ><br>
		</div>
		</div>
		<div class="form-group">
		<label>Age:</label><br>
		<div class="input-group">
		<span class="input-group-addon"><span class="glyphicon glyphicon-earphone"></span></span>
		<input type="text" name="age"  required class="form-control" ><br>
		</div>
		</div>
		<div class="form-group">
		<label>Rate:</label><br>
		<div class="input-group">
		<span class="input-group-addon"><span class="glyphicon glyphicon-earphone"></span></span>
		<input type="text" name="rate"  required class="form-control" ><br>
		</div>
		</div>
		<div class="form-group">
		<label>Opinion:</label><br>
		<div class="input-group">
		<span class="input-group-addon"><span class="glyphicon glyphicon-earphone"></span></span>
		<input type="text" name="opinion"  required class="form-control" ><br><br>
		</div>
		</div>

		<input class="btn btn-outline-success" type="submit" name="sub" value="UPDATE"><br>

	</form><br>
<form method="POST" action="app/load2.php" enctype="multipart/form-data">
	
	<input class="btn btn-outline-success" type="submit" name="sub" value="DELETE"><br>

</form>


			<!--z-->
			</div>
			<div class="col-1"></div>
			<div class="col-6">
			<?php
				echo "<table class='table table-hover'";
	echo "<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>Sex</th>
		<th>Age</th>
		<th>Rate</th>
		<th>Opinion</th>
		</tr>";

		for ($i=0; $i < $num_result ; $i++) { 
			$row = $result->fetch_assoc();
			echo "<tr>";
				echo "<td>".$row["id"]."</td>";
				echo "<td>".$row["name"]."</td>";
				echo "<td>".$row["email"]."</td>";
				echo "<td>".$row["sex"]."</td>";
				echo "<td>".$row["age"]."</td>";
				echo "<td>".$row["rate"]."</td>";
				echo "<td>".$row["opinion"]."</td>";
				//echo "<td><a href='../img/".$row["img"]."'><i class='fa fa-heartbeat' aria-hidden='true'></i></a></td>";
			echo "</tr>";
		}
	echo "</table>";

?>
			</div>
		</div>
	</div>
	



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

<br><br>
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
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 
    </div> 
    <br>Avenida Vicente Guerrero Esquina Juan Ahumada S/N Tecolutla Ver., Mexico.  || 766 145 78 98
        </br> 
  </nav>
</html>
