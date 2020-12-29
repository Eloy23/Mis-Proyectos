@extends('plantillas.adminMain')

@section('titulo','Nueva Plantación')

@section('formbus')
	
	
	<div class="container">
		<div class="row">
			<div class="col">
			<br><br>
			<h2>Registrar nueva plantación</h2>
			<br>
			<form method="post" action="{{route('plantaciones.store')}}">
			@csrf

			<div class="form-group">
		    <label for="formGroupExampleInput">Cantidad de plantas</label>
		    <input type="number" class="form-control" id="cantidad" name="cantidad">
		 </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput">Año de plantación</label>
		    <input type="number" class="form-control" id="año" name="año">
		  </div>

		  <div class="form-group">
		    <label for="tipo">Especie</label>
		    <select class="form-control" id="especie" name="especie" >
		    @foreach($especies as $especie)
		    <option value="{{$especie->id}}">{{$especie->nombre_comun}} / {{$especie->nombre_cientifico}}</option>
		    @endforeach
		    </select>
		  </div>
			

			<div class="form-group">
		    <label for="tipo">Tipo de plantación</label>
		    <select class="form-control" id="tipo" name="tipo" >
		    @foreach($tipos as $tipo)
		    <option value="{{$tipo->id}}">{{$tipo->nombre}}</option>
		    @endforeach
		    </select>
		  </div>
		  @foreach($parcela->productores as $productor)
		  <div class="form-group">
		    <label for="formGroupExampleInput">Propietario de la parcela</label>
		    <input readonly="" type="text" value="{{$productor->nombre}}" class="form-control" >
		  </div>
		  @endforeach
		  <input hidden value="{{$parcela->id}}" name="id">



		 <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
			</form>

			</div>	
		</div>
	</div>

@endsection