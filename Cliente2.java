package caso.de.estudio;

import java.util.Random;
import javax.swing.JOptionPane;
public class Cliente {
    private String nombre;
    private int cedula;
    private int nfactura;
    private int mfactura;
    private String mefactura;
    private int ano;
    private int estado;
    public void setnombre() {
        nombre = JOptionPane.showInputDialog("nombre");
    }
    public String getnombre() {
        return nombre;
    }
    public void setCedula() {
        String leer = JOptionPane.showInputDialog("cedula");
        cedula = Integer.parseInt(leer);
    }
    public int getCedula() {
        return cedula;
    }
    public void generarnfactura() {
        Random random = new Random();
        nfactura = random.nextInt(1000000);
    }
    public int getNumeroFactura() {
        return nfactura;
    }
    public void setmofactura() {
        String leer = JOptionPane.showInputDialog("monto factura");
        mfactura = Integer.parseInt(leer);
    }
    public int getmofactura() {
        return mfactura;
    }
    public void setmfactura() {
        mefactura = JOptionPane.showInputDialog("mes");
    }
    public String getmfactura() {
        return mefactura;
    }
    public void setano() {
        String leer = JOptionPane.showInputDialog("año");
        ano = Integer.parseInt(leer);
    }
    public int getano() {
        return ano;
    }
    public void setestado() {
        String leer = JOptionPane.showInputDialog("factura1 Pendiente2 Cancelada");
        estado = Integer.parseInt(leer);
    }
    public int getestado() {
        return estado;
    }
}