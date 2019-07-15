package Ing_Soft_2BIM;
public class RegistroVehiculos 
{
    private int placa;
    private String tipo;
    private double precio;
    private String total;
    private double precioTotalDeAlquiler;
    // el constructor sin argumentos llama a otro constructor con valores predeterminados
    public RegistroVehiculos()
    {
        this( 0, "", 0.0); // llama al constructor con argumentos
    } // fin del constructor de RegistroCuenta sin argumentos
    
    // inicializa un registro
    public RegistroVehiculos( int pla, String tip, double pre )
    {
        establecerPlaca( pla );
        establecerTipo( tip );
        establecerPrecio( pre );
        //establecerSaldo( sal );
    } // fin del constructor de RegistroCuenta con cuatro argumentos
    
    // establece el número de cuenta
    public void establecerPlaca( int pla )
    {
        placa = pla;
    } // fin del método establecerCuenta
    // obtiene el número de cuenta
    public int obtenerPlaca()
    {
        return placa;
    } // fin del método obtenerCuenta
    
    // establece el primer nombre
    public void establecerTipo( String tip )
    {
        tipo = tip;
    } // fin del método establecerPrimerNombre
    // obtiene el primer nombre
    public String obtenerTipo()
    {
        return tipo;
    } // fin del método obtenerPrimerNombre

    
   
    // establece el precio
   public void establecerPrecio( double pre )
   { 
       precio = pre;
   }// fin del método establecerSaldo
   //obtiene el precio
   public double obtenerPrecio()
   {
       return precio;
   } // fin del método obtenerPrecio 
   
   // establece el enunciado del resultado final
   public void establecerTotal(String tot)
   {
      total=tot; 
   }//fin del metodo establecerTotal
   //obtiene el enunciado
   public String obtenerTotal()
   {
       return total;
   } // fin del método obtenerTotal
   
   //establece el precio final de alquiler
   public void establecerPrecioTotal(double preToAlqui)
   {
       precioTotalDeAlquiler=preToAlqui;
   }//fin de metodo establecerPrecioTotal
   //obtiene el precio total de alquiler
   public double obtenerPrecioTotal()
   {
       return precioTotalDeAlquiler;
   } // fin del método obtenerPrecio 
    
}
