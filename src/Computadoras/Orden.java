package Computadoras;

public class Orden {
    private final int idOrden;
    private static int contadorComputadoras;
    private static int contadorOrden;
    private static final int maxComputadoras = 10;
    private Computadora computadoras[];
    public Orden() {
        this.idOrden= ++Orden.contadorOrden;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }
    public void addComputer(Computadora computadora) {
        if(this.contadorComputadoras < Orden.maxComputadoras){
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else{
            System.out.println("Has superado el limite: " + Orden.maxComputadoras);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadoras de la Orden #:"+ this.idOrden);
        for (int i = 0; i < this.contadorComputadoras ; i++){
            System.out.println(this.computadoras[i]);
        }

    }

}
