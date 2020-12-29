<?php

namespace App\Http\Controllers;

use App\Cargos;
use App\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Crypt;
class UsersController extends Controller
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
        else{
            
             return redirect('alertas');
        }
        
        });
    }
    
    public function index(Request $request)
    {
        //

       // $users = User::all();
        //return view('users.usuarios',['users'=>$users]);
        $variable = $request->buscar;
        $users = User::where('nombre','LIKE',"%".$variable."%")
                        ->orWhere('apellidos','LIKE',"%".$variable."%")
                        ->orWhere('tipo','LIKE',"%".$variable."%")->take(10)->get();
      
        return view('users.usuarios',['users'=>$users]);

    }
     
    

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        //
        $cargos= Cargos::all();
        return view('users.nuevoUsuario',['cargos'=>$cargos]);
                
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        //
        $user = new User();
        $user->nombre=$request->nombre;
        $user->apellidos=$request->apellidos;
        $user->edad=$request->edad;
        $user->email=$request->correo;
        $user->password=bcrypt($request->password);
        $user->tipo=$request->tipo;
        $user->telefono=$request->telefono;
        $user->id_cargo=$request->cargo;


        $user->save();

        return redirect('usuarios');

    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        //

        $user = User::find($id);
        $cargos= Cargos::all();
        $especific = Cargos::find($user->id_cargo);

        
        
        return view('users.actualizarUsuario',['user'=>$user,'cargos'=>$cargos,
            'especific'=>$especific]);
       
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        //

        $user =User::find($id);
        $user->nombre=$request->nombre;
        $user->apellidos=$request->apellidos;
        $user->edad=$request->edad;
        $user->email=$request->correo;
        $user->password=bcrypt($request->password);
        $user->tipo=$request->tipo;
        $user->telefono=$request->telefono;
        $user->id_cargo=$request->cargo;


        $user->save();
        $users = User::all();
        return redirect('usuarios');

    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        //
        User::destroy($id);
         $users = User::all();
        return view('users.usuarios',['users'=>$users]);

    }
}
