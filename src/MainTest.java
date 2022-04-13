import AlmacenVerdura.Lacteo;
import AlmacenVerdura.Producto;

import java.util.List;
import java.util.Scanner;

public class MainTest
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Lacteo lacteo;

        String arr [] = {};
        arr = new String[8];

        for (int i =0; i<2; i++)
        {
            lacteo = new Lacteo();
            System.out.println("Ingrese el NOMBRE del LACTEO: ");
            lacteo.setNombre(scanner.nextLine());
            System.out.println("Ingrese el PRECIO del LACTEO: ");
            lacteo.setPrecio(scanner.nextDouble());
            System.out.println("Ingrese la CANTIDAD de LACTEOS: ");
            lacteo.setCantidad(scanner.nextInt());
            System.out.println("Ingrese la cantidad de PROTEINAS del LACTEO: ");
            lacteo.setProteinas(scanner.nextInt());

            System.out.println();
            scanner.nextLine();

            arr [i]=  lacteo.getNombre() + ", " + lacteo.getPrecio() + ", " + lacteo.getCantidad() + ", " + lacteo.getProteinas();

        }

        System.out.println(String.valueOf(arr));


    }
}
