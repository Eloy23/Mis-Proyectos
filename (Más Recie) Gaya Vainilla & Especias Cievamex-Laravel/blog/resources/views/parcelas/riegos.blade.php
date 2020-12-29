@extends('plantillas.adminMain')


@section('titulo','Riegos')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Tipos de riego</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Tipo de riego</th>
			<th>Descripción</th>
		
		</tr>

@foreach($riegos as $riego)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$riego->nombre}}</td>
			<td>{{$riego->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$riego->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('riegos.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.riego',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection