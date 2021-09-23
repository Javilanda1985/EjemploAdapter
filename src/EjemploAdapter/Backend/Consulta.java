package EjemploAdapter.Backend;

public class Consulta extends Atencion{
    public Consulta(){
        super();
        System.out.println(">> Atencion de Consulta Prioritaria <<");
    }

    @Override
    public void ingresoPaciente() {
        System.out.println("1. Ingresa el paciente a la consulta medica.");
    }

    @Override
    public void interrogatorio() {
        System.out.println("2. Motivo de consulta y demas...");
    }

    @Override
    public void salidaPaciente()
    {
        System.out.println("3. Sale el paciente de la consulta medica.");
        System.out.println("");
    }
}