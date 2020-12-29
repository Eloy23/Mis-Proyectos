@extends('plantillas.adminMain')


@section('titulo','Fertilizantes')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Fertilizantes utilizados</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

		@php

			$unicos = $plantacion->fertilizantes->unique('id');
		@endphp

@foreach($unicos as $fertilizante)
	


		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$fertilizante->nombre}}</td>
			<td>{{$fertilizante->descripcion}}</td>

			@php
			$parameter =[
					'id_plantacion'=>$plantacion->id,
					'id_fertilizante'=>$fertilizante->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			
			<td><a class="btn btn-danger" href="{{route('destroy.plantferti',$parameter)}}" class="center">Eliminar</a></td>
			
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection