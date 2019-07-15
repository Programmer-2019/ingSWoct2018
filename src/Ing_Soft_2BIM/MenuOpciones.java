package Ing_Soft_2BIM;
import java.util.Scanner;

 public class MenuOpciones 
 {
     //objeto que genera el listado de vehiculos
     ListadoVehiculos listado=new ListadoVehiculos();
     GenerarCsv aplicacion = new GenerarCsv();
     
     //RegistroVehiculos registro=new RegistroVehiculos();
     Vehiculo vehiculo=new Vehiculo();
     Coche coche=new Coche();
     Microbus microbus=new Microbus();
     Furgoneta furgoneta=new Furgoneta();
     Camion camion=new Camion();
     Scanner entrada = new Scanner( System.in );
     int opcionMenu,opcionMenuAlquiler,opcionMenuCotizacion,escogePlaca,numeroDeVehiculos,dias,encontrado;
     double precioTotalCoche,precioTotalDeAlquiler, precioTotalMicrobus, precioTotalFurgoneta, precioTotalCamion;
     String tipo,total;
     //apertura de archivo cvs
     
   
    //inicio metodo desplegarMenu
    public void desplegarMenu()
    {
      System.out.println("*************BIENVENIDO A RENTA-CAR****************");
      System.out.println("OPERACIONES:");
      System.out.println("1. ALQUILER DE VEHICULO.");
      System.out.println("2. SALIR");
      System.out.print("¿ESCOJA LA OPCION: ");
      opcionMenu=entrada.nextInt();
      switch(opcionMenu)
      {
          case 1:listado.generarListado();
                 desplegaMenuAlquiler();
                 break;     
          case 2:System.out.println("!!GRACIAS POR UTILIZAR LOS SERVICIOS DE RENTA-CAR!!");
                 System.out.println("FUE UN GUSTO SERVIRTE, QUE TENGAS UN BUEN DIA.");
                 break;
          default:System.out.println("OPCION INCORRECTA");
                  desplegarMenu();
                  break;      
      }//fin de switch
    }//fin metodo desplegarMenu
    
    //inicio metodo desplegaMenuAlquiler
    private void desplegaMenuAlquiler() 
    {
      aplicacion.abrirArchivo();
      System.out.println("¿DESEA ALQUILAR ALGUN VEHICULO DE LA LISTA?");
      System.out.println("1. SI");
      System.out.println("2. NO");
      System.out.print("¿ESCOJA LA OPCION: ");
      opcionMenuAlquiler=entrada.nextInt();
      switch(opcionMenuAlquiler)
      {
          case 1:System.out.print("INGRESE LA CANTIDAD DE VEHICULOS QUE DESEA ALQUILAR: ");
                 numeroDeVehiculos=entrada.nextInt();
                 //estructura for para controlar el numero de coches ingresado por el usuario
                 for(int i=0;i<numeroDeVehiculos;i++)
                 {
                     System.out.printf("INGRESE EL NUMERO DE PLACA DEL %d VEHICULO: ",i+1);
                     escogePlaca=entrada.nextInt();
                     System.out.print("INGRESE EL NUMERO DE DIAS DE ALQUILER QUE DESEA: ");
                     dias=entrada.nextInt();
                     encontrado=listado.buscarVehiculo(escogePlaca);
                     if(encontrado>=0)
                     {
                         if(escogePlaca<=250)
                         {
                             tipo="COCHE";
                             //Establece precio del coche dependiendo los dias de alquiler
                             precioTotalCoche=coche.obtenerPrecioCoche(dias);
                             // Establece la suma total por los vehiculos alquilados
                             vehiculo.establecerPrecioTotalDeVehiculo(precioTotalCoche);
                             aplicacion.ingresoDatos(tipo,escogePlaca, precioTotalCoche);
                         }else 
                             if(escogePlaca>250 && escogePlaca<=500)
                             {
                                 tipo="MICROBUS";
                                 //Establece precio del microbus dependiendo los dias de alquiler
                                 precioTotalMicrobus=microbus.obtenerPrecioMicrobus(dias);
                                 // Establece la suma total por los vehiculos alquilados
                                 vehiculo.establecerPrecioTotalDeVehiculo(precioTotalMicrobus);
                                 aplicacion.ingresoDatos(tipo,escogePlaca, precioTotalMicrobus);
                             }else
                                 if(escogePlaca>500 && escogePlaca<=750)
                                 {
                                     tipo="FURGONETA";
                                     //Establece precio de la furgoneta dependiendo los dias de alquiler
                                     precioTotalFurgoneta=furgoneta.obtenerPrecioFurgoneta(dias);
                                     // Establece la suma total por los vehiculos alquilados
                                     vehiculo.establecerPrecioTotalDeVehiculo(precioTotalFurgoneta);
                                     aplicacion.ingresoDatos(tipo,escogePlaca, precioTotalFurgoneta);
                                 }else
                                     if(escogePlaca>750 && escogePlaca<=1000)
                                     {
                                         tipo="CAMION";
                                         //Establece precio del camion dependiendo los dias de alquiler
                                         precioTotalCamion=camion.obtenerPrecioCamion(dias);
                                         // Establece la suma total por los vehiculos alquilados
                                         vehiculo.establecerPrecioTotalDeVehiculo(precioTotalCamion);
                                         aplicacion.ingresoDatos(tipo,escogePlaca, precioTotalCamion);
                                     }
                     }else
                     {
                         System.out.printf("LA PLACA %d INGRESADA ES INCORRECTA\n",escogePlaca);
                         System.out.println("POR FAVOR DIGITE BIEN LA PLACA DEL VEHICULO QUE DESEA ALQUILAR");
                         desplegaMenuAlquiler();
                     }
                 //obtiene la sumatoria total del alquiler de los vehiculos    
                 precioTotalDeAlquiler=precioTotalDeAlquiler + vehiculo.obtenerPrecioTotalDeVehiculo();
                 
                 }//fin de for
                 total="COSTO TOTAL DE ALQUILER";
                 aplicacion.ingresoSumaTotal(total,precioTotalDeAlquiler);
                 aplicacion.cerrarArchivo();
                 System.out.printf("EL PRECIO TOTAL POR ALQUILER DE LOS VEHICULOS ES DE: $%f\n",precioTotalDeAlquiler);
                 System.out.println();
                 System.out.println();
                 break;       
          case 2:desplegarMenu();
                 break;
          default:System.out.println("OPCION INCORRECTA");
                  break;      
      }//fin de switch 
      desplegarMenu(); 
    }//fin metodo desplegaMenuAlquiler    
}//fin de class MenuOpciones
