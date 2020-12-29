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

			$unicos = $plantacion->manejo_plagas->unique('id');
		@endphp

@foreach($unicos as $manejo)
	


		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$manejo->nombre}}</td>
			<td>{{$manejo->descripcion}}</td>

			@php
			$parameter =[
					'id_plantacion'=>$plantacion->id,
					'id_manejo'=>$manejo->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			
			<td><a class="btn btn-danger" href="{{route('destroy.plagasmanejo',$parameter)}}" class="center">Eliminar</a></td>
			
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection