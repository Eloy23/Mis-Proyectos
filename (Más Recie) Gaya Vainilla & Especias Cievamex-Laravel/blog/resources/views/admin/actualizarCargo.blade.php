@extends('plantillas.adminMain')

@section('titulo','Actualizar Cargo')

@section('formbus')
<br>
<div class="container">
	<div class="row">
		<div class="col">
		
		<form method="post" action="{{route('cargos.update',$cargos->id)}}">
		@method('PUT')
		 @csrf
		  <div class="form-group">
		    <label for="formGroupExampleInput">Nombre</label>
		    <input value="{{$cargos->nombre}}" type="text" class="form-control" id="nombre" name="nombre" >
		  </div>
		  <div class="form-group">
		    <label for="formGroupExampleInput2">Descripción del cargo</label>
		    <input value="{{$cargos->descripcion}}" type="text" class="form-control" name="descripcion" id="descripcion" >
		  </div>
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>


@endsection