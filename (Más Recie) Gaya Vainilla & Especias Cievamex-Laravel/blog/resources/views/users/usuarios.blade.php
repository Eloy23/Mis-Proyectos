@extends('plantillas.adminMain')


@section('titulo','Usuarios')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Usuarios</h2>


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
			<th>edad</th>
			<th>Correo</th>
			<th>Tipo de Usurio</th>
			<th>Teléfono</th>
		</tr>

@foreach($users as $user)
		
		@php
		if($user->tipo == 'tecnico'){
		$valor = 'Asesor Técnico';
		}
		if($user->tipo == 'campo'){
		$valor = 'Asesor de campo';
		}
		if($user->tipo == 'Administrador'){
		$valor = 'Administrador';
		}
		if($user->tipo == 'Productor'){
		$valor = 'Productor';
		}
		@endphp
		<tr id="table">
			<td >{{$loop->index+1}}</td>
			<td>{{$user->nombre}} {{$user->apellidos}}</td>
			<td>{{$user->edad}}</td>
			<td>{{$user->email}}</td>
			<td>{{$valor}}</td>
			<td>{{$user->telefono}}</td>
			<td><a class="btn btn-info" href="{{route('edit.usuario',$user->id)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('destroy.usuario',$user->id)}}" class="center">Eliminar</a></td>
		</tr>


@endforeach
			</table>
			
		</div>
	</div>
</div>


<script type="text/javascript">
	//keyup
	/*	window.addEventListener("load",function(){
			document.getElementById("texto").addEventListener("keyup",function(){
				if((document.getElementById("texto").value.length)>=3)
				fetch(`/usuarios/buscador?texto=${document.getElementById("texto").value}`,{
					method:'get'
				})
				.then(response => response.text() )
				.then(html => {
					
					document.getElementById("resultados").innerHTML =html
					
				})
				else
					document.getElementById("resultados").innerHTML ="no hay resultados"
				
			})	
		})


*/
</script>


@endsection