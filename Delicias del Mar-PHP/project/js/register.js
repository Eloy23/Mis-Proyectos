$(document).ready(function(){
	$("#submit").click(function(){
			var name=$("#name").val();
			var email=$("#email").val();
			var sex=$("#sex").val();
			var age=$("#age").val();
			var rate=$("#rate").val();
			var opinion=$("opinion").val();
			var error=false;
			var msj="";

			if (name=="") {
				error=true;
				msj=msj+" Please insert your name!. <br>";
			}
			if (email=="") {
				error=true;
				msj=msj+" Please insert your e-mail!. <br>";
			}
			if (sex=="") {
				error=true;
				msj=msj+" Please insert your sex!. <br>";
			}
			if (age=="") {
				error=true;
				msj=msj+" Please insert your age!. <br>";
			}
			if (rate=="") {
				error=true;
				msj=msj+" Please insert your rate!. <br>";
			}
			if (opinion=="") {
				error=true;
				msj=msj+" Please insert your opinion!. <br>";
			}
			/*if (pass=="" || pass2=="") {
				error=true;
				msj=msj+" Please insert your password!. <br>";
			}
			if (pass==pass2) {
				error=true;
				msj=msj+" Your password is correct!. <br>";
			}*/
			 if (error) {
			 	$("#alert").html(msj);
				$("#alert").removeClass("d-none");
				$("#alert").addClass("alert alert-danger");
				return false;
			 }
	});
});