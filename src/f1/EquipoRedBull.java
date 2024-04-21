
package f1;

/**
 *
 * @author nmh14
 */
public class EquipoRedBull extends Equipo{

    public EquipoRedBull(IMotor motor) {
        super(motor);
    }

    @Override
    public void caracteristicasDeEquipo() {
        System.out.println("Oracle Redbull Racing, integrantes: Checo Perez, Max Verstappen");
    }
    
}
