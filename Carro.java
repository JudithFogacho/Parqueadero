/**
 * Esta clase representa un carro dentro del parqueadero.
 */
public class Carro {
// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Placa del carro.
     */
    private String placa;

    /**
     * Hora de llegada del carro al parqueadero: valor entre 6 y 20.
     */
    private int horaLlegada;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un carro con la informaci�n b�sica.
     * @param pPlaca Placa del carro. pPlaca != null.
     * @param pHora Hora de ingreso.
     */
    public Carro( String pPlaca, int pHora )
    {
        placa = pPlaca;
        horaLlegada = pHora;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna la placa del carro.
     * @return La placa del carro.
     */
    public String darPlaca( )
    {
        return placa;
    }

    /**
     * Retorna la hora de llegada del carro.
     * @return La hora en la que lleg� el carro al parqueadero.
     */
    public int darHoraLlegada( )
    {
        return horaLlegada;
    }

    /**
     * Indica si la placa del carro es igual a la recibida por par�metro.
     * @param pPlaca Placa contra la que se est� comparando. pPlaca != null.
     * @return Retorna true si las placas son iguales, false en caso contrario.
     */
    public boolean tienePlaca( String pPlaca )
    {
        boolean tienePlaca = false;
        if( placa.equalsIgnoreCase( pPlaca ) )
        {
            tienePlaca = true;
        }
        else
        {
            tienePlaca = false;
        }
        return tienePlaca;
    }

    /**
     * Calcula el n�mero de horas que debe pagar el carro seg�n el tiempo que lleva el auto en el parqueadero.
     * @param pHoraSalida Hora a la que el carro sale del parqueadero. pHoraSalida >= horaLlegada.
     * @return Tiempo que ha estado en parqueadero.
     */
    public int darTiempoEnParqueadero( int pHoraSalida )
    {
        int tiempoParqueadero = pHoraSalida - horaLlegada + 1;
        return tiempoParqueadero;
    }
}
