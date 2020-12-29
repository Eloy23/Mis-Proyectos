@extends('plantillas.adminMain')


@section('titulo','Plagas')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Métodos de control de plagas</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Enfermedad</th>
			<th>Descripción</th>
		
		</tr>

@foreach($manejos as $manejo)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$manejo->nombre}}</td>
			<td>{{$manejo->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$manejo->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('manejospla.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.manejospla',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection