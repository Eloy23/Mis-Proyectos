@extends('plantillas.adminMain')


@section('titulo','Agregar Enfermedad')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		
		<form method="post" action="{{route('enfermedadesplantacion.store')}}">
		 @csrf
		 	<input hidden value="{{$plantacion->id}}" name="id">
		  <div class="form-group">
		    <label for="tipo">Enfermedad</label>
		    <select class="form-control" id="enfermedad" name="enfermedad" >
		      @foreach($enfermedades as $enfermedad)
		      <option value="{{$enfermedad->id}}">{{$enfermedad->nombre}}</option>
		      @endforeach
		    </select>
		  </div>
			
					  
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection