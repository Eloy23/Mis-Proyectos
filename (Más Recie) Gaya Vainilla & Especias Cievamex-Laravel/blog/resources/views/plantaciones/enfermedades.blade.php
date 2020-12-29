@extends('plantillas.adminMain')


@section('titulo','Enfermedades')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Enfermedades</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Enfermedad</th>
			<th>Descripción</th>
		
		</tr>

@foreach($enfermedades as $enfermedad)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$enfermedad->nombre}}</td>
			<td>{{$enfermedad->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$enfermedad->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('enfermedades.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.enfermedad',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection