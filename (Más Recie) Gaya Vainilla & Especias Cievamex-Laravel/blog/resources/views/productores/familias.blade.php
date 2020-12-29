@extends('plantillas.adminMain')


@section('titulo','Familiares')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Familiares</h2>


<br>	
	
	<table id="table" class="table">
		<tr >
			<th>#</th>
			<th>Nombre</th>
			<th>Edad</th>
			<th>Fecha de nacimiento</th>
			<th>Parentesco</th>
			<th>Escolaridad</th>
			<th>Ingreso mensual</th>
			
		</tr>

@foreach($familias as $key=> $familia)
		@php
		foreach($familia->enfermedades as $enfermedad){
			if($enfermedad->nombre){
				$nombre=$enfermedad->nombre;
			}else{
				$nombre='Sin Enfermedades';
			}
			
		}

		@endphp

		<tr id="table">
			<td >{{$loop->index+1}}</td>
			<td style='text-align: justify;'>{{$familia->nombre}} {{$familia->apellido_pat}} {{$familia->apellido_mat}}</td>
			<td>{{$familia->edad}}</td>
			<td>{{$familia->nacimiento}}</td>		
		
			<td>{{$familia->parentesco}}</td>
			<td>{{$familia->escolaridad}}</td>
			<td>{{$familia->ingreso}}</td>
		
			<td><a class="btn btn-info" href="{{route('familiares.edit',$familia->id)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('fam.destroy',$familia->id)}}" class="center">Eliminar</a></td>
			
@endforeach

			</table>
			
		</div>
	</div>
</div>

@endsection