@extends('plantillas.adminMain')


@section('titulo','Cargos')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Cargos</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Cargo</th>
			<th>Descripción</th>
		
		</tr>

@foreach($cargos as $cargo)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$cargo->nombre}}</td>
			<td>{{$cargo->descripcion}}</td>
			<td><a class="btn btn-info" href="{{route('edit.cargos',$cargo->id)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.cargos',$cargo->id)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection