@extends('plantillas.adminMain')


@section('titulo','Plagas')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Plagas en Plantación</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

		@php

			$unicos = $plantacion->plagas->unique('id');
		@endphp

@foreach($unicos as $plaga)
	


		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$plaga->nombre}}</td>
			<td>{{$plaga->descripcion}}</td>

			@php
			$parameter =[
					'id_plantacion'=>$plantacion->id,
					'id_plaga'=>$plaga->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			
			<td><a class="btn btn-danger" href="{{route('destroy.listaplaga',$parameter)}}" class="center">Eliminar</a></td>
			<td><div class="dropdown">
				  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    MÁS
				  </button>
				  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
				    
				    <a class="dropdown-item" href="{{route('plagasmanejo.show',$plantacion->id)}}">Agregar Manejo de plagas</a>
				    <a class="dropdown-item" href="{{route('plagasmanejo.ver',$plantacion->id)}}">Ver Manejo de plaga</a>
				    
				  </div>
				</div></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection