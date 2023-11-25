/**
 * Esta clase representa un puesto en el parqueadero.
 */
public class Puesto {
// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Eventual carro en el puesto. Si no hay ninguno, carro == null.
     */
    private Carro carro;

    /**
     * N�mero del puesto dentro del parqueadero.
     */
    private int numeroPuesto;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un puesto vac�o. <br>
     * <b>post: </b> Se cre� un puesto vac�o.
     * @param pPuesto N�mero de puesto.
     */
    public Puesto( int pPuesto )
    {
        carro = null;
        numeroPuesto = pPuesto;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el carro del puesto. Si no hay ning�n carro retorna null.
     * @return El carro que ocupa el puesto.
     */
    public Carro darCarro( )
    {
        return carro;
    }

    /**
     * Indica si el puesto est� ocupado.
     * @return Retorna true si el puesto est� ocupado. Retorna false en caso contrario.
     */
    public boolean estaOcupado( )
    {
        boolean ocupado = carro != null;
        return ocupado;
    }

    /**
     * Parquea un carro en el puesto. <br>
     * <b>pre: </b> El puesto est� vac�o. <br>
     * <b>post: </b> El puesto ahora est� ocupado por el carro pCarro.
     * @param pCarro Carro que se est� parqueando. pCarro != null.
     */
    public void parquearCarro( Carro pCarro )
    {
        carro = pCarro;
    }

    /**
     * Saca el carro del puesto. <br>
     * <b>post: </b> El puesto est� vac�o.
     */
    public void sacarCarro( )
    {
        carro = null;
    }

    /**
     * Retorna el n�mero del puesto.
     * @return El n�mero asignado al puesto.
     */
    public int darNumeroPuesto( )
    {
        return numeroPuesto;
    }

    /**
     * Indica si el carro tiene la placa recibida.
     * @param pPlaca Placa del carro que ocupa el puesto.
     * @return Retorna true si tiene la placa, false en caso contrario.
     */
    public boolean tieneCarroConPlaca( String pPlaca )
    {
        boolean tieneCarro = true;

        if( carro == null )
        {
            tieneCarro = false;
        }
        else if( carro.tienePlaca( pPlaca ) )
        {
            tieneCarro = true;
        }
        else
        {
            tieneCarro = false;
        }

        return tieneCarro;
    }

}
