@extends('plantillas.adminMain')


@section('titulo','Actualizar Cultivo Asociado')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		@php
		$parameter =[
					'id'=>$asociado->id,
				];
				$parameter = Crypt::encrypt($parameter);
		@endphp
		
		<form method="post" action="{{route('asociados.update',$parameter)}}">
		@method('PUT')
		 @csrf
		  <div class="form-group">
		    <label for="formGroupExampleInput">Nombre</label>
		    <input type="text" class="form-control" value="{{$asociado->nombre}}" id="nombre" name="nombre" placeholder="Pudrición negra">
		  </div>
		  <div class="form-group">
		    <label for="formGroupExampleInput2">Descripción del cultivo asociado</label>
		    <input type="text" class="form-control"  value="{{$asociado->descripcion}}" name="descripcion" id="descripcion" placeholder="Podredumbre verde a negra de tallos, hojas y / o vainas empapados de agua">
		  </div>
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection