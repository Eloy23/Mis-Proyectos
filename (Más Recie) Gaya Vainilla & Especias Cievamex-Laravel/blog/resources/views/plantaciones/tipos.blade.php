@extends('plantillas.adminMain')


@section('titulo','Tipos de Plantación')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Tipos de Plantación</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

@foreach($tipos as $tipo)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$tipo->nombre}}</td>
			<td>{{$tipo->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$tipo->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('tipos.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.tipos',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection