package Encapsulacion;

public class Main {
    public static void main(String[] args) {

        System.out.println("PERSONA");
        Persona p1 = new Persona("Fredy", "Ruiz", 19);
        Persona p2 = new Persona("Raton", "Cetino", 25);
        Persona p3 = new Persona("Maria", "Godoy", 30);

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        System.out.println("\nRECTANGULO");
        Rectangulo r1 = new Rectangulo(5, 4);
        Rectangulo r2 = new Rectangulo(6, 3);

        System.out.println("Area 1: " + r1.area());
        System.out.println("Area 2: " + r2.area());

        if (r1.area() > r2.area()) {
            System.out.println("Rectangulo 1 tiene mayor area");
        } else {
            System.out.println("Rectangulo 2 tiene mayor area");
        }

        System.out.println("\nPRODUCTO");
        Producto prod1 = new Producto("P001", "Macbook pro", 5000);
        Producto prod2 = new Producto("P002", "Ipad", 200);

        prod1.aplicarDescuento(10);
        prod2.aplicarDescuento(20);

        prod1.mostrar();
        prod2.mostrar();

        System.out.println("\nCUENTA");
        Cuenta cuenta = new Cuenta("Fredy Ruiz", 1000);

        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.retirar(100);

        cuenta.mostrarSaldo();

        System.out.println("\nLIBRO");
        Libro l1 = new Libro("Harry potter", "Autor:Yo ", 500);
        Libro l2 = new Libro("Kung fu Panda", "Autor: Raton", 250);
        Libro l3 = new Libro("Demon Slayer", "Autor: Koyoharu Gotouge", 1000);

        l1.mostrar();
        l2.mostrar();
        l3.mostrar();

        System.out.println("\nCALCULADORA");
        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("Resta: " + calc.restar(10, 5));
        System.out.println("Multiplicacion: " + calc.multiplicar(10, 5));
        System.out.println("Division: " + calc.dividir(10, 0));

        System.out.println("\nFECHA");
        Fecha f1 = new Fecha(30, 9, 2026);
        Fecha f2 = new Fecha(6, 8, 2026);
        Fecha f3 = new Fecha(10, 13, 2029);

        f1.mostrar();
        f2.mostrar();
        f3.mostrar();
    }
}