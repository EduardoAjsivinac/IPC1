public class Administrador extends Usuario{

    Administrador(String username, String password, String nombre) {
        super(username, password, nombre, "Administrador");
    }

    public Operador registrarOperador(String username, String nombre){
        // Generar la contraseña
        // N cantidad de validaciones
        Operador nuevoOperador = new Operador(username,"12345",nombre);
        return nuevoOperador;
    }
}
