package EjemploAdapter.Frontend;

import EjemploAdapter.Backend.Atencion;
import EjemploAdapter.Backend.Consulta;
import EjemploAdapter.Backend.Urgencia;
import EjemploAdapter.Backend.VirtualAdapter;

import java.util.Scanner;

public class Menu {
    private static Scanner n = new Scanner(System.in);
    private static Atencion atencion;

    public static void main(String[] args){
        System.out.println("");

        /*Atencion paciente1 = new Consulta();
        paciente1.ingresoPaciente();
        paciente1.interrogatorio();
        paciente1.salidaPaciente();

        Atencion paciente2 = new Urgencia();
        paciente2.ingresoPaciente();
        paciente2.interrogatorio();
        paciente2.salidaPaciente();

        Atencion paciente3 = new VirtualAdapter();
        paciente3.ingresoPaciente();
        paciente3.interrogatorio();
        paciente3.salidaPaciente();

        System.out.println("FIN");*/

        int opcion;
        do{
        opcion = preguntarOpcion();
        switch(opcion) {
            case 1:
                atencion = new Consulta();
                usarAtencion();
                break;
            case 2:
                atencion = new Urgencia();
                usarAtencion();
                break;
            case 3:
                atencion = new VirtualAdapter();
                usarAtencion();
                break;
            case 4:
                System.out.println("¡Cerrando programa!");
                break;
            default:
                System.out.println("La opción ingresada NO es válida.");
        }
        System.out.print("\n\n");
    }while(opcion!=4);
}

    private static int preguntarOpcion() {
        System.out.print(
                "HOSPITAL PUBLICO MUNICIPAL\n"+
                        "\n"+
                "    MENÚ DE OPCIONES\n"
                        +"----------------------\n"
                        +"1. Consulta prioritaria\n"
                        +"2. Consulta por urgencias\n"
                        +"3. Consulta virtual\n"
                        +"4. Salir.\n"
                        +"\n"
                        +"Seleccione opción: "
        );
        return Integer.parseInt(n.nextLine());
    }

    private static void usarAtencion() {
        atencion.ingresoPaciente();
        atencion.interrogatorio();
        atencion.salidaPaciente();
    }
}

