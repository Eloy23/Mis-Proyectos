@extends('plantillas.adminMain')


@section('titulo','Cultivos Asociados')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Cultivos asociados</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

@foreach($asociados as $asociado)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$asociado->nombre}}</td>
			<td>{{$asociado->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$asociado->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('asociados.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.asociado',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection