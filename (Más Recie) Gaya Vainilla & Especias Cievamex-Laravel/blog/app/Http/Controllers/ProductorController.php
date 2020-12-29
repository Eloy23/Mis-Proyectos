<?php

namespace App\Http\Controllers;

use App\Productor;
use App\Estados;
use App\Cargos;
use App\Familia;
use App\Municipio;
use App\CaracteristicasMunicipio;
use App\ActividadEconomica;
use App\Direccion;
use App\ServiciosEquipamiento;
use App\CaractesticasCasa;
use App\Casa;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class ProductorController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
     public function __construct(){
        $this->middleware('auth');
       
        $this->middleware(function ($request, $next) {
       
        $tipo= Auth()->user()->tipo;
         if(Auth::check() && Auth::user()->tipo=='Administrador'){
             return $next($request);
         }
        else if(Auth::check() && Auth::user()->tipo=='tecnico'){
            return $next($request);
        }else if(Auth::check() && Auth::user()->tipo=='campo'){
            return $next($request);

        }else if(Auth::check() && Auth::user()->tipo=='Productor'){
            return $next($request);

        }else{
            
             return redirect('alertas');
        }
        
        });
        
    }
    public function index(Request $request)
    {
        $variable = $request->buscar;
        $direcciones = Direccion::all();
        $productores = Productor::Where('nombre','LIKE',"%".$variable."%")
                        ->orWhere('apellido_pat','LIKE',"%".$variable."%")
                        ->orWhere('apellido_mat','LIKE',"%".$variable."%")
                        ->orWhere('escolaridad','LIKE',"%".$variable."%")
                        ->orWhere('edad','LIKE',"%".$variable."%")->get();
       
         
        return view('productores.productores',['productores'=>$productores,'direcciones'=>$direcciones]);
       

        
    }

    public function editaractivad($id){
        $productor = Productor::find($id);
        $actividades = ActividadEconomica::all();

        return view('productores.updateActividad',['actividades'=>$actividades,
            'productor'=>$productor]);
    }

    public function updateactividad($id,Request $request){
            $productor = Productor::find($id);

            $productor->id_acteconomica = $request->select_act;

            $productor->save();

            return redirect('productores');


    }
    public function addFamilia(){
        $productores = Productor::all();
       
         
        return view('productores.productorFamilia',['productores'=>$productores]);
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        //
        $estados= Estados::all();
        $municipios= Municipio::all();
        $actividades = ActividadEconomica::all();
        return view('productores.nuevoProductor',['estados'=>$estados,'municipios'=>$municipios
            ,'actividades'=>$actividades]);
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
      
        $defaultactividad =2;
        $select_muni = $request->select_muni;

        $caracteristicascasa = new CaractesticasCasa();
        $caracteristicascasa->save();
        $id_caraccasa=CaractesticasCasa::max('id');

        $serv = new ServiciosEquipamiento();
        $serv->save();
        $id_servequip=ServiciosEquipamiento::max('id');

        $direccion = new Direccion();
        $direccion->id_municipio = $select_muni;
        $direccion->save();
        $id_direccion=Direccion::max('id');

        $casa = new Casa();
        $casa->id_servequip = $id_servequip;
        $casa->id_caractcasa = $id_caraccasa;
        $casa->save();

        $id_casa=Casa::max('id');

        $productor = new Productor();
        $productor->nombre=$request->nombre;
        $productor->apellido_pat=$request->apellido_pat;
        $productor->apellido_mat=$request->apellido_mat;
        $productor->edad=$request->edad;
        $productor->sexo=$request->sexo;
        $productor->escolaridad=$request->escolaridad;
        $productor->id_direccion= $id_direccion;
        $productor->id_acteconomica= $defaultactividad;
        $productor->seguro=$request->seguro;
        $productor->id_estatuscasa=$id_casa;
    
        $productor->save();

        return redirect('productores');
        

    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Productor  $productor
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        //
        $productor = Productor::find($id);
        $familias = Familia::where('id_productor', $id)->get();
        $id_produ= $productor->id_direccion;
        $direccion = Direccion::where('id',$id_produ)->first();
        $view = view('productores.estudioPdf',compact('productor','familias','direccion'));

        // return $view;
        $pdf = \App::make('dompdf.wrapper');
        $pdf->loadHTML($view);
        return $pdf->stream();
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  \App\Productor  $productor
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        //

        

        
        $productor= Productor::find($id);
        $dire= $productor->id_direccion;
        $id_casa= $productor->id_estatuscasa;
        $direccion = Direccion::where('id','=', $dire)->first();
        $casa= Casa::find($id_casa)->first();
        $municipios= Municipio::all();
        return view('productores.actualizarProductor',['productor'=>$productor,
            'direccion'=>$direccion,'municipios'=>$municipios,
            'casa'=>$casa]);
        
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Productor  $productor
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        //
        $estado=$request->estado_casa;
        $prueba = $request->calle;
        if($prueba != ''){
        $id_dire = $request->id_dire;
        $direccion = Direccion::find($id_dire);
        $direccion->calle = $request->calle;
        $direccion->numero = $request->numero;
        $direccion->colonia = $request->colonia;
        $direccion->id_municipio = $request->select_muni;
        $direccion->localidad = $request->localidad;
        $direccion->ejido = $request->ejido;
        $direccion->referencias = $request->referencias;

        $direccion->save();
        return redirect('productores');

        }

        if($estado != ''){
        $id_casa= $request->id_casa;

        
        $id_cra = $request->id_cra;
        $caracteristicascasa = CaractesticasCasa::find($id_cra);

        $caracteristicascasa->plantas =$request->plantas;
        $caracteristicascasa->sala =$request->sala;
        $caracteristicascasa->comedor =$request->comedor;
        $caracteristicascasa->cocina=$request->cocina;
        $caracteristicascasa->cuartos =$request->cuartos;
        $caracteristicascasa->baños =$request->baños;
        $caracteristicascasa->patio =$request->patio;
        $caracteristicascasa->cochera =$request->cochera;

        $caracteristicascasa->save();
        $id_serv =$request->id_serv;
        $serv = ServiciosEquipamiento::find($id_serv);

        $serv->electricidad= $request->casa_luz;
        $serv->drenaje= $request->casa_drenaje;
        $serv->potable= $request->casa_potable;
        $serv->gas= $request->casa_gas;
        $serv->lavadora= $request->casa_lavadora;
        $serv->refrigerador= $request->casa_refrigerador;
        $serv->television= $request->casa_tv;
        $serv->telefono= $request->casa_tel;
        $serv->celular= $request->casa_cel;
        $serv->microondas= $request->casa_micro;
        $serv->radio= $request->casa_radio;
        $serv->dvd= $request->casa_dvd;
        $serv->computadora= $request->casa_computadora;
        $serv->internet= $request->casa_internet;
        $serv->automovil= $request->casa_auto;
        $serv->save();

        $casa= Casa::find($id_casa);
        $casa->estado=$request->estado_casa;
        $casa->material=$request->material;
        $casa->piso=$request->piso;
        $casa->techo=$request->techo;
        $casa->combustible=$request->combustible;
       
        $casa->save();

         return redirect('productores');
        }

        $productor =Productor::find($id);
        $productor->nombre=$request->nombre;
        $productor->apellido_pat=$request->apellido_pat;
        $productor->apellido_mat=$request->apellido_mat;
        $productor->edad=$request->edad;
        $productor->sexo=$request->sexo;
        $productor->ingreso=$request->ingreso;
        $productor->gasto=$request->gasto;
        $productor->escolaridad=$request->escolaridad;
        $productor->seguro=$request->seguro;
        $productor->jefe_familia=$request->jefe;
        $productor->estado_civil=$request->civil;

        $productor->save();
        

        return redirect('productores');
      


       


    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Productor  $productor
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        //
        $productor = Productor::find($id);
        $id_direccion = $productor->id_direccion;
        $id_casa= $productor->id_estatuscasa;
       
        $casa= Casa::find($id_casa);
       
        $id_serv = $casa->id_servequip;
        $id_cra= $casa->id_caractcasa;
        $familias = Familia::where('id_productor',$id)->delete();

        Direccion::destroy($id_direccion);
        ServiciosEquipamiento::destroy($id_serv);
        CaractesticasCasa::destroy($id_cra);
        Casa::destroy($id_casa);
        Productor::destroy($id);

        return redirect('productores');
    }
}
