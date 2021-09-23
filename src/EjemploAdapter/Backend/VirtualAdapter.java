package EjemploAdapter.Backend;

public class VirtualAdapter extends Atencion{
    private Virtual virtual;

    public VirtualAdapter(){
        super();
        System.out.println("Creando Consulta virtual --adapter...");
        this.virtual = new Virtual();
    }
    @Override
    public void ingresoPaciente() {
        System.out.println("Conectando con el paciente --adapter.");
        this.virtual.conectar();
        this.virtual.activar();
    }

    @Override
    public void interrogatorio() {
        System.out.println("Interrogatorio al paciente --adapter.");
        this.virtual.realizarConsulta();
        this.virtual.guardar();
    }

    @Override
    public void salidaPaciente() {
        System.out.println("Terminacion de consulta virtual --adapter.");
        this.virtual.desconectar();
    }
    }

