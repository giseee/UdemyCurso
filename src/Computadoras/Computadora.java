package Computadoras;

public class Computadora{
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;
    private static int contadorComputadoras;

    private Computadora(){
        this.idComputadora= ++Computadora.contadorComputadoras;
    }
    public Computadora( String nombre, Monitor monitor, Mouse mouse, Teclado teclado) {
       this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }
    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora " + idComputadora +
                ", nombre ='" + nombre + '\'' + "monitor=" +
                monitor.getMarca()+
                ", mouse= " + mouse.getMarca() +
                ", teclado= " + teclado.getMarca()
                 ;}
}
