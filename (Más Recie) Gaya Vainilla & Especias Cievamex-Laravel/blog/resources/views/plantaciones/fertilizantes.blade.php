@extends('plantillas.adminMain')


@section('titulo','Fertilizantes')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Tipos de Fertilizantes</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

@foreach($fertilizantes as $fertilizante)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$fertilizante->nombre}}</td>
			<td>{{$fertilizante->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$fertilizante->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('fertilizantes.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.fertilizante',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection