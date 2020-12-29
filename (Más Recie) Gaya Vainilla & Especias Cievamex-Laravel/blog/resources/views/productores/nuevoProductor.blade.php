@extends('plantillas.adminMain')


@section('titulo', 'Registrar Productor')


@section('formbus')

<div class="container">
  <div class="row">
    <div class="col">
      <br>
   
    <form method="post" action="{{route('productores.store')}}"  >
    @csrf
     <h2>Registo de productor</h2>
     <br>
   <div class="form-group">
    <label for="nombre">Nombre del productor</label>
    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
  </div>

   <div class="form-group">
    <label for="apellidos">Apellido paterno</label>
    <input type="text" class="form-control" id="apellidos_pat" name="apellido_pat" placeholder="Apellidos">
  </div>

  <div class="form-group">
    <label for="apellidos">Apellido materno</label>
    <input type="text" class="form-control" id="apellidos_mat" name="apellido_mat" placeholder="Apellidos">
  </div>

  <div class="form-group">
    <label for="apellidos">Edad del usuario</label>
    <input type="text" class="form-control" id="edad" name="edad" placeholder="20">
  </div>

  <div class="form-group">
    <label for="tipo">Sexo</label>
    <select class="form-control" id="sexo" name="sexo" >
      <option >Hombre</option>
      <option>Mujer</option>
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

  <div class="form-group">
    <label for="tipo">Seguro</label>
    <select class="form-control" id="seguro" name="seguro" >
      <option >IMSS</option>
      <option>ISSSTE</option>
      <option>Seguro Popular</option>
      <option>Particular</option>
      <option>PEMEX</option>
    </select>
  </div>

   <div class="form-group">
      <label for="tipo">Municipios</label>
      <select  class="form-control" id="select_muni" name="select_muni" >
      <option>Seleccione una Opcion</option>
    @foreach($municipios as $municipio)
    
    <option value="{{$municipio->id}}"> {{$municipio->nombre}}</option>  
     @endforeach
    </select>
  </div>

  <input type="submit" name="submit" class="submit btn btn-info" value="Submit" />

  </form>

    </div>
  </div>
</div>

@endsection