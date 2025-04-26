import java.util.Scanner;

public class CalculadoraGeometricaV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resultados = new double[100];
        int contador = 0;
        boolean continuar = true;

        System.out.println("=== Calculadora Geométrica V2 ===");

        while (continuar && contador < resultados.length) {
            try {
                System.out.println("\nFiguras:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Rectángulo");
                System.out.println("4. Triángulo");
                System.out.println("5. Pentágono");

                System.out.print("Seleccione una figura (1-5): ");
                int figura = Integer.parseInt(scanner.nextLine());

                System.out.print("¿Qué desea calcular? (1 = Área, 2 = Perímetro): ");
                int operacion = Integer.parseInt(scanner.nextLine());

                double resultado = 0;

                switch (figura) {
                    case 1:
                        System.out.print("Ingrese el radio: ");
                        double radio = Double.parseDouble(scanner.nextLine());
                        resultado = (operacion == 1) ? Math.PI * radio * radio : 2 * Math.PI * radio;
                        break;
                    case 2:
                        System.out.print("Ingrese el lado: ");
                        double lado = Double.parseDouble(scanner.nextLine());
                        resultado = (operacion == 1) ? lado * lado : 4 * lado;
                        break;
                    case 3:
                        System.out.print("Ingrese la base: ");
                        double base = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese la altura: ");
                        double altura = Double.parseDouble(scanner.nextLine());
                        resultado = (operacion == 1) ? base * altura : 2 * (base + altura);
                        break;
                    case 4:
                        if (operacion == 1) {
                            System.out.print("Ingrese la base: ");
                            double baseTri = Double.parseDouble(scanner.nextLine());
                            System.out.print("Ingrese la altura: ");
                            double alturaTri = Double.parseDouble(scanner.nextLine());
                            resultado = (baseTri * alturaTri) / 2;
                        } else {
                            System.out.print("Ingrese lado 1: ");
                            double l1 = Double.parseDouble(scanner.nextLine());
                            System.out.print("Ingrese lado 2: ");
                            double l2 = Double.parseDouble(scanner.nextLine());
                            System.out.print("Ingrese lado 3: ");
                            double l3 = Double.parseDouble(scanner.nextLine());
                            resultado = l1 + l2 + l3;
                        }
                        break;
                    case 5:
                        System.out.print("Ingrese el lado: ");
                        double ladoPent = Double.parseDouble(scanner.nextLine());
                        if (operacion == 1) {
                            System.out.print("Ingrese el apotema: ");
                            double apotema = Double.parseDouble(scanner.nextLine());
                            resultado = (5 * ladoPent * apotema) / 2;
                        } else {
                            resultado = 5 * ladoPent;
                        }
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        continue;
                }

                resultados[contador++] = resultado;
                System.out.printf("Resultado: %.2f\n", resultado);

                System.out.print("¿Desea realizar otra operación? (s/n): ");
                String respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    continuar = false;
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
            }
        }

        System.out.println("\n=== Resultados Totales ===");
        for (int i = 0; i < contador; i++) {
            System.out.printf("Operación %d: %.2f\n", (i + 1), resultados[i]);
        }

        System.out.println("Gracias por usar la calculadora.");
        scanner.close();
    }
}

