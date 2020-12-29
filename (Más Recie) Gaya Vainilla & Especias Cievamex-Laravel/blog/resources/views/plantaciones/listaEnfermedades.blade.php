@extends('plantillas.adminMain')


@section('titulo','Enfermedades')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Enfermedades en plantación</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

		@php

			$unicos = $plantacion->enfermedadesplantacion->unique('id');
		@endphp

@foreach($unicos as $enfermedad)
	


		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$enfermedad->nombre}}</td>
			<td>{{$enfermedad->descripcion}}</td>

			@php
			$parameter =[
					'id_plantacion'=>$plantacion->id,
					'id_enfermedad'=>$enfermedad->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			
			<td><a class="btn btn-danger" href="{{route('destroy.listaenfermedad',$parameter)}}" class="center">Eliminar</a></td>
			<td><div class="dropdown">
				  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    MÁS
				  </button>
				  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
				    
				    <a class="dropdown-item" href="{{route('plantacionesmanejo.show',$plantacion->id)}}">Agregar Manejo de enfermedad</a>
				    <a class="dropdown-item" href="{{route('manejosenfer.ver',$plantacion->id)}}">Ver Manejo de Enfermedad</a>
				    
				  </div>
				</div></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection