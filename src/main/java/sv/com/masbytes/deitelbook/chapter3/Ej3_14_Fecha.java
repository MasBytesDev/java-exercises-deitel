package sv.com.masbytes.deitelbook.chapter3;

/**
 * Clase que representa una fecha, con validaciones para valores de día, mes y año. Incluye métodos para establecer y obtener los valores de cada campo, así como para mostrar la fecha en formato "dd/MM/yyyy".
 */
public class Ej3_14_Fecha {

    private int dia;
    private int mes;
    private int anho;

    /**
     * Constructor con parámetros que inicializa la fecha después de validarla.
     *
     * @param dia El día del mes (1-31, dependiendo del mes y el año).
     * @param mes El mes del año (1-12).
     * @param anho El año (1900-2024).
     */
    public Ej3_14_Fecha(int dia, int mes, int anho) {
        if (esFechaValida(dia, mes, anho)) {
            this.dia = dia;
            this.mes = mes;
            this.anho = anho;
        } else {
            throw new IllegalArgumentException("Fecha inválida: " + dia + "/" + mes + "/" + anho);
        }
    }

    /**
     * Constructor sin argumentos que inicializa la fecha con valores predeterminados.
     */
    public Ej3_14_Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anho = 1900;
    }

    /**
     * Valida si una fecha es válida teniendo en cuenta el mes, el año y los días.
     *
     * @param dia El día del mes.
     * @param mes El mes del año.
     * @param anho El año.
     * @return true si la fecha es válida, false en caso contrario.
     */
    public boolean esFechaValida(int dia, int mes, int anho) {
        if (mes < 1 || mes > 12 || anho < 1900 || anho > 2024) {
            return false;
        }

        int diasEnMes = obtenerDiasEnMes(mes, anho);
        return dia >= 1 && dia <= diasEnMes;
    }

    /**
     * Obtiene la cantidad de días que tiene un mes, considerando años bisiestos.
     *
     * @param mes El mes del año.
     * @param anho El año.
     * @return El número de días en el mes.
     */
    private int obtenerDiasEnMes(int mes, int anho) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return esBisiesto(anho) ? 29 : 28;
            default:
                return 31;
        }
    }

    /**
     * Determina si un año es bisiesto.
     *
     * @param anho El año a verificar.
     * @return true si el año es bisiesto, false en caso contrario.
     */
    private boolean esBisiesto(int anho) {
        return (anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0);
    }

    // Métodos getter y setter
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (esFechaValida(dia, this.mes, this.anho)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Día inválido: " + dia);
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (esFechaValida(this.dia, mes, this.anho)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mes inválido: " + mes);
        }
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        if (esFechaValida(this.dia, this.mes, anho)) {
            this.anho = anho;
        } else {
            throw new IllegalArgumentException("Año inválido: " + anho);
        }
    }

    /**
     * Devuelve una representación en cadena de la fecha en formato "dd/MM/yyyy".
     *
     * @return La fecha como cadena.
     */
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, anho);
    }
}
