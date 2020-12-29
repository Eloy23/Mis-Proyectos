@extends('plantillas.adminMain')


@section('titulo','Usuarios')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Municipios</h2>


<br>
<form >

<div class="input-group mb-3">
  <input type="text" class="form-control" id="buscar" name="buscar" placeholder="Ingrese el Nombre" >
  <div >
      <input type="submit" name="boton" value="Buscar" class="btn btn-info">
  </div>
  
</div>
</form>


	<table id="table" class="table">
		<tr >
			<th>#</th>
			<th>Nombre</th>
			<th>Estado</th>
			
		</tr>

@foreach($municipios as $key => $municipio)
		
	
	
		<tr id="table">
			<td >{{$loop->index+1}}</td>
			<td>{{$municipio->nombre}}</td>
			<td>{{$municipio->estado['nombre']}}</td>
		
			<td><a class="btn btn-info" href="{{route('municipios.edit',$municipio->id)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.muni',$municipio->id)}}" class="center">Eliminar</a></td>
		


@endforeach
			</table>
			
		</div>
	</div>
</div>


@endsection