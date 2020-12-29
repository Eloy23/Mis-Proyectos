@extends('plantillas.adminMain')


@section('titulo','Actuzalizar Tutor')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		@php
		$parameter =[
					'id'=>$tutor->id,
				];
				$parameter = Crypt::encrypt($parameter);
		@endphp
		
		<form method="post" action="{{route('tutores.update',$parameter)}}">
		@method('PUT')
		 @csrf
		  <div class="form-group">
		    <label for="formGroupExampleInput">Nombre</label>
		    <input type="text" class="form-control" value="{{$tutor->nombre}}" id="nombre" name="nombre" >
		  </div>
		  <div class="form-group">
		    <label for="formGroupExampleInput2">Descripción del tutor</label>
		    <input type="text" class="form-control"  value="{{$tutor->descripcion}}" name="descripcion" id="descripcion" >
		  </div>
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection