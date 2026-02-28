public class Personaje {
    private String name;
    private String salud;
    private int latitud;
    private int longitud;

    Personaje(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }
}
