@extends('plantillas.adminMain')


@section('titulo','Plantaciones')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Plantaciones</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Cantidad de plantas</th>
			<th>Año de plantación</th>
			<th>Especie</th>
			<th>Tipo de plantación</th>

		
		</tr>

@foreach($plantaciones as $plantacion)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td >{{$plantacion->cantidad}} unidades</td>
			<td>{{$plantacion->año}}</td>
			<td>{{$plantacion->especie->nombre_comun}}/{{$plantacion->especie->nombre_cientifico}}</td>
			<td>{{$plantacion->tipo->nombre}}</td>

			@php
				$parameter =[
					'id'=>$plantacion->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('plantaciones.edit',$parameter)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.plantacion',$parameter)}}" class="center">Eliminar</a></td>
			<td><div class="dropdown">
				  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    MÁS
				  </button>
				  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
				    <a class="dropdown-item" href="{{route('ciclos.nuevociclo',$plantacion->id)}}">Agregar Ciclo de Floración</a>
				    <a class="dropdown-item" href="{{route('ciclos.mostrarciclo',$plantacion->id)}}">Ver Ciclos de Floración</a>
				    <a class="dropdown-item" href="{{route('plantasociado.show',$plantacion->id)}}">Agregar Cultivos Asociados</a>
				    <a class="dropdown-item" href="{{route('plantasociado.ver',$plantacion->id)}}">Ver Cultivos Asociados</a>
				    <a class="dropdown-item" href="{{route('planttutor.show',$plantacion->id)}}">Agregar Tutores Presentes</a>
				    <a class="dropdown-item" href="{{route('planttutor.ver',$plantacion->id)}}">Ver Tutores Presentes</a>
				    <a class="dropdown-item" href="{{route('plantferti.show',$plantacion->id)}}">Agregar Fertilizante utilizado</a>
				    <a class="dropdown-item" href="{{route('plantferti.ver',$plantacion->id)}}">Ver Fertilizantes Usados</a>
				    <a class="dropdown-item" href="{{route('enfermedadesplantacion.show',$plantacion->id)}}">Agregar Enfermedad</a>
				    <a class="dropdown-item" href="{{route('enfermedades.ver',$plantacion->id)}}">Ver Enfermedades</a>
				    <a class="dropdown-item" href="{{route('plagasplantaciones.show',$plantacion->id)}}">Agregar Plaga</a>
				    <a class="dropdown-item" href="{{route('plagasplantaciones.ver',$plantacion->id)}}">Ver Plagas</a>
					 <a class="dropdown-item" href="{{route('plantaciones.estado',$plantacion->id)}}">Estado de plantaciones</a>
				  </div>
				</div></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection