package Ing_Soft_2BIM;
public class Coche extends Vehiculo 
{
  private double precioAlquilerCoche;
  public double obtenerPrecioCoche(int diasDeAlquiler)
  {
      precioAlquilerCoche=(base+1.5)*diasDeAlquiler;
      return precioAlquilerCoche;
  }//fin metodo obtenerPrecioCoche
}//fin class Coche