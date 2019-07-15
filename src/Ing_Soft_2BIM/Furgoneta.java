package Ing_Soft_2BIM;
public class Furgoneta extends Vehiculo
{
   private final int pma=2;
   private double precioAlquilerFurgoneta=0;
   public double obtenerPrecioFurgoneta(int diasDeAlquiler)
  {
      precioAlquilerFurgoneta=(base*diasDeAlquiler)+(20*pma);
      return precioAlquilerFurgoneta;
  }//fin metodo obtenerPrecioCoche 
}
