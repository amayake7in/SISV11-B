
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class KevinAmaya_JuanCastro {

    public static void main(String[] args) {
        
       double no=0;
       int n=0;     
       double total=0; 
       double numeromayor=0;
       String detalle="Detalle de la Planilla. \n";
       n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Empleados Son: "));   
       
       String vec[] = new String[n];
       String nombre[] =new String[n];
       double salarioxHora[] =new double[n];
       int horasTrabajadas[] =new int[n];
       double sueldos[] =new double[n];
       
       numeromayor = sueldos[0];
       for(int j=0; j<n; j++)
       {
           nombre[j] = JOptionPane.showInputDialog("Ingrese el Nombre del empleado "+ (j+1));
           salarioxHora[j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio por Hora Trabajada: $"));
           horasTrabajadas[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus Horas Trabajas: "));           
           total=total+salarioxHora[j]*horasTrabajadas[j];                                    
           detalle+= "NOMBRE:"+nombre[j]+"SALARIO POR HORA:$"+salarioxHora[j] + "HORAS TRABAJADAS:" + horasTrabajadas[j] +"TOTAL:"+total;           
                       
       }
       
       JOptionPane.showMessageDialog(null, detalle + "\n Total de la PLANILLA: $"+total);
       
       numeromayor = salarioxHora[1]*horasTrabajadas[1];
       //double numeromayor2=0;
       for(int i=0; i<n; i++){
            sueldos[i]=salarioxHora[i]*horasTrabajadas[i];             
            if(sueldos[i]>numeromayor){ 
                 numeromayor = sueldos[i];                
                 JOptionPane.showMessageDialog(null,"Empleado que más gano de la Planilla. "+ "\n NOMBRE:  " +nombre[i]+ "   $  " + numeromayor);
               //numeromayor2 = numeromayor;               
            }             
            /*else if(numeromayor<numeromayor2){                
                numeromayor2 = numeromayor;
                JOptionPane.showMessageDialog(null,"Empleado que más gano de la Planilla. "+ "\n NOMBRE:  " +nombre[i]+ "   $  " + numeromayor2);
            }*/
        }
    }
    
}
