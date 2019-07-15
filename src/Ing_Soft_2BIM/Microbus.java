package Ing_Soft_2BIM;
public class Microbus extends Vehiculo 
{
    private double precioAlquilerMicrobus=0;
    public double obtenerPrecioMicrobus(int diasDeAlquiler)
    {
        precioAlquilerMicrobus=((base+1.50)*diasDeAlquiler)+2;
        return precioAlquilerMicrobus;
    }//fin metodo obtenerPrecioCoche   
}
