package Computadoras;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado =++contadorTeclado;
    }

    @Override
    public String toString() {
        return super.toString() +"Teclado{" +
                "idTeclado=" + idTeclado +
                ", contadorTeclado=" + contadorTeclado +
                '}';
    }
}
