@extends('plantillas.adminMain')

@section('titulo','Agregar Familiar')

@section('formbus')

<div class="container">
	<div class="row">
		<div class="col">
			
		<form method="post" action="{{route('familiares.store')}}">
		@csrf
	<div>
		<input hidden  name="id_productor" value="{{$productor->id}}">
	</div>

	<div class="form-group">
    <label for="nombre">Nombre del familiar</label>
    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
  	</div>

  	<div class="form-group">
    <label for="nombre">Apellido paterno</label>
    <input type="text" class="form-control" id="apellido_pat" name="apellido_pat" placeholder="apellido_pat">
  	</div>

  	<div class="form-group">
    <label for="nombre">Apellido materno</label>
    <input type="text" class="form-control" id="apellido_mat" name="apellido_mat" placeholder="apellido_mat">
  	</div>

  	<div class="form-group">
    <label for="nombre">Edad</label>
    <input type="text" class="form-control" id="edad" name="edad" placeholder="35">
  	</div>

  	<div class="form-group row">
  	<label for="example-date-input" class="col-2 col-form-label">Fecha de nacimiento</label>
  	<div class="col-10">
    <input class="form-control" type="date" name="date" value="2011-08-19" id="example-date-input">
  	</div>
  	</div>

  	<div class="form-group">
    <label for="tipo">Parentesco</label>
    <select class="form-control" id="parentesco" name="parentesco" >
      <option >Mamá</option>
      <option>Papá</option>
      <option>Abuelo</option>
      <option>Abuela</option>
      <option>Bizbuelo</option>
      <option>Bizabuela</option>
      <option>Hermano</option>
      <option>Hermana</option>
      <option>Cónyu</option>
      <option>Hijo</option>
      <option>Hija</option>
      <option>Tio</option>
      <option>Tia</option>
      <option>Sobrino</option>
      <option>Sobrina</option>
      <option>Cuñado</option>
      <option>Cuñada</option>
      <option>Nieto</option>
      <option>Nieta</option>
      <option>Yerno</option>
      <option>Nuera</option>
    </select>
  	</div>

  	<div class="form-group">
    <label for="tipo">Escolaridad</label>
    <select class="form-control" id="escolaridad" name="escolaridad" >
      <option >Nula</option>
      <option>Primaria</option>
      <option>Secundaria</option>
      <option>Media Superior</option>
      <option>Superior</option>
    </select>
  	</div>
<br>


  	@foreach($enfermedades as $enfermedad)

  	 <input type="checkbox" name="enfermedad[]" value="{{$enfermedad->id}}" />{{$enfermedad->nombre}} <br />

  	@endforeach
<br>
  	<div class="form-group">
    <label for="nombre">Ingreso mensual</label>
    <input type="text" class="form-control" id="ingreso" name="ingreso" placeholder="$1500">
  	</div>

  	<div class="form-group">
    <label for="nombre">Gasto mensual</label>
    <input type="text" class="form-control" id="gasto" name="gasto" placeholder="300">
  	</div>
	

	 <input type="submit" name="submit" class="submit btn btn-success" value="Submit" />
	
		</form>

		</div>
	</div>
</div>


@endsection