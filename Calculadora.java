import java.util.Scanner;

public class Calculadora { //este es el molde del obteto, todos los objetos calculadora tendran estos atributos y metodos
    float variableA;
    float variableB;
    float resultado;

    //Creando el método constructor aqui es donde contruimos el objeto y le damos vida a las variables o inicializarlas (instanciarlas)//

    public Calculadora(float a,float b, float r){
        this.variableA=a;
        this.variableB=b;
        this.resultado=r;
    }
    //Creando los métodos//

    public void imprimir(){
        System.out.println("Aquí inicia la calculadora");

    }

    //Creando el metodo para la suma//

    public void suma( float valorUno, float valorDos){
        this.variableA=valorUno;
        this.variableB=valorDos;
        this.resultado=variableA+variableB;
        System.out.println("El resultado de la suma es " +resultado );

    }

    public void resta(float datoUno, float datoDos){
        this.variableA=datoUno;
        this.variableB=datoDos;
        this.resultado=variableA-variableB;
        System.out.println("El resultado de la resta es " +resultado);
    }

    public void multiplicacion(float numUno, float numDos){
        this.variableA=numUno;
        this.variableB=numDos;
        this.resultado =variableA*variableB;
        System.out.println("El resultado de la multiplicacion es " +resultado);

    }

    public void division(float casoUno, float casoDos){
        if (casoDos ==0) {
            System.out.println("Syntax Error"); //valida si el valor es cero no se puede dividir y marca error
        }else{

            this.variableA=casoUno;
            this.variableB=casoDos;
            this.resultado=variableA/variableB;
            System.out.println("El resultado de la division es " +resultado);

        }



    }

    public void entradaDatos(){
        Scanner sc= new Scanner(System.in); //Este objeto permite la entrada de datos del usuario
        System.out.println("Digita el primer dato");
        variableA = Integer.valueOf(sc.nextLine()); //se utiliza para que guarde la entrada de datos del usuario ár avriabes A y B

        System.out.println("Digita el segundo dato");
        variableB = Integer.valueOf(sc.nextLine());


    }
}
