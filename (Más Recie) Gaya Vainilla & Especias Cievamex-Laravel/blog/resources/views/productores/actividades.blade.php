@extends('plantillas.adminMain')


@section('titulo','Actividades')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>



			<h2>Actividades Económicas</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Descripción</th>
		
		</tr>

@foreach($actividades as $actividad)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$actividad->nombre}}</td>
			<td>{{$actividad->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$actividad->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('actividades.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.actividad',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>




@endsection
