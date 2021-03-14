package ordenarnumeros;

import javax.swing.JLabel;


public class Ordenar extends Thread {
    
    private int y = 130;
    private int x;
    private int h = 40;
    private int w = 60;
    private JLabel[] lbls = new JLabel[2];

    
    public Ordenar(JLabel[] lbls) {
        this.lbls = lbls; // se inia el arreglo de label
    }

    @Override
    public void run() {

        int x1, x2, y1, xx;
        x1 = x2 = y1 = xx = 0;
        x1 = lbls[0].getX(); // se obtiene la posicion de x del Jlabal
        //y1 = lbls[0].getY();
        x2 = lbls[1].getX();
        //y2 = lbls[1].getY();
       
        try {
          // se comienza la ejecución del hilo
          
          //ciclo  para mover verticalmente 
            for (y1 = 1; y1 <= h; y1++) {
                lbls[0].setLocation(x1, y + y1);
                lbls[1].setLocation(x2, y - y1);
                sleep(10);
            }
            //ciclo para mover los label de forma horizontal 
            for (xx = 1; xx <= (x2 - x1); xx++) {
                lbls[0].setLocation(x1 + xx, y + h);
                lbls[1].setLocation(x2 - xx, y - h);
                sleep(10);
            }
            //ciclo para mover verticalmente y regresar a direccion de los otros labels
            for (y1 = 1; y1 <= h; y1++) {
                lbls[0].setLocation(x1 + xx, y + h - y1);
                lbls[1].setLocation(x2 - xx, y - h + y1);
                sleep(10);
            }
             
        } catch (Exception e) {
            System.out.println("Error  HHHH");
        }
    }


}
