package EjemploAdapter.Backend;

public class Urgencia  extends Atencion{
    public Urgencia(){
        super();
        System.out.println(">> Atencion de Urgencias <<");
    }

    @Override
    public void ingresoPaciente() {
        System.out.println("1. Ingresa el paciente a urgencias.");
    }

    @Override
    public void interrogatorio() {
        System.out.println("2. Motivo de urgencia y demas...");
    }

    @Override
    public void salidaPaciente()
    {
        System.out.println("3. Sale el paciente de urgencias");
        System.out.println("");
    }

}
