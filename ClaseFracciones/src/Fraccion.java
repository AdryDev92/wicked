
public class Fraccion {

    private int num, den;

    //Constructor

    /**
     * Constructor designado
     * @param num
     * @param den
     */
    public Fraccion(int num, int den){
        this.setNum(num);
        this.setDen(den);
    }


    //Helpers

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    Fraccion sumar(Fraccion frac){

        int num1, num2, den1, den2;
        int numResultado;
        int denResultado;

        num1 = this.getNum();
        num2 = frac.getNum();
        den1 = this.getDen();
        den2 = frac.getDen();

        denResultado = obtener_mcm(den1,den2);
        numResultado = denResultado / den1*num1 + denResultado/den2*num2;

        return new Fraccion(numResultado, denResultado);

    }

    Fraccion restar(Fraccion frac){

        int num1, num2, den1, den2;
        int numResultado;
        int denResultado;

        num1 = this.getNum();
        num2 = frac.getNum();
        den1 = this.getDen();
        den2 = frac.getDen();

        denResultado = obtener_mcm(den1,den2);
        numResultado = denResultado / den1*num1 - denResultado/den2*num2;

        return new Fraccion(numResultado, denResultado);
    }

    /*static Fraccion sumar(Fraccion a, Fraccion b){
        int num1, num2, den1, den2;
        int numResultado;
        int denResultado;

        num1 = a.getNum();
        num2 = b.getNum();
        den1 = a.getDen();
        den2 = b.getDen();

        denResultado = obtener_mcm(den1,den2);
        numResultado = denResultado / den1*num1 + denResultado/den2*num2;

        Fraccion fraccionResultado = new Fraccion(numResultado, denResultado);
        return fraccionResultado;
    }
    */

    static int obtener_mcm(int a, int b){
        return (a*b) / obtener_mcd(a,b);

    }

    static int obtener_mcd(int a, int b) {

        if(b==0)
            return a;
        else
            return obtener_mcd(b, a % b);
    }

    public String toString(){
        return this.getNum() + "/" + this.getDen();

    }
}
