public class Usuario {
    // Atributos
    private String username;
    private String password;
    private String nombre;
    private String rol;
    private int credito;


    Usuario(String username, String password, String nombre, String rol){
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.rol = rol;
        this.credito = 0;
    }

    public boolean login(String username, String password){
        if(this.username.equals(username)&&this.password.equals(password)){
            return true;
        }
        return false;
    }
}
