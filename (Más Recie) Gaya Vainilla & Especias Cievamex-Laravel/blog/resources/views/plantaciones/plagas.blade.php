@extends('plantillas.adminMain')


@section('titulo','Pagas')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Plagas</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Enfermedad</th>
			<th>Descripción</th>
		
		</tr>

@foreach($plagas as $plaga)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$plaga->nombre}}</td>
			<td>{{$plaga->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$plaga->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('plagas.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.plaga',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection