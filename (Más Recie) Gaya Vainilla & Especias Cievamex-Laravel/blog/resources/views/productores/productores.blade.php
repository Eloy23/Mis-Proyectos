@extends('plantillas.adminMain')


@section('titulo','Productores')


@section('formbus')

<div class="container">
<div class="row">
		<div class="col">
			<br><br>

			<h2>Productores</h2>


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
			<th>Edad</th>
			<th>Actividad económica</th>
		</tr>

@foreach($productores as $key =>  $productor)
		
		
	
		<tr id="table">
			<td >{{$loop->index+1}}</td>
			<td>{{$productor->nombre}} {{$productor->apellido_pat}} {{$productor->apellido_mat}}</td>
			<td>{{$productor->edad}}</td>		
	
			<td>{{$productor->actividad['nombre']}}</td>
			
		
			<td><a class="btn btn-info" href="{{route('productores.edit',$productor->id)}}" class="center">Editar</a></td>
			<td><a class="btn btn-danger" href="{{route('produ.destroy',$productor->id)}}" class="center">Eliminar</a></td>
			<td><div class="dropdown">
				  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    MÁS
				  </button>
				  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
				    <a class="dropdown-item" href="{{route('edit.actprodu',$productor->id)}}">Actualizar Activida Economica</a>
				    <a class="dropdown-item" href="{{route('productores.show',$productor->id)}}">Socieconomico</a>
				   
				  </div>
				</div></td>
		


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