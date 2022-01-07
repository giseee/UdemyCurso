package Computadoras;

public class Mouse extends DispositivoEntrada {
    private final int idMouse;
    private static int contadorRatones;

    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idMouse = ++contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "Mouse{" +
                "idMouse=" + idMouse +
                ", contadorRatones=" + contadorRatones +
                '}';
    }
}
