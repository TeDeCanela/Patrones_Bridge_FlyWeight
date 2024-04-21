
package f1;

/**
 *
 * @author nmh14
 */
public class Honda implements IMotor{

    @Override
    public void encenderMotor(int velocidad) {
        System.out.println("Velocidad="+ velocidad);
    }

    @Override
    public void mostrarTipoDeMotor() {
        tipoDeMotor();
    }
    
    public void tipoDeMotor() {
        System.out.println("RBPEH002");
    }

}
    

