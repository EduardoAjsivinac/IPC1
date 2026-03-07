
void main() {
    /*Usuario usuario = new Usuario("eduardo","123456", "Eduardo");

    if(usuario.login("eduardo","12345")){
        System.out.println("login correcto");
    }else{
        System.out.println("Login erroneo");
    }*/

    Administrador user = new Administrador("Admin", "123456", "Administrador");
    Operador nuevoOperador = user.registrarOperador("Operador1","Nombre de operador");
    if(nuevoOperador.login("Operador1", "12345")){
        System.out.println("Logueo correcto");
    }
}
