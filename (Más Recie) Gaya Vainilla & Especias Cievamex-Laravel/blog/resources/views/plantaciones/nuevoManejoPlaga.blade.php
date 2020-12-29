@extends('plantillas.adminMain')


@section('titulo','Nuevo Manejó de Plaga')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		
		<form method="post" action="{{route('manejospla.store')}}">
		 @csrf
		  <div class="form-group">
		    <label for="formGroupExampleInput">Nombre</label>
		    <input type="text" class="form-control" id="nombre" name="nombre" >
		  </div>
		  <div class="form-group">
		    <label for="formGroupExampleInput2">Descripción del método</label>
		    <input type="text" class="form-control" name="descripcion" id="descripcion" >
		  </div>
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection