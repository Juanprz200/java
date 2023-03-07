package Juan.app;

import javax.swing.*;

public class cincodediezejerc {
    public void ejercicio1 () {

        private String textOO;
        private int Codigo1;
    }
    public void ejercicio2 (){

        int nu = 1;

        while (nu <= 100) {
            System.out.println(nu);

            nu++;
        }
    }

    public void ejercicio3(){

        final double IVA = 0.21;

        String texTo = JOptionPane.showInputDialog("Introduce el precio de un producto seleccionado");

        double precio = Double.parseDouble(texTo);

        double precioFinal = precio + (precio * IVA);

        System.out.println(precioFinal);

    }
    public void ejercicio4(){

        String teXto = JOptionPane.showInputDialog("Introduce un caracter ASCII");

        char Caracter = teXto.charAt(0);

        int Codigo = (int) Caracter;

        System.out.println(Codigo);

    }
    public void ejercicio5(){

        String Texto = JOptionPane.showInputDialog("Introduce un digito de la tabla ASCII");

        int codigo = Integer.parseInt(Texto);

        char caracter = (char) codigo;

        System.out.println(caracter);

    }
    public void ejercicio6() {

        int numero = Integer.parseInt(textOO);


        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es divisible entre 2");
        } else {
            System.out.println("El numero " + numero + " no es divisible entre 2");
        }


        public void ejercicio7 () {
            String texto = JOptionPane.showInputDialog("Introducir radio");

            double radio = Double.parseDouble(texto);

            double area = Math.PI * Math.pow(radio, 2);

            System.out.println("El area del circulo es " + area);
        }

        public void ejercicio8 () {
            JOptionPane.showInputDialog("Introducir nombre");
        }

        public void ejercicio9 () {
            String nombre = "todos";

            System.out.println("sean Bienvenidos " + nombre);

        }

        public void ejercicio10 () {
            int Num01 = 30;
            int Num02 = 22;

            System.out.println("El resultado al sumar es " + (Num01 + Num02));

            System.out.println("El resultado al restar es " + (Num01 - Num02));

            System.out.println("El resultado al multiplicar es " + (Num01 * Num02));

            System.out.println("El resultado al dividir  es " + (Num01 / Num02));
        }

        public void ejercicio11 () {
            Codigo1 = 0;
            do {
                String textO = JOptionPane.showInputDialog("Introduce un numero mayor que 0");
                Codigo1 = Integer.parseInt(textO);
            } while (Codigo1 <= 0);

            System.out.println(Codigo1);
        }
    }
}
