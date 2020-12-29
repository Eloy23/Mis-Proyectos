@extends('plantillas.adminMain')


@section('titulo','Agregar Fertilizante')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		
		<form method="post" action="{{route('planttutor.store')}}">
		 @csrf
		 <input hidden value="{{$plantacion->id}}" name="id">
		  <div class="form-group">
		    <label for="tipo">Tutor</label>
		    <select class="form-control" id="tutor" name="tutor" >
		      @foreach($tutores as $tutor)
		      <option value="{{$tutor->id}}">{{$tutor->nombre}}</option>
		      @endforeach
		    </select>
		  </div>
					  
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection