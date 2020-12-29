@extends('plantillas.adminMain')


@section('titulo','Tipos de Especies')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Tipos de Especies</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Nombre científico</th>
			<th>Descripción</th>
		
		</tr>

@foreach($especies as $especie)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$especie->nombre_comun}}</td>
			<td>{{$especie->nombre_cientifico}}</td>
			<td>{{$especie->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$especie->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('especies.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.especie',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection