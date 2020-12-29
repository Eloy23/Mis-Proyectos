@extends('plantillas.adminMain')


@section('titulo','Agregar Manejo')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		
		<form method="post" action="{{route('plantacionesmanejo.store')}}">
		 @csrf
		 <input hidden value="{{$plantacion->id}}" name="id">
		  <div class="form-group">
		    <label for="tipo">Método de control de enfermedad</label>
		    <select class="form-control" id="manejo" name="manejo" >
		      @foreach($manejos as $manejo)
		      <option value="{{$manejo->id}}">{{$manejo->nombre}}</option>
		      @endforeach
		    </select>
		  </div>
					  
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection