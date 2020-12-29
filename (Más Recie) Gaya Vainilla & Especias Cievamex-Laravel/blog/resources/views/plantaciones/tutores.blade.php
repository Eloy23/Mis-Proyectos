@extends('plantillas.adminMain')


@section('titulo','Tutores')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Tipos de tutores</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

@foreach($tutores as $tutor)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$tutor->nombre}}</td>
			<td>{{$tutor->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$tutor->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('tutores.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.tutor',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection