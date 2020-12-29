@extends('plantillas.adminMain')

@section('titulo','Actualizar Plantación')

@section('formbus')
	
	
	<div class="container">
		<div class="row">
			<div class="col">
			<br><br>
			<h2>Registrar un nuevo ciclo de floración</h2>
			<br>
			@php
				$parameter =[
					'id'=>$plantacion->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<form method="post" action="{{route('plantaciones.update',$parameter)}}">
			@method('PUT')
			@csrf

			<div class="form-group">
		    <label for="formGroupExampleInput">Cantidad de plantas</label>
		    <input type="number" class="form-control" value="{{$plantacion->cantidad}}" id="cantidad" name="cantidad">
		 </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput">Año de plantación</label>
		    <input type="number" class="form-control" value="{{$plantacion->año}}" id="año" name="año">
		  </div>

		  <div class="form-group">
		    <label for="tipo">Especie</label>
		    <select class="form-control" id="especie" name="especie" >
		    @foreach($especies as $especie)
		    <option value="{{$especie->id}}"
		    {{$plantacion->id_especie == $especie->id ? 'selected' : ''}}>{{$especie->nombre_comun}} / {{$especie->nombre_cientifico}}</option>
		    @endforeach
		    </select>
		  </div>
			

			<div class="form-group">
		    <label for="tipo">Tipo de plantación</label>
		    <select class="form-control" id="tipo" name="tipo" >
		    @foreach($tipos as $tipo)
		    <option value="{{$tipo->id}}"
		    {{$plantacion->id_tipoplantacion == $tipo->id ? 'selected' : ''}}>{{$tipo->nombre}}</option>
		    @endforeach
		    </select>
		  </div>
		

		 <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
			</form>

			</div>	
		</div>
	</div>

@endsection