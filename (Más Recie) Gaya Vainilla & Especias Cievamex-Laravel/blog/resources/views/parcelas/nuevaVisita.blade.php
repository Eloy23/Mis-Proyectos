@extends('plantillas.adminMain')


@section('titulo','Nuevo Visita')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		<br>
		<form method="post" action="{{route('visitas.store')}}">
		 @csrf
		 <h2>Registro de Visita a Parcela</h2>
		 <br>
		  <div>
			<div class="form-group row">
			<label for="example-date-input" class="col-2 col-form-label">Fecha de Visita</label>
		  	<div class="col-10">
		    <input class="form-control" type="date" name="fecha" value="2020-08-01" id="example-date-input">

		  	</div>
			</div>
			</div>

			<div class="form-group">
		    <label for="formGroupExampleInput2">Actividad de la visita</label>
		    <input type="text" class="form-control" name="actividad" id="actividad" >
		  </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput2">Descripción de la visita</label>
		    <input type="text" class="form-control" name="descripcion" id="descripcion" >
		  </div>

		  <input hidden value="{{$parcela->id}}" name="id">
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection