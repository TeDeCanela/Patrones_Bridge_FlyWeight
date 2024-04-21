
package f1;

/**
 *
 * @author nmh14
 */
public abstract class Equipo {
    private IMotor motor;
    
    public Equipo(IMotor motor)
    {
        this.motor = motor;
    }
    
    public void obtenerVelocidad(int cantidad){
        motor.encenderMotor(cantidad);
        motor.mostrarTipoDeMotor();
        
    }
    public abstract void caracteristicasDeEquipo();
}
