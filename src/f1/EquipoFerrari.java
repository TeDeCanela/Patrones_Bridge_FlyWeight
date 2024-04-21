
package f1;

/**
 *
 * @author nmh14
 */
 public class EquipoFerrari extends Equipo{

    public EquipoFerrari(IMotor motor) {
        super(motor);
    }

    @Override
    public void caracteristicasDeEquipo() {
        System.out.println("Scuderia Ferrari, integrantes: Charles Leclerc, Carlos Sainz");
    }
    
}
