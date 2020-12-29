$(document).ready(function(){
	$("#submit").click(function(){
			var name=$("#name").val();
			var mail=$("#mail").val();
			var pass=$("#pass").val();
			var pass2=$("#pass2").val();
			var error=false;
			var msj="";

			if (name=="") {
				error=true;
				msj=msj+" Please insert your name!. <br>";
			}
			if (mail=="") {
				error=true;
				msj=msj+" Please insert your mail!. <br>";
			}
			if (pass=="" || pass2=="") {
				error=true;
				msj=msj+" Please insert your password!. <br>";
			}
			if (pass==pass2) {
				error=true;
				msj=msj+" Your password is correct!. <br>";
			}
			 if (error) {
			 	$("#alert").html(msj);
				$("#alert").removeClass("d-none");
				$("#alert").addClass("alert alert-danger");
				return false;
			 }
	});
});