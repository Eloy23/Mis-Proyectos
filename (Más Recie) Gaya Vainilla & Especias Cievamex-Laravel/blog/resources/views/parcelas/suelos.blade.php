@extends('plantillas.adminMain')


@section('titulo','Suelos')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Tipos de suelo</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Tipo de suelo</th>
			<th>Descripción</th>
		
		</tr>

@foreach($suelos as $suelo)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td>{{$suelo->nombre}}</td>
			<td>{{$suelo->descripcion}}</td>

			@php
				$parameter =[
					'id'=>$suelo->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('suelos.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.suelo',$parameter)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection