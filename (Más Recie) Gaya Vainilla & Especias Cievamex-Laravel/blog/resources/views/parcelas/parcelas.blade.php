@extends('plantillas.adminMain')


@section('titulo','Parcelas')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Parcelas</h2>


<br>	
	

	<table id="table" class="table">
		<tr >
			<th>#</th>
			<th style='text-align: justify;'>Propietario</th>
			<th >Hectareas</th>
			<th>Pendiente</th>
			<th>Localidad</th>
			<th>Suelo</th>
			<th>Riego</th>
			<th>Municipio</th>
			
		</tr>

@foreach($parcelas as $key=> $parcela)
		
		@php
	
		foreach($parcela->productores as $productor){

		}
	
	@endphp

		<tr id="table">
			<td >{{$loop->index+1}}</td>
			<td >{{$productor->nombre}}</td>		
			<td>{{$parcela->ha}}</td>
			<td>{{$parcela->pendiente}}</td>
			<td>{{$parcela->localidad}}</td>
			<td>{{$parcela->suelo->nombre}}</td>
			<td>{{$parcela->riego->nombre}}</td>
			<td>{{$parcela->municipio->nombre}}</td>

			@php
				$parameter =[
					'id'=>$parcela->id,
				];
				$parameter = Crypt::encrypt($parameter);
				$id_modal = $parcela->id;
			@endphp
		
			<td><a class="btn btn-info" href="{{route('parcelas.edit',$parameter)}}" class="center">Editar</a></td>
			<td><div class="dropdown">
				  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    MÁS
				  </button>
				  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
				    <a class="dropdown-item" href="{{route('destroy.parcela',$parameter)}}">Eliminar</a>
				    <a class="dropdown-item" href="{{route('plantaciones.nuevo',$parcela->id)}}">Agregar Plantacion</a>
				    <a class="dropdown-item" href="{{route('plantaciones.mostrar',$parcela->id)}}">Ver Plantaciones</a>
				    <a class="dropdown-item" href="{{route('visitas.nuevaVisita',$parcela->id)}}">Registrar Visita</a>
				    <a class="dropdown-item" href="{{route('visitas.mostrarVisitas',$parcela->id)}}">Mostrar Visitas</a>
				    <a class="dropdown-item" href="{{route('plantaciones.graficar',$parcela->id)}}">Seguimiento de Plantaciones</a>
				   
				    
				  </div>
				</div></td>
			
@endforeach

			</table>
			
		</div>
	</div>
</div>




@endsection