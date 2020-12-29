@extends('plantillas.adminMain')

@section('titulo','Nuevo Ciclo de Floración')

@section('formbus')
	
	
	<div class="container">
		<div class="row">
			<div class="col">
			<br><br>
			<h2>Registrar un nuevo ciclo de Floración</h2>
			<br>
			<form method="post" action="{{route('ciclos.store')}}">
			@csrf
			<div>
			<div class="form-group row">
			<label for="example-date-input" class="col-2 col-form-label">Inicio de floración</label>
		  	<div class="col-10">
		    <input class="form-control" type="date" name="ini"  value="2020-08-07" id="example-date-input">

		  	</div>
			</div>
			</div>
			<div class="form-group row">
			<label for="example-date-input" class="col-2 col-form-label">Fin de floración</label>
		  	<div class="col-10">
		    <input class="form-control" type="date" name="fin"  value="2020-08-19" id="example-date-input">

		  	</div>
			</div>

			<div class="form-group">
		    <label for="tipo">Daño por sequía</label>
		    <select class="form-control" id="daño" name="daño" >
		      <option >Bajo</option>
		      <option>Medio</option>
		      <option>Alto</option>
		    </select>
		  </div>

		   <div class="form-group">
		    <label for="formGroupExampleInput">Caída prematura (%)</label>
		    <input type="number" class="form-control" id="prematura" name="prematura">
		  </div>

		<div class="form-group row">
			<label for="example-date-input" class="col-2 col-form-label">Fecha de cosecha</label>
		  	<div class="col-10">
		    <input class="form-control" type="date" name="cosecha"  value="2020-12-19" id="example-date-input">

		  	</div>
		</div>

		<div class="form-group">
		    <label for="formGroupExampleInput">Cosecha (kg)</label>
		    <input type="number" class="form-control" id="produccion" name="produccion">
		 </div>

		 <div class="form-group">
		    <label for="formGroupExampleInput">Pérdida estimada (kg)</label>
		    <input type="number" class="form-control" id="perdida" name="perdida">
		 </div>

		 <input hidden value="{{$plantacion->id}}" name="id">





		 <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
			</form>

			</div>	
		</div>
	</div>

@endsection