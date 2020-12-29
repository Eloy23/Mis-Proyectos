@extends('plantillas.adminMain')


@section('titulo','Dashboard')


@section('formbus')

<div class="container">
	<div class="row">
		<div class="col-5">
			<h2>Agregar Municipio</h2>
			<p>Añadir nuevos Municipios:</p>

			<div class="container1">
			<form action="{{route('municipios.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Municipio</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Municipios</h2>
			<p>Ver lista de municipios:</p>
			<div class="container1">
			<form action="{{route('municipios.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Municipios</button>
			
			</form>
			</div>
		</div>
		
	</div>
	<div class="row">
		
		<div class="col-5">
			<h2>Agregar Nuevo Tipo de Suelo</h2>
			<p>Añadir nuevo tipo de suelo y descripción:</p>

			<div class="container1">
			<form action="{{route('suelos.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Tipo de Suelos</h2>
			<p>Ver lista de tipo de suelos:</p>
			<div class="container1">
			<form action="{{route('suelos.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Municipios</button>
			
			</form>
			</div>
		</div>

	</div>


	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Sistema de Riego</h2>
			<p>Añadir nuevo Sistema de Riego y descripción:</p>

			<div class="container1">
			<form action="{{route('riegos.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Sistemas de Riego</h2>
			<p>Ver lista de tipos de riego:</p>
			<div class="container1">
			<form action="{{route('riegos.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Riegos</button>
			
			</form>
			</div>
		</div>

	</div>



	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Actividad Económica</h2>
			<p>Añadir nueva actividad economica para el productor:</p>

			<div class="container1">
			<form action="{{route('actividades.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Actividades Económicas</h2>
			<p>Ver lista de actividades económicas:</p>
			<div class="container1">
			<form action="{{route('actividades.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Actividades</button>
			
			</form>
			</div>
		</div>

	</div>




	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Enfermedad de Plantación</h2>
			<p>Añadir nueva enfermedad que se presenta en una plantacin:</p>

			<div class="container1">
			<form action="{{route('enfermedades.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Enfermedades de Plantación</h2>
			<p>Ver lista de las enfermedades de plantación:</p>
			<div class="container1">
			<form action="{{route('enfermedades.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Enfermedades</button>
			
			</form>
			</div>
		</div>

	</div>


	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Manejó de Plagas</h2>
			<p>Añadir nueva método para el control de plagas:</p>

			<div class="container1">
			<form action="{{route('manejospla.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Manejo de Plagas</h2>
			<p>Ver lista de los metodos de control de plagas:</p>
			<div class="container1">
			<form action="{{route('manejospla.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Métodos</button>
			
			</form>
			</div>
		</div>

	</div>

	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Plaga</h2>
			<p>Añadir nueva método para el control de plagas:</p>

			<div class="container1">
			<form action="{{route('plagas.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Plagas</h2>
			<p>Ver lista de los métodos de control de plagas:</p>
			<div class="container1">
			<form action="{{route('plagas.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Plagas</button>
			
			</form>
			</div>
		</div>

	</div>

	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Manejó de Enfermedad</h2>
			<p>Añadir nueva método para el control de enfermedades:</p>

			<div class="container1">
			<form action="{{route('manejosenfer.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Manejó de enfermedades</h2>
			<p>Ver lista de los métodos de control de enfermedades:</p>
			<div class="container1">
			<form action="{{route('manejosenfer.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Métodos</button>
			
			</form>
			</div>
		</div>

	</div>


	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Fertilizante</h2>
			<p>Añadir nuevo Fertilizante:</p>

			<div class="container1">
			<form action="{{route('fertilizantes.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Fertilizantes</h2>
			<p>Ver lista de los fertilizantes:</p>
			<div class="container1">
			<form action="{{route('fertilizantes.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Fertilizantes</button>
			
			</form>
			</div>
		</div>

	</div>

	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Tutor</h2>
			<p>Añadir nuevo tutor:</p>

			<div class="container1">
			<form action="{{route('tutores.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Tutores</h2>
			<p>Ver lista de los tutores:</p>
			<div class="container1">
			<form action="{{route('tutores.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Tutores</button>
			
			</form>
			</div>
		</div>

	</div>

	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Cultivó Asociado</h2>
			<p>Añadir nuevo cultivó asociado:</p>

			<div class="container1">
			<form action="{{route('asociados.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Cultivos Asociados</h2>
			<p>Ver lista de los cultivos asociados:</p>
			<div class="container1">
			<form action="{{route('asociados.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista de Asociados</button>
			
			</form>
			</div>
		</div>

	</div>

	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Tipos de Plantación</h2>
			<p>Añadir nuevo tipo de plantación:</p>

			<div class="container1">
			<form action="{{route('tipos.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Tipos de plantación</h2>
			<p>Ver lista de los tipos de plantación:</p>
			<div class="container1">
			<form action="{{route('tipos.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i>Lista</button>
			
			</form>
			</div>
		</div>

	</div>

	<div class="row">
		
		<div class="col-5">
			<h2 >Agregar Nueva Especie</h2>
			<p>Añadir nueva Especie:</p>

			<div class="container1">
			<form action="{{route('especies.create')}}">
			  <img class="img-fluid" src="img/municipios_add.jpg" alt="Snow" style="width:100%">
			  <button class="btn1 btn-info"><i class="fa fa-folder"></i> Agregar Nuevo</button>
			  </form>
			</div>
		</div>
		<div class="col-2"></div>
		<div class="col-5">
			<h2>Lista de Especies</h2>
			<p>Ver lista de las especies:</p>
			<div class="container1">
			<form action="{{route('especies.index')}}">
			  <img class="img-fluid" src="img/lista.jpg" alt="Snow" style="width:90%" >
			   <button class="btn1 btn-info"><i class="fa fa-bars"></i> Lista</button>
			
			</form>
			</div>
		</div>

	</div>
	
</div>

@endsection