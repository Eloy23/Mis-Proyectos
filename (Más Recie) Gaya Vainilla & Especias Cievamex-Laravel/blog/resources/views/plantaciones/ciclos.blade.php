@extends('plantillas.adminMain')


@section('titulo','Ciclo')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Ciclos</h2>
<br>

	<table class="table">
		<tr>
			<th>#</th>
			<th>Año</th>
			<th>Dias de floración</th>
			<th>Fecha de cosecha</th>
			<th>Caída prematura</th>
			<th>Edad del fruto</th>
			<th>Producción</th>
			<th>Pérdida Estimada</th>
			<th>Rendimiento estimado</th>

		
		</tr>

@foreach($ciclos as $ciclo)
	
		<tr>
			<td>{{$loop->index+1}}</td>
			<td >{{$ciclo->created_at->year}}</td>
			<td>{{$ciclo->dias_floracion}} Dias</td>
			<td>{{$ciclo->fecha_cosecha}}</td>
			<td>{{$ciclo->caida_prematura}}</td>
			<td >{{number_format($ciclo->edad_fruto, 2)}} Meses</td>
			<td>{{$ciclo->produccion}} Kg</td>
			<td>{{$ciclo->perdida_estimada}} Kg</td>
			<td>{{$ciclo->rendimiento_estimado}} Kg</td>

			@php
				$parameter =[
					'id'=>$ciclo->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<td><a class="btn btn-info" href="{{route('ciclos.edit',$parameter)}}" class="center">Editar</a></td>
			<td><div class="dropdown">
				  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    MÁS
				  </button>
				  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
				 	<a class="dropdown-item" href="{{route('destroy.ciclo',$parameter)}}" class="center">Eliminar</a>
				    <a class="dropdown-item" href=""></a>
				  </div>
				</div></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>

@endsection