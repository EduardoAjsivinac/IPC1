import java.io.*;

public class Utilidades {

    public static boolean CrearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            archivo.createNewFile();
        }catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    public static boolean EscribirArchivo(String nombre){
        try(FileWriter escritor = new FileWriter(nombre, true)) {
            escritor.write("Hola Mundo2\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static void LeerArchivo(String archivo){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
