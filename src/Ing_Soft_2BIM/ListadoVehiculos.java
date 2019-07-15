package Ing_Soft_2BIM;
import java.util.Arrays;
import java.util.Random;

public class ListadoVehiculos 
{
    final int N=50;//tamaño del arreglo.
    Random numeroAleatorio=new Random();
    int placas[]=new int[N]; 
    
    //metodo generarListado
    public void generarListado() 
    {
        System.out.println("LISTADO DE VEHICULOS DISPONIBLES PARA ALQUILER");
        System.out.println("      TIPO                       PLACA");
        //Generacion de vehiculos de alquiler
        for(int i=0;i<30;i++)
        {
           placas[i]=100+numeroAleatorio.nextInt(1000);
           //clasificacion de vehiculo coche
           if (placas[i]<=250)
           {
               String tipo="COCHE";
               System.out.printf("      %s                       %d\n",tipo, placas[i]);
           }//fin de if (fin de clasificacion de vehiculo coche)
           
           //clasificacion de vehiculo microbus
           if (placas[i]>250&&placas[i]<=500)
           {
               String tipo="MICROBUS";
               System.out.printf("      %s                    %d\n",tipo, placas[i]);
           }//fin de if (fin de clasificacion de vehiculo microbus)
           
           //clasificacion de vehiculo furgoneta
           if (placas[i]>500&&placas[i]<=750)
           {
               String tipo="FURGONETA";
               System.out.printf("      %s                   %d\n",tipo, placas[i]);
           }//fin de if (fin de clasificacion de vehiculo microbus)
           
           //clasificacion de vehiculo camion
           if (placas[i]>750&&placas[i]<=1000)
           {
               String tipo="CAMION";
               System.out.printf("      %s                      %d\n",tipo, placas[i]);
           }//fin de if (fin de clasificacion de vehiculo camion) 
        }//fin de for (fin de generacion de vehiculos de alquiler)
    }//fin de metodo generarListado

    public int buscarVehiculo(int escogePlaca) 
    {
         Arrays.sort(placas);
         return Arrays.binarySearch(placas, escogePlaca);
    }
    
    
    
    
}//fin de class ListadoVehiculos
