@extends('plantillas.adminMain')


@section('titulo','Agregar Fertilizante')

@section('formbus')

<br>
<div class="container">
	<div class="row">
		<div class="col">
		
		<form method="post" action="{{route('plantferti.store')}}">
		 @csrf
		 <input hidden value="{{$plantacion->id}}" name="id">
		  <div class="form-group">
		    <label for="tipo">Fertilizante utilizado</label>
		    <select class="form-control" id="fertilizante" name="fertilizante" >
		      @foreach($fertilizantes as $fertilizante)
		      <option value="{{$fertilizante->id}}">{{$fertilizante->nombre}}</option>
		      @endforeach
		    </select>
		  </div>
					  
		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>


		</div>
	</div>
</div>

@endsection