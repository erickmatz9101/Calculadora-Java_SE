public class PrincipalCalculadora {
    public static void main(String[] args) {

        Calculadora casio=new Calculadora(1,2,3); //el segundo calculadora es para madar a llamar al metodo constructor (objeto) instanciarlo

        casio.entradaDatos();

        casio.suma(casio.variableA, casio.variableB);



       // casio.multiplicacion(casio.variableA, casio.variableB);

       // System.out.println(casio.variableA + " " + casio.variableB); //Aqui validamos si se esta guardando dentro de entradaDatos


        /**
         * No olvides que tienes que mandar a llamar al metodo ya que las variables aunque cambien de nombre dentro de cada metodo viven en todo
         * el objeto y es asi como se pueden manipular para que puedan ser ocupadas cuando las invocamos..
         */




    }
}
