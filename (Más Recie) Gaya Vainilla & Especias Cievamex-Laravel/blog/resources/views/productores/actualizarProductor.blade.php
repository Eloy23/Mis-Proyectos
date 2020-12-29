@extends('plantillas.adminMain')

@section('titulo','Actualizar Productor')



@section('formbus')

<div class="container">
	<div class="row">
		<div class="col">
			
		<h2>Actualizar Productor</h2>
   <br>


  <div class="form-check">
    <a type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalScrollable">Actualizar Dirección</a>
  </div>
  <div class="form-check">
    <a type="button" class="btn btn-primary" data-toggle="modal" data-target="#datosHogar">Actualizar Datos del Hogar</a>
  </div>


<!-- Modal -->
<div class="modal fade" id="exampleModalScrollable" tabindex="-1" role="dialog" aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-scrollable" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalScrollableTitle">Actualizar Dirección</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      	<form method="post" action="{{route('productores.update',$productor->id)}}"  >
    @method('PUT')
      @csrf

      <input hidden value="{{$direccion->id}}" name="id_dire">
   <div class="form-group">
    <label for="nombre">Calle</label>
    <input type="text" value="{{$direccion->calle}}" class="form-control" id="calle" name="calle" placeholder="Arista">
  </div>

   <div class="form-group">
    <label for="apellidos">Número</label>
    <input type="text" value="{{$direccion->numero}}" class="form-control" id="numero" name="numero" placeholder="Apellidos">
  </div>

  <div class="form-group">
    <label for="apellidos">Colonia</label>
    <input type="text" value="{{$direccion->colonia}}" class="form-control" id="colonia" name="colonia" placeholder="Apellidos">
  </div>

   <div class="form-group">
      <label for="tipo">Municipios</label>
      <select  class="form-control" id="select_muni" name="select_muni" >
    @foreach($municipios as $municipio)
    
    <option value="{{$municipio->id}}"
    {{$direccion->id_municipio == $municipio->id ? 'selected' : ''}}> {{$municipio->nombre}}</option>  
     @endforeach
    </select>
  </div>

  <div class="form-group">
    <label for="apellidos">Localidad</label>
    <input type="text" value="{{$direccion->localidad}}" class="form-control" id="localidad" name="localidad" placeholder="20">
  </div>

   <div class="form-group">
    <label for="apellidos">Ejido</label>
    <input type="text" value="{{$direccion->ejido}}" class="form-control" id="ejido" name="ejido" placeholder="20">
  </div>

   <div class="form-group">
    <label for="apellidos">Referencias</label>
    <input type="text" value="{{$direccion->referencias}}" class="form-control" id="referencias" name="referencias" placeholder="20">
  </div>

<input type="submit" name="boton" value="Guardar" class="btn btn-primary">
</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
      </div>
    </div>
  </div>
</div>




   <form method="post" action="{{route('productores.update',$productor->id)}}"  >
    @method('PUT')
      @csrf
      <input hidden value="{{$productor->id}}" name="id_produ">
   <div class="form-group">
    <label for="nombre">Nombre del productor</label>
    <input type="text" value="{{$productor->nombre}}" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
  </div>

   <div class="form-group">
    <label for="apellidos">Apellido paterno</label>
    <input type="text" value="{{$productor->apellido_pat}}" class="form-control" id="apellidos_pat" name="apellido_pat" placeholder="Apellidos">
  </div>

  <div class="form-group">
    <label for="apellidos">Apellido materno</label>
    <input type="text" value="{{$productor->apellido_mat}}" class="form-control" id="apellidos_mat" name="apellido_mat" placeholder="Apellidos">
  </div>

  <div class="form-group">
    <label for="apellidos">Edad del usuario</label>
    <input type="text" value="{{$productor->edad}}" class="form-control" id="edad" name="edad" placeholder="20">
  </div>

  <div class="form-group">
    <label for="tipo">Sexo</label>
    <select class="form-control" id="sexo" name="sexo" >
     
      <option {{$productor->sexo == 'Hombre' ? 'selected' : ''}}>Hombre</option>
      <option {{$productor->sexo == 'Mujer' ? 'selected' : ''}}>Mujer</option>
    </select>
  </div>

  <div class="form-group">
    <label for="ingreso">Ingreso mensual</label>
    <input type="text" class="form-control" value="{{number_format($productor->ingreso)}}" id="ingreso" name="ingreso" placeholder="$500">
  </div>
  
   <div class="form-group">
    <label for="gasto">Gasto mensual</label>
    <input type="text" class="form-control" value="{{number_format($productor->gasto)}}" id="gasto" name="gasto" placeholder="$500">
  </div>

  <div class="form-group">
    <label for="tipo">Escolaridad</label>
    <select class="form-control" id="escolaridad" name="escolaridad" >
   
      <option {{$productor->escolaridad == 'Nula' ? 'selected' : ''}}>Nula</option>
      <option {{$productor->escolaridad == 'Primaria' ? 'selected' : ''}}>Primaria</option>
      <option {{$productor->escolaridad == 'Secundaria' ? 'selected' : ''}}>Secundaria</option>
      <option {{$productor->escolaridad == 'Media Superior' ? 'selected' : ''}}>Media Superior</option>
      <option {{$productor->escolaridad == 'Superior' ? 'selected' : ''}}>Superior</option>
    </select>
  </div>

  <div class="form-group">
    <label for="tipo">Seguro</label>
    <select class="form-control" id="seguro" name="seguro" >
   	
      <option {{$productor->seguro == 'IMSS' ? 'selected' : ''}}>IMSS</option>
      <option {{$productor->seguro == 'ISSSTE' ? 'selected' : ''}}>ISSSTE</option>
      <option {{$productor->seguro == 'Seguro Popular' ? 'selected' : ''}}>Seguro Popular</option>
      <option {{$productor->seguro == 'Particular' ? 'selected' : ''}}>Particular</option>
      <option {{$productor->seguro == 'PEMEX' ? 'selected' : ''}}>PEMEX</option>
    </select>
  </div>

 

 <div class="form-group">
 	<input hidden id="valor" value="{{$productor->jefe_familia}}"> 
 	<label>Jefe de familia
 		<br>
 	<input id="radio1"  type="radio" name="jefe" value="1">Si

	<br>

	<input id="radio2" type="radio" name="jefe" value="2">No

	</label>

 </div>

    <div class="form-group">
    <label for="tipo">Estado civil</label>
    <select class="form-control" id="civil" name="civil" >
      
      <option {{$productor->estado_civil == 'Casado' ? 'selected' : ''}}>Casado</option>
      <option {{$productor->estado_civil == 'Union Libre' ? 'selected' : ''}}>Union Libre</option>
      <option {{$productor->estado_civil == 'Viud@' ? 'selected' : ''}}>Viud@</option>
      <option {{$productor->estado_civil == 'Divorciad@' ? 'selected' : ''}}>Divorciad@</option>
      <option {{$productor->estado_civil == 'Solter@' ? 'selected' : ''}}>Solter@</option>
    </select>
  </div>
<input type="submit" name="boton" value="Guardar" class="btn btn-primary">
</form>
  

		</div>
	</div>
</div>




<!-- Modal -->
<div class="modal fade" id="datosHogar" tabindex="-1" role="dialog" aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-scrollable" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalScrollableTitle">Actualizar Datos del Hogar</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form method="post" action="{{route('productores.update',$productor->id)}}"  >
    @method('PUT')
      @csrf
      <input hidden value="{{$casa->id}}" name="id_casa">
<div class="form-group">
    <label for="tipo">Su casa es</label>
    <select class="form-control" id="estado_casa" name="estado_casa" >
      
      <option {{$casa->estado_casa == 'Rentada' ? 'selected' : ''}}>Rentada</option>
      <option {{$casa->estado_casa == 'Prestada' ? 'selected' : ''}}>Prestada</option>
      <option {{$casa->estado_casa == 'Propia' ? 'selected' : ''}}>Propia</option>
    </select>
</div>

  <div class="form-group">
    <label for="tipo">El material con el que esta construida su casa es</label>
    <select class="form-control" id="material" name="material" >
    
      <option {{$casa->material == 'Block' ? 'selected' : ''}}>Block</option>
      <option {{$casa->material == 'Ladrillo' ? 'selected' : ''}}>Ladrillo</option>
      <option {{$casa->material == 'Madera' ? 'selected' : ''}}>Madera</option>
      <option {{$casa->material == 'Otro' ? 'selected' : ''}}>Otro</option>
    </select>
  </div>

  <div class="form-group">
    <label for="tipo">El material del piso es</label>
    <select class="form-control" id="piso" name="piso" >
      
      <option {{$casa->piso == 'Tierra' ? 'selected' : ''}}>Tierra</option>
      <option {{$casa->piso == 'Concreto' ? 'selected' : ''}}>Concreto</option>
      <option {{$casa->piso == 'Otro' ? 'selected' : ''}}>Otro</option>
    </select>
  </div>

  <div class="form-group">
    <label for="tipo">El material del techo es</label>
    <select class="form-control" id="techo" name="techo" >
      
      <option {{$casa->techo == 'Lamina' ? 'selected' : ''}}>Lamina</option>
      <option {{$casa->techo == 'Concreto' ? 'selected' : ''}}>Concreto</option>
      <option {{$casa->techo == 'Otro' ? 'selected' : ''}}>Otro</option>
    </select>
  </div>

  <div class="form-group">
    <label for="tipo">El combustible que utilizan en su hogar es</label>
    <select class="form-control" id="combustible" name="combustible" >
      
      <option {{$casa->combustible == 'Gas' ? 'selected' : ''}}>Gas</option>
      <option {{$casa->combustible == 'Leña' ? 'selected' : ''}}>Leña</option>
    </select>
  </div>



  
  <h3>Características del Hogar</h3>
  <label>En en el siguiente formulario seleccionará
      la opción con la que cuenta su Hogar</label>

<input hidden value="{{$casa->caracteristicascasa->id}}" name="id_cra">
 <div class="form-group">
    <label for="nombre">Con cuantas Plantas cuenta su hogar</label>
    <input type="text" class="form-control" value="{{$casa->caracteristicascasa->plantas}}" id="plantas" name="plantas" placeholder="2">
  </div>


  <div class="form-group">
  <label>Sala
    <br>
  <input type="radio" name="sala" value="1"
  {{$casa->caracteristicascasa->sala == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="sala" value="2"
  {{$casa->caracteristicascasa->sala == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Comedor
    <br>
  <input type="radio" name="comedor" value="1"
  {{$casa->caracteristicascasa->comedor == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="comedor" value="2"
  {{$casa->caracteristicascasa->comedor == '2' ? 'checked' : ''}}>No

  </label>
 </div>

<div class="form-group">
  <label>Cocina
    <br>
  <input type="radio" name="cocina" value="1"
  {{$casa->caracteristicascasa->cocina == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="cocina" value="2"
  {{$casa->caracteristicascasa->cocina == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
    <label for="nombre">Con cuantas Cuartos cuenta su hogar</label>
    <input type="text" class="form-control" value="{{$casa->caracteristicascasa->cuartos}}" id="cuartos" name="cuartos" placeholder="2">
  </div>

  <div class="form-group">
    <label for="nombre">Con cuantos baños cuenta su hogar</label>
    <input type="text" class="form-control" value="{{$casa->caracteristicascasa->baños}}" id="baños" name="baños" placeholder="2">
  </div>

 <div class="form-group">
  <label>Patio
    <br>
  <input type="radio" name="patio" value="1"
  {{$casa->caracteristicascasa->patio == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="patio" value="2"
  {{$casa->caracteristicascasa->patio == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Cochera
    <br>
  <input type="radio" name="cochera" value="1"
  {{$casa->caracteristicascasa->cochera== '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="cochera" value="2"
  {{$casa->caracteristicascasa->cochera == '2' ? 'checked' : ''}}>No

  </label>
 </div>


 <h2> Servicios Y Equipamientos</h2>
 
  <label>En en el siguiente formulario seleccionará 
      los servicios y equipamientos con los que cuenta su Hogar</label>
<input hidden value="{{$casa->servicios->id}}" name="id_serv">
  <div class="form-group">
  <label>Luz eléctrica
    <br>
  <input type="radio" name="casa_luz" value="1"
  {{$casa->servicios->electricidad == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_luz" value="2"
  {{$casa->servicios->electricidad == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Drenaje
    <br>
  <input type="radio" name="casa_drenaje" value="1"
  {{$casa->servicios->drenaje == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_drenaje" value="2"
  {{$casa->servicios->drenaje == '2' ? 'checked' : ''}}>No

  </label>
 </div>

<div class="form-group">
  <label>Agua potable
    <br>
  <input type="radio" name="casa_potable" value="1"
  {{$casa->servicios->potable == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_potqable" value="2"
  {{$casa->servicios->potable == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Gas
    <br>
  <input type="radio" name="casa_gas" value="1"
  {{$casa->servicios->gas == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_gas" value="2"
  {{$casa->servicios->gas == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Lavadora
    <br>
  <input type="radio" name="casa_lavadora" value="1"
  {{$casa->servicios->lavadora == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_lavadora" value="2"
  {{$casa->servicios->lavadora == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Refrigerador
    <br>
  <input type="radio" name="casa_refrigerador" value="1"
  {{$casa->servicios->refrigerador == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_refrigerador" value="2"
  {{$casa->servicios->refrigerador == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Televisión
    <br>
  <input type="radio" name="casa_tv" value="1"
  {{$casa->servicios->television == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_tv" value="2"
  {{$casa->servicios->television == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Telefono fijo
    <br>
  <input type="radio" name="casa_tel" value="1"
  {{$casa->servicios->telefono == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_tel" value="2"
  {{$casa->servicios->telefono == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Célular móvil
    <br>
  <input type="radio" name="casa_cel" value="1"
  {{$casa->servicios->celular == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_cel" value="2"
  {{$casa->servicios->celular == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Microondas
    <br>
  <input type="radio" name="casa_micro" value="1"
  {{$casa->servicios->microondas == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_micro" value="2"
  {{$casa->servicios->microondas == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Radio
    <br>
  <input type="radio" name="casa_radio" value="1"
  {{$casa->servicios->radio == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_radio" value="2"
  {{$casa->servicios->radio == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>DVD
    <br>
  <input type="radio" name="casa_dvd" value="1"
  {{$casa->servicios->dvd == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_dvd" value="2"
  {{$casa->servicios->dvd == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Computadora
    <br>
  <input type="radio" name="casa_computadora" value="1"
  {{$casa->servicios->computadora == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_computadora" value="2"
  {{$casa->servicios->computadora == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Internet
    <br>
  <input type="radio" name="casa_internet" value="1"
  {{$casa->servicios->internet == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_internet" value="2"
  {{$casa->servicios->internet == '2' ? 'checked' : ''}}>No

  </label>
 </div>

 <div class="form-group">
  <label>Automóvil
    <br>
  <input type="radio" name="casa_auto" value="1"
  {{$casa->servicios->automovil == '1' ? 'checked' : ''}}>Si

  <br>

  <input type="radio" name="casa_auto" value="2"
  {{$casa->servicios->automovil == '2' ? 'checked' : ''}}>No

  </label>
 </div>
      

  
<input type="submit" name="boton" value="Guardar" class="btn btn-primary">
</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
      </div>
    </div>
  </div>
</div>



 <script type="text/javascript">
  var radio1 = document.getElementById('radio1');
  var radio2 = document.getElementById('radio2');

  var form =document.getElementById('valor').value;
  
  console.log(form);
  if( form == 1){
	radio1.setAttribute('checked','true');
}else{
	radio2.setAttribute('checked','true');
}

  </script>


@endsection