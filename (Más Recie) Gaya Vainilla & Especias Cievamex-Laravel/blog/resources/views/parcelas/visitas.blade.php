@extends('plantillas.adminMain')


@section('titulo','Visitas')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Visitas</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Fecha</th>
			<th>Actividad</th>
			<th>Descripción</th>
		
		</tr>

@foreach($visitas as $visita)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$visita->fecha}}</td>
			<td>{{$visita->actividad}}</td>
			<td>{{$visita->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$visita->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('visitas.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.visita',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection