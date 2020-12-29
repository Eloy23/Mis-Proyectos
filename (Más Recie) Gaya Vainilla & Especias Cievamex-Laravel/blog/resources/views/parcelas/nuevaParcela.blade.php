@extends('plantillas.adminMain')

@section('titulo','Nueva Parcela')

@section('formbus')

<div class="container">
	<div class="row">
		<div class="col">
		<form method="post" action="{{route('parcelas.store')}}">
		 @csrf
		  <div class="form-group">
		    <label for="formGroupExampleInput">Latitud (O)</label>
		    <input type="text" class="form-control" id="latitud" name="latitud">
		  </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput">Longitud (N)</label>
		    <input type="text" class="form-control" id="longitud" name="longitud">
		  </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput">Altitud (msnm)</label>
		    <input type="number" class="form-control" id="altitud" name="altitud">
		  </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput">Superficie en Producción(Ha)</label>
		    <input type="number" class="form-control" id="ha" name="ha">
		  </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput">Pendiente (%)</label>
		    <input type="number" class="form-control" id="pendiente" name="pendiente">
		  </div>

		  <div class="form-group">
		    <label for="formGroupExampleInput2">Localidad</label>
		    <input type="text" class="form-control" name="localidad" id="localidad" placeholder="Emiliano Zapata">
		  </div>


		   <div class="form-group">
		      <label for="tipo">Tipo de suelo</label>
		      <select  class="form-control" id="suelo" name="suelo" >
		      <option>Seleccione una Opcion</option>
		    @foreach($suelos as $suelo)
		    <option value="{{$suelo->id}}"> {{$suelo->nombre}}</option>  
		     @endforeach
		    </select>
		  </div>

		  <div class="form-group">
		      <label for="tipo">Tipo de riego</label>
		      <select  class="form-control" id="riego" name="riego" >
		      <option>Seleccione una Opcion</option>
		    @foreach($riegos as $riego)
		    <option value="{{$riego->id}}"> {{$riego->nombre}}</option>  
		     @endforeach
		    </select>
		  </div>

		  <div class="form-group">
		      <label for="tipo">Municipio</label>
		      <select  class="form-control" id="municipio" name="municipio" >
		      <option>Seleccione una Opcion</option>
		    @foreach($municipios as $municipio)
		    <option value="{{$municipio->id}}"> {{$municipio->nombre}}</option>  
		     @endforeach
		    </select>
		  </div>

		  <div class="form-group">
		      <label for="tipo">Propietario</label>
		      <select  class="form-control" id="productor" name="productor" >
		      <option>Seleccione una Opcion</option>
		    @foreach($productores as $productor)
		    <option value="{{$productor->id}}"> {{$productor->nombre}}</option>  
		     @endforeach
		    </select>
		  </div>

		  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
		</form>

		</div>
	</div>
</div>

@endsection