package Ing_Soft_2BIM;
import java.io.FileNotFoundException;
import java.util.Formatter;
class GenerarCsv 
{
    RegistroVehiculos registro=new RegistroVehiculos();
    private Formatter salida;
    //Creacion del Archivo.
    public void abrirArchivo()
    {
        try
        {
            salida = new Formatter( "DatosSalida.csv" );
            salida.format("COTIZACION DETALLADA DE LOS VEHICULOS SOLICITADOS\n\n");
            salida.format("    TIPO                                  PLACA                              PRECIO\n");
        } // fin de try
        catch ( SecurityException securityException )
        {
            System.err.println("NO TIENE ACCESO DE ESCRITURA A ESTE ARCHIVO." );
            System.exit( 1 );
        } // fin de catch
        catch ( FileNotFoundException filesNotFoundException )
        {
            System.err.println( "ERROR AL CREAR EL ARCHIVO." );
            System.exit( 1 );
        } // fin de catch
    } // fin del método abrirArchivo
    
    
    // Permite al usuario el ingreso de datos al archivo CSV
    public void ingresoDatos(String ti, int pla, double pre) 
    {
        
        int placa=pla;
        double precio=pre;
        String tipo=ti;
        //clasifica de los vehiculos
        if(placa<=250)
        {
            //tipo="COCHE";
            registro.establecerPlaca(placa);
            registro.establecerTipo(tipo);
            registro.establecerPrecio(precio);
            if(registro.obtenerPrecio()>0)
            {
                salida.format("%s                                AAA-%d                           $%.2f\n",registro.obtenerTipo(),registro.obtenerPlaca(), registro.obtenerPrecio());
            }//fin de if
         }else    
            if(placa>250 && placa<=500)
            {
                //tipo="MICROBUS";
                registro.establecerPlaca(placa);
                registro.establecerTipo(tipo);
                registro.establecerPrecio(precio);
                if(registro.obtenerPrecio()>0)
                {
                    salida.format("%s                        AAA-%d                           $%.2f\n",registro.obtenerTipo(),registro.obtenerPlaca(), registro.obtenerPrecio());
                }//fin de if
            }else 
                if(placa>500 && placa<=750)
                {
                    //tipo="FURGONETA";
                    registro.establecerPlaca(placa);
                    registro.establecerTipo(tipo);
                    registro.establecerPrecio(precio);
                    if(registro.obtenerPrecio()>0)
                    {
                        salida.format("%s                     AAA-%d                           $%.2f\n",registro.obtenerTipo(),registro.obtenerPlaca(), registro.obtenerPrecio());
                    }//fin de if
                }else
                    if(placa>750 && placa<=1000)
                    {
                       // tipo="CAMION";
                        registro.establecerPlaca(placa);
                        registro.establecerTipo(tipo);
                        registro.establecerPrecio(precio);
                        if(registro.obtenerPrecio()>0)
                        {
                            salida.format("%s                             AAA-%d                           $%.2f\n",registro.obtenerTipo(),registro.obtenerPlaca(), registro.obtenerPrecio());
                        }//fin de if 
                    }//fin de if       
    }// fin del metodo ingresoDatos
    
    public void ingresoSumaTotal(String tot, double preToAlqui) 
    {
        double precioTotalDeAlquiler=preToAlqui;
        String total=tot;
        registro.establecerTotal(total);
        registro.establecerPrecioTotal(precioTotalDeAlquiler);
        salida.format("\n%s                                  $%.2f\n",registro.obtenerTotal(),registro.obtenerPrecioTotal());
    }

  
    
    //permite al usuario cerrar el archivo
    public void cerrarArchivo()
    {
        if ( salida != null )
            salida.close();
    } // fin del método cerrarArchivo

   
}//fin class GenerarCsv 

