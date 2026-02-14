//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
void main() {

    // Menu
    IO.println("Ingrese el tamano del tablero");
    IO.println("G - Grande");
    IO.println("P - Pequeno");
    Scanner sc = new Scanner(System.in);
    String tab = sc.nextLine();
    int columnas = 0;
    int filas = 0;
    if (tab.equals("P")){
        columnas = 6;
        filas = 5;
    }else if(tab.equals("G")){
        columnas = 10;
        filas = 10;
    }else{
        IO.println("Valor incorrecto");
        return;
    }
    int premios = (int)(Math.random()*(columnas*filas*0.4));
    int paredes = (int)(Math.random()*(columnas*filas*0.2));
    int fantasmas = (int)(Math.random()*(columnas*filas*0.2));
    char[][] tablero = new char[columnas][filas];
    for(int i=0; i<columnas; i++){
        for(int j=0; j<filas; j++){
            tablero[i][j]=' ';
        }
    }
    IO.println(premios);
    IO.println(paredes);
    IO.println(fantasmas);
    int posicionX = -1;
    int posicionY = -1;
    double tipo = 0.0;
    char caracter = '0';
    // Colocar premios
    while (premios > 0){
        posicionX = (int)(Math.random()*(columnas));
        posicionY = (int)(Math.random()*(filas));
        if (tablero[posicionX][posicionY]==' ') {
            tipo = Math.random();
            if (tipo > 0.85) {
                caracter = '$';
            } else {
                caracter = '0';
            }
            tablero[posicionX][posicionY] = caracter;
            premios--;
        }
    }
    // Colocar paredes
    while (paredes > 0){
        posicionX = (int)(Math.random()*(columnas));
        posicionY = (int)(Math.random()*(filas));
        if (tablero[posicionX][posicionY]==' ') {
            tipo = Math.random();
            tablero[posicionX][posicionY] = 'X';
            paredes--;
        }
    }

    // Colocar fantasmas
    while (fantasmas > 0){
        posicionX = (int)(Math.random()*(columnas));
        posicionY = (int)(Math.random()*(filas));
        if (tablero[posicionX][posicionY]==' ') {
            tipo = Math.random();
            tablero[posicionX][posicionY] = '@';
            fantasmas--;
        }
    }

    IO.println("Ingrese las coordenadas de PacMan");
    IO.print("Columna");
    String PacManXS = sc.nextLine();
    IO.print("Fila");
    String PacManYS = sc.nextLine();
    int pacManXI = Integer.parseInt(PacManXS);
    int pacManYI = Integer.parseInt(PacManYS);

    while (true){
        tablero[pacManXI][pacManYI]='<';
        for(int i=0; i<columnas+2; i++){
            IO.print("_");
        }
        IO.println("");
        for(int i=0; i<columnas; i++){
            IO.print("|");
            for(int j=0; j<filas; j++){
                IO.print(tablero[i][j]);
            }
            IO.println("|");
        }
        for(int i=0; i<columnas+2; i++){
            IO.print("_");
        }
        IO.println("");
        String lectura = sc.next();
        tablero[pacManXI][pacManYI]=' ';
        if(lectura.equals("8")){// Arriba
            pacManXI = pacManXI -1;
        }else if(lectura.equals("5")){ // Abajo
            pacManXI = pacManXI +1;
        }else if(lectura.equals("6")){ // Derecha
            pacManYI = pacManYI +1;
        }else if(lectura.equals("4")){ // Izquierda
            pacManYI = pacManYI -1;
        }

        if(pacManYI == -1){
            pacManYI = filas -1;
        }else if(pacManYI == filas){
            pacManYI = 0;
        }else if(pacManXI == -1){
            pacManXI = columnas -1;
        }else if(pacManXI == columnas){
            pacManXI = 0;
        }
    }


}
