@extends('plantillas.adminMain')


@section('titulo','Plagas')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Tutores Presentes</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

		@php

			$unicos = $plantacion->tutores->unique('id');
		@endphp

@foreach($unicos as $tutor)
	


		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$tutor->nombre}}</td>
			<td>{{$tutor->descripcion}}</td>

			@php
			$parameter =[
					'id_plantacion'=>$plantacion->id,
					'id_tutor'=>$tutor->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			
			<td><a class="btn btn-danger" href="{{route('destroy.planttutor',$parameter)}}" class="center">Eliminar</a></td>
			
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection