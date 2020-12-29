@extends('plantillas.adminMain')

@section('titulo','Nueva Actividad Economica')

@section('formbus')

<div class="container">

  <div class="row">
    <div class="col">
<form method="post" action="{{route('actividades.store')}}">
@csrf

  <h2>Actividad económica</h2>
   <div class="form-group">
    <label for="nombre">Nombre de la actividad</label>
    <input type="text" class="form-control" id="actividad" name="actividad" placeholder="Obrero">
  </div>

   <div class="form-group">
    <label for="nombre">Descripción</label>
    <input type="text" class="form-control" id="descripcion" name="descripcion" placeholder="Obrero">
  </div>

	<input type="submit" name="submit" class="submit btn btn-info" value="Submit" />


    </form>
   </div>
</div>
</div>


@endsection