package Ing_Soft_2BIM;
public class Vehiculo 
{
    public int base=50;
    public double precioTotalDeVehiculo;
    
    public void establecerPrecioTotalDeVehiculo(double precioTotal) 
    {
        precioTotalDeVehiculo=precioTotal;
    }
   
    public double obtenerPrecioTotalDeVehiculo() 
    {
        return precioTotalDeVehiculo;
    }
    
    
}
