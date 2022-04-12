import AlmacenVerdura.Lacteo;

import java.util.Scanner;

public class MainTest
{
    private static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Lacteo lacteo;

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

        }
    }
}
