@extends('plantillas.adminMain')


@section('titulo','Productores')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Productores</h2>


<br>


	<table id="table" class="table">
		<tr >
			<th>#</th>
			<th>Nombre</th>
			<th>Edad</th>
			<th>Escolaridad</th>
			<th>Actividad económica</th>
			<th>Jefe de familia</th>
		</tr>

@foreach($productores as $key =>  $productor)
		
		
@php


					$valor ="";
					$si = $productor->jefe_familia;
				if($si == 1){
				$valor ="si";
				}else{

				$valor ="no";
				}

			


@endphp
	
		<tr id="table">
			<td >{{$loop->index+1}}</td>
			<td>{{$productor->nombre}} {{$productor->apellido_pat}} {{$productor->apellido_mat}}</td>
			<td>{{$productor->edad}}</td>
			<td>{{$productor->escolaridad}}</td>		
		
	
			<td>{{$productor->actividad['nombre']}}</td>
			
			<td>{{$valor}}</td>
			<td><a class="btn btn-info" href="{{route('mostrarview',$productor->id)}}" class="center">Agregar Familiar</a></td>
			<td><a class="btn btn-info" href="{{route('lista.familia',$productor->id)}}" class="center">Ver Familiares</a></td>
		


@endforeach
			</table>
			
		</div>
	</div>
</div>




@endsection