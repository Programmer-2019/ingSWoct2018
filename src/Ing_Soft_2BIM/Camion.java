package Ing_Soft_2BIM;
public class Camion extends Vehiculo 
{
    private double precioAlquilerCamion=0;
    public double obtenerPrecioCamion(int diasDeAlquiler)
  {
      precioAlquilerCamion=(base*diasDeAlquiler)+40;
      return precioAlquilerCamion;
  }//fin metodo obtenerPrecioCoche
    
}
