
package f1;

/**
 *
 * @author nmh14
 */
public class EquipoMercedes extends Equipo{

    public EquipoMercedes(IMotor motor) {
        super(motor);
    }

    @Override
    public void caracteristicasDeEquipo() {
        System.out.println("Mercedes AMG PETRONAS Formula One Team, Integrantes: Lewis Hamilton y George Russell");
    }
    
}
