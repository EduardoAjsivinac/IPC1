import javax.swing.*;
import java.awt.*;

private JFrame panelPrincipal;

void main() {
    panelPrincipal = new JFrame("Titulo");
    JPanel pantallaLogueo = new Login().getPanel();
    panelPrincipal.add(pantallaLogueo);
    /*
    JPanel pantallaLogueo = logueo.getPanel() ;

    pantallaLogueo.setPreferredSize(new Dimension(500,130));

    JPanel contenedor = new JPanel(new GridBagLayout());
    contenedor.add(pantallaLogueo);

    this.panelPrincipal = new JFrame();

    this.panelPrincipal.setContentPane(contenedor);
    this.panelPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.panelPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    */
    this.panelPrincipal.setVisible(true);


}



public int Potencia(int base, int exponente){
    if(exponente == 0){
        return 1;
    }
    int resultadoParcial= base * Potencia(base, exponente -1);
    return resultadoParcial;
}

public int Potencia2(int base, int exponente, int resultado){
    if(exponente == 0){
        return resultado * 1;
    }
    resultado = base * resultado;
    return Potencia2(base, exponente, resultado);
}

