@extends('plantillas.adminMain')


@section('titulo','Actualizar Visita')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		<br>
			@php
				$parameter =[
					'id'=>$visita->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
		<form method="post" action="{{route('visitas.update',$parameter)}}">
		@method('PUT')
		 @csrf
		 <h2>Registro de Visita a Parcela</h2>
		 <br>
		  <div>
			<div class="form-group row">
			<label for="example-date-input" class="col-2 col-form-label">Fecha de Visita</label>
		  	<div class="col-10">
		    <input class="form-control" type="date" name="fecha" value="{{$visita->fecha}}" id="example-date-input">

		  	</div>
			</div>
			</div>

			<div class="form-group">
		    <label for="formGroupExampleInput2">Actividad de la visita</label>
		    <input type="text" class="form-control" value="{{$visita->actividad}}" name="actividad" id="actividad" >
		  </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput2">Descripción de la visita</label>
		    <input type="text" class="form-control" value="{{$visita->descripcion}}" name="descripcion" id="descripcion" >
		  </div>

		  
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection