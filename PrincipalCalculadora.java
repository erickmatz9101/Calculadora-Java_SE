public class PrincipalCalculadora {
    public static void main(String[] args) {

        Calculadora casio=new Calculadora(1,2,3); //el segundo calculadora es para madar a llamar al metodo constructor (objeto) instanciarlo

        casio.imprimir();

        System.out.println(casio.variableA +" " + casio.variableB + " " + casio.resultado);

        casio.suma(1000,300);

        casio.resta(1000,300);

        casio.multiplicacion(300,400);

        casio.division(25,0);

    }
}
