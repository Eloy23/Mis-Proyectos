@extends('plantillas.adminMain')


@section('titulo','Actualizar Activida Económica')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		@php
		$parameter =[
					'id'=>$actividad->id,
				];
				$parameter = Crypt::encrypt($parameter);
		@endphp
		<form method="post" action="{{route('actividades.update',$parameter)}}">
		@method('PUT')
		 @csrf
		   <div class="form-group">
		    <label for="nombre">Nombre de la actividad</label>
		    <input type="text" class="form-control" value="{{$actividad->nombre}}" i id="actividad" name="actividad" placeholder="Obrero">
		  </div>

		   <div class="form-group">
		    <label for="nombre">Descripcion</label>
		    <input type="text" class="form-control"  value="{{$actividad->descripcion}}" id="descripcion" name="descripcion" placeholder="Obrero">
		  </div>
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection