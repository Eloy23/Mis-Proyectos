@extends('plantillas.adminMain')

@section('titulo','Registrar Usuario')


@section('formbus')

<br><br>
<div class="container">
  <div class="row">
  <div class="col-lg-2"></div>
  <div class="col-lg-8">
<br><br>
    <div class="jumbotron">
    
      <div align="center">
    <h2>Registrar Nuevo Usuario</h2>
    
      </div>
    <form method="post" action="/usuarios"  >
      @csrf


  <div class="form-group">
    <label for="nombre">Nombre del usuario</label>
    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
  </div>

   <div class="form-group">
    <label for="apellidos">Apellidos del usuario</label>
    <input type="text" class="form-control" id="apellidos" name="apellidos" placeholder="Apellidos">
  </div>

  <div class="form-group">
    <label for="apellidos">Edad del usuario</label>
    <input type="text" class="form-control" id="edad" name="edad" placeholder="20">
  </div>

  <div class="form-group">
    <label for="correo">Correo</label>
    <input type="email" class="form-control" id="correo" name="correo" placeholder="ejemplo@gmail.com">
  </div>


  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password" >
  </div>

  <div class="form-group">
    <label for="tipo">Tipo de usuario</label>
    <select class="form-control" id="tipo" name="tipo" >  
      <option>Administrador</option>
      <option value="tecnico">Asesor técnico</option>
      <option value="campo">Asesor de campo</option>
      <option>Productor</option>
    </select>
  </div>

  <div class="form-group">
    <label for="password">Teléfono</label>
    <input type="text" class="form-control" id="telefono" name="telefono" placeholder="5510998745" >
  </div>

  <div class="form-group">
  	  <label for="tipo">Cargo</label>
  	  <select  class="form-control" id="cargo" name="cargo" >
  	@foreach($cargos as $cargo)
    
    <option value="{{$cargo->id}}"> {{$cargo->nombre}}</option>  
     @endforeach
    </select>
  </div>


   <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1" required="">
    <a type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalScrollable">Terminos y Condiciones</a>
  </div>


<!-- Modal -->
<div class="modal fade" id="exampleModalScrollable" tabindex="-1" role="dialog" aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-scrollable" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalScrollableTitle">Términos y Condiciones</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <h5 style="text-align: justify;">Condiciones de uso</h5>
        <p style="text-align: justify;">El usuario del sitio Web (www.uteach.com.mx) se compromete a leer detenidamente los términos y condiciones generales, antes de utilizar dicho sitio web. Ello implica que usted acepta expresamente los términos y condiciones generales. En caso de no aceptarlos, se le solicita que no haga uso, ni acceda, ni manipule la información del sitio Web, ya que usted (usuario) estaría haciendo un uso inadecuado de éste.</p>
        <p style="text-align: justify;">El propósito del sitio Web es el brindar asesorías presenciales a todos los alumnos interesados de la Universidad Tecnológica de Gutiérrez Zamora. Como ya se mencionó el sitio web está dirigido para estudiantes, pero también para los docentes de dicha institución ya que ellos serán los encargados de brindar las asesorías a los alumnos.</p>
        <p style="text-align: justify;">Para sugerencias y/o comentarios sobre los términos y condiciones de uso de nuestro sitio Web pueden notificarnos en Gutiérrez Zamora, Veracruz, México.</p>
        <h5 style="text-align: justify;">Derechos de Autor</h5>
        <p style="text-align: justify;">Este sitio se encuentra protegido por la normativa vigente sobre derechos de autor. Todos los derechos involucrados, como por ejemplo su contenido y su diseño visual, son de titularidad de UTeach, por lo que se encuentra estrictamente prohibido su empleo, modificación, reproducción, distribución, transmisión o comercialización de los derechos involucrados sin el permiso previo, expreso y por escrito de Uteach, salvo los casos de empleo para finalidades educativas y los demás usos honrados reconocidos.</p>
        <h5 style="text-align: justify;">Aceptación de términos</h5>
        <p style="text-align: justify;">Los sitios Web y referencias están disponibles para que el usuario bajo su responsabilidad los utilice adecuadamente sin aprovecharse de alguna falla que ocurra y saque provecho de la misma. Si encuentra alguna falla en nuestro sitio Web reportarla a 16610010@utgz.edu.mx</p>
        <p style="text-align: justify;">Los cambios y actualizaciones en los términos y condiciones de uso serán comunicados en nuestro sitio web oportunamente para que todos los usuarios se informen de los términos y condiciones de uso vigente. Está bajo la responsabilidad del usuario enterarse de los nuevos cambios y restringirse a cumplir como normativa del sitio web.</p>
        <p style="text-align: justify;">Los usuarios registrados como docentes deberán asignar el 5% del monto que cobren por cada clase que estos asignen.</p>
        <p style="text-align: justify;">Los alumnos deberán efectuar el pago por la clase que deseen para poder tener contacto con el docente mediante el chat de la pagina web.</p>
        <h5 style="text-align: justify;">Obligaciones de los usuarios registrados</h5>
        <p style="text-align: justify;">El acceso a la página web a través del correo electrónico y contraseña establecidos es de su plena y exclusiva responsabilidad, así como por el uso de los mismos.</p>
        <p style="text-align: justify;">No hacer uso del correo electrónico y contraseña establecidos para ningún propósito ilegal.</p>
        <h5 style="text-align: justify;">Obligaciones de los usuarios en general</h5>
        <p style="text-align: justify;">El acceso de los servicios de la aplicación web son carácter público para toda la comunidad de la Universidad Tecnológica de Gutiérrez Zamora.</p>
        <p style="text-align: justify;">El usuario se compromete a suministrar información verdadera y exacta acerca de él mismo en los formularios de registro de UTeach.</p>
        <h5 style="text-align: justify;">Modificaciones a los Términos y Condiciones</h5>
        <p style="text-align: justify;">UTeach tiene el derecho de modificar el contenido y alcance de los presentes Términos y Condiciones en cualquier momento y según lo considere necesario. El usuario estará obligado a sujetarse a dichas modificaciones, una vez que éstas entren en vigor.</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
      </div>
    </div>
  </div>
</div>
  </div>


  <input type="submit" name="boton" value="Guardar" class="btn btn-primary">
</form>

  </div>
  </div>
</div>
</div>



@endsection