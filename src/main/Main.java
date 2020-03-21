package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        String opcion = JOptionPane.showInputDialog(null, "1. Obtener numeros de la serie Fibonacci." +
                "\n2. Cálculos matematicos." +
                "\n3. Salir");
        switch (opcion){
            case "1":
                int n1=1;
                int n2=1;
                int n3;
                int c;
                c= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos: "));
                JOptionPane.showMessageDialog(null, n1+" "+n2+" ");
                for(int i=1; i<=c-2;i++){
                    n3 = n1+n2;
                    n1=n2;
                    n2=n3;
                    JOptionPane.showMessageDialog(null, n3);
                }
                break;
            case "2":
                String opcion2 = JOptionPane.showInputDialog(null, "1. Cálcular la factorial de un número." +
                        "\n2. Obtener promedio de datos." +
                        "\n3. Cálcular notas de un grupo de estudiantes." +
                        "\n4. Regresar.");
                switch (opcion2) {
                    case "1":
                        String fact = JOptionPane.showInputDialog(null, "Ingrese el número a factorizar: ");
                        int a = Integer.parseInt(fact);
                        int resultadofact = 1;
                        for (int i = 1; i <= a; i++) {
                            resultadofact *= i;
                    }
                        JOptionPane.showMessageDialog(null,resultadofact);
                        break;
                    case "2":
                        String prom = JOptionPane.showInputDialog(null, "Ingrese la cantidad de valores a promediar: ");
                        int b = Integer.parseInt(prom);
                        int cont=0;

                        for (int i = 1; i <= b; i++) {
                            String prom2 = JOptionPane.showInputDialog(null, "Ingrese el valor #"+i+": ");
                            int d = Integer.parseInt(prom2);
                            cont = ((cont+d)/i);
                        }
                        JOptionPane.showMessageDialog(null,"El promedio es de: "+cont);
                        break;
                    case "3":
                        String cantest = JOptionPane.showInputDialog(null,"Ingrese la cantidad de estudiantes: ");
                        double e = Integer.parseInt(cantest);
                        double cont1=0;
                        for (int i = 1; i <= e; i++) {
                            String promest = JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante #"+i+": ");
                            double d = Double.parseDouble(promest);
                            cont1 = ((cont1+d)/i);
                        }
                        JOptionPane.showMessageDialog(null,"El promedio de notas del grupo de estudiantes es de: "+cont1);
                        break;

                    case "4":
                        main(null);
                        break;
                    default:

                        break;
                }
                
                break;

            default:

                break;
        }
    }
}
