@extends('plantillas.adminMain')


@section('titulo','Actualizar Usuario')


@section('formbus')

<br><br>
<div class="container">
  <div class="row">
  <div class="col-lg-2"></div>
  <div class="col-lg-8">
<br><br>
    <div class="jumbotron">
    
      <div align="center">
    <h2>Actualizar usuario</h2>
    
      </div>
    <form method="post" action="{{route('usuarios.update',$user->id)}}"  >
    @method('PUT')
      @csrf


  <div class="form-group">
    <label for="nombre">Nombre del usuario</label>
    <input value="{{$user->nombre}}" type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
  </div>

   <div class="form-group">
    <label for="apellidos">Apellidos del usuario</label>
    <input value="{{$user->apellidos}}" type="text" class="form-control" id="apellidos" name="apellidos" placeholder="Apellidos">
  </div>

  <div class="form-group">
    <label for="apellidos">Edad del usuario</label>
    <input value="{{$user->edad}}" type="text" class="form-control" id="edad" name="edad" placeholder="20">
  </div>

  <div class="form-group">
    <label for="correo">Correo</label>
    <input value="{{$user->email}}" type="email" class="form-control" id="correo" name="correo" placeholder="ejemplo@gmail.com">
  </div>


  <div class="form-group">
    <label for="password">Password</label>
    <input required  type="password" class="form-control" id="password" name="password" >
  </div>

  <div class="form-group">
    <label for="tipo">Tipo de usuario</label>
    <select class="form-control" id="tipo" name="tipo" >
     
      <option {{$user->tipo == 'Administrador' ? 'selected' : ''}}>Administrador</option>
       <option value="tecnico" {{$user->tipo == 'tecnico' ? 'selected' : ''}}>Asesor técnico</option>
      <option value="campo" {{$user->tipo == 'campo' ? 'selected' : ''}}>Asesor de campo</option>
      <option {{$user->tipo == 'Productor' ? 'selected' : ''}}>Productor</option>
    </select>
  </div>

  <div class="form-group">
    <label for="password">Teléfono</label>
    <input value="{{$user->telefono}}" type="text" class="form-control" id="telefono" name="telefono" placeholder="5510998745" >
  </div>

  <div class="form-group">
  	  <label for="tipo">Cargo</label>
  	  <select  class="form-control" id="cargo" name="cargo" >
  	  
  	@foreach($cargos as $cargo)
    
    <option value="{{$cargo->id}}"
    {{$user->id_cargo == $cargo->id ? 'selected' : ''}}> {{$cargo->nombre}}</option>  
     @endforeach
    </select>
  </div>


  


  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
</form>

  </div>
  </div>
</div>
</div>



@endsection