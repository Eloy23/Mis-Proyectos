@extends('plantillas.adminMain')

@section('titulo','Nuevo Ciclo de Floracion')

@section('formbus')
	
	
	<div class="container">
		<div class="row">
			<div class="col">
			<br><br>
			<h2>Registrar Un nuevo Ciclo de Floracion</h2>
			<br>
			@php
				$parameter =[
					'id'=>$ciclo->id,
				];
				$parameter = Crypt::encrypt($parameter);
			@endphp
			<form method="post" action="{{route('ciclos.update',$parameter)}}">
			@method('PUT')
			@csrf
			<div>
			<div class="form-group row">
			<label for="example-date-input" class="col-2 col-form-label">Inicio de floración</label>
		  	<div class="col-10">
		    <input class="form-control" type="date" name="ini"  value="{{$ciclo->inicio_floracion}}" id="example-date-input">

		  	</div>
			</div>
			</div>
			<div class="form-group row">
			<label for="example-date-input" class="col-2 col-form-label">Fin de floración</label>
		  	<div class="col-10">
		    <input class="form-control" type="date" name="fin"  value="{{$ciclo->fin_floracion}}" id="example-date-input">

		  	</div>
			</div>

			<div class="form-group">
		    <label for="tipo">Daño por sequía</label>
		    <select class="form-control" id="daño" name="daño" >
		      <option {{$ciclo->daño == 'Bajo' ? 'selected' : ''}}>Bajo</option>
		      <option {{$ciclo->daño == 'Medio' ? 'selected' : ''}}>Medio</option>
		      <option {{$ciclo->daño == 'Alto' ? 'selected' : ''}}>Alto</option>
		    </select>
		  </div>

		   <div class="form-group">
		    <label for="formGroupExampleInput">Caída prematura (%)</label>
		    <input type="number" value="{{$ciclo->caida_prematura}}" class="form-control" id="prematura" name="prematura">
		  </div>

		<div class="form-group row">
			<label for="example-date-input" class="col-2 col-form-label">Fecha de cosecha</label>
		  	<div class="col-10">
		    <input class="form-control" type="date" name="cosecha"  value="{{$ciclo->fecha_cosecha}}" id="example-date-input">

		  	</div>
		</div>

		<div class="form-group">
		    <label for="formGroupExampleInput">Cosecha (kg)</label>
		    <input type="number" value="{{$ciclo->produccion}}" class="form-control" id="produccion" name="produccion">
		 </div>

		 <div class="form-group">
		    <label for="formGroupExampleInput">Pérdida estimada (kg)</label>
		    <input type="number" value="{{$ciclo->perdida_estimada}}" class="form-control" id="perdida" name="perdida">
		 </div>


		 <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
			</form>

			</div>	
		</div>
	</div>

@endsection