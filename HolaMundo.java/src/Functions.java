import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class Functions {
    public static void main(String[] args) {
        double y = 3;
        //area de un circulo
        // pi * r2

        double area = areaCirculo(y);
        System.out.println(area);

        double areaEsferica = areaEsfera(y);
        System.out.println(areaEsferica);

        double volumenEsfera = volumenEsfera(y);
        System.out.println(volumenEsfera);

        System.out.println("pesos uruguayos a dolares: " + convertirADolares(20000, "uruguayos"));
    }

    public static double areaCirculo(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double areaEsfera(double r){
        return 4* Math.PI * Math.pow(r,2);
    }

    public static double volumenEsfera(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    public static double convertirADolares(double cantidad, String tipoDeMoneda){
        //pesos uruguayos
        switch (tipoDeMoneda) {
            case "uruguayos":
                cantidad *= 0.023;
                break;
            case "colombianos":
                cantidad = cantidad * 0.00031;
                break;
        }
        return cantidad;
    }
}
