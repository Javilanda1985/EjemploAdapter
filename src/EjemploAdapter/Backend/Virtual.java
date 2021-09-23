package EjemploAdapter.Backend;

public class Virtual {
    private boolean conectado = false;

    public Virtual(){
        System.out.println("1. Creando consulta virtual");
        this.conectado = false;
    }

    public void conectar() {
        System.out.println("2. Conectando con el paciente");
        this.conectado = true;
    }

    public void activar() {
        if (!this.conectado) {
            System.out.println("No se puede realizar consulta virtual porque  el paciente no está conectado.");
        } else {
            System.out.println("3. Está conectado, activando camara.");
        }
    }

    public void realizarConsulta() {
        if (!this.conectado) {
            System.out.println("No se puede realizar consulta virtual porque  el paciente no está conectado");
        } else {
            System.out.println("4. Interrogatorio al paciente y enviar paraclinicos");
        }
    }

    public void guardar() {
        if (!this.conectado) {
            System.out.println("No se puede realizar consulta virtual porque  el paciente no está conectado");
        } else {
            System.out.println("5. Registrar HC y guardar");
        }
    }

    public void desconectar() {
        System.out.println("6. Terminacion de consulta virtual ");
        this.conectado = false;
        System.out.println("");
    }
}
