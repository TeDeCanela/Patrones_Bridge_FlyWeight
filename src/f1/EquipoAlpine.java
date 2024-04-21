
package f1;

/**
 *
 * @author nmh14
 */
public class EquipoAlpine extends Equipo {

    public EquipoAlpine(IMotor motor) {
        super(motor);
    }

    @Override
    public void caracteristicasDeEquipo() {
        System.out.println("BWT Alpine F1 Team, integrantes: Estaban Ocon, Pierre Gasly");
    }
    
}

