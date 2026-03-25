//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int [] numeros1 = {9,2,3,4,0,6,7,8};
    int [] numeros2 = {9,2,3,4,75,6,7,8,25,34,1,23,4,5,64,3,23,56,78,90,87,12,23,32,21};

    Tarea nuevaTarea1 = new Tarea(numeros1, 8, "Tarea 1",2, 1000);
    Thread trabajador1 = new Thread(nuevaTarea1);
    Tarea nuevaTarea2 = new Tarea(numeros2, 25, "Tarea 2",1, 1);
    Thread trabajador2 = new Thread(nuevaTarea2);

    trabajador1.start();
    trabajador2.start();


}


class Tarea implements Runnable{
    int [] numeros;
    int tam;
    String nombre;
    int metodo;
    int retardo;

    Tarea(int [] numeros, int tam, String nombre, int metodo, int retardo){
        this.numeros = numeros;
        this.tam = tam;
        this.nombre = nombre;
        this.metodo = metodo;
        this.retardo = retardo;
    }

    public void run(){
        System.out.print("Estamos ejecutando un hilo: ");
        System.out.println(this.nombre);
        if(this.metodo == 1){
            this.bubbleSortRecursivo(0,0);
        }else{
            this.bubbleSortIterativo();
        }

        for (int i = 0; i<this.tam; i++){
            System.out.println(this.numeros[i]);
        }
    }

    private void bubbleSortRecursivo(int i, int j){
        try {
            Thread.sleep(retardo);
            if(i < this.tam){
                if(j< this.tam-1){
                    if(this.numeros[j]>this.numeros[j+1]){
                        int aux = this.numeros[j];
                        this.numeros[j]= this.numeros[j+1];
                        this.numeros[j+1] = aux;
                    }
                    bubbleSortRecursivo(i, j+1);
                }else{
                    bubbleSortRecursivo(i+1, 0);
                }
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    private void bubbleSortIterativo(){
        for (int i=1; i<this.tam; i++){
            try {
                Thread.sleep(this.retardo);
                for(int j=0; j<this.tam-1; j++){
                    if(this.numeros[j]>this.numeros[j+1]){
                        int aux = this.numeros[j];
                        this.numeros[j] = this.numeros[j+1];
                        this.numeros[j+1] = aux;
                    }
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
    }

}