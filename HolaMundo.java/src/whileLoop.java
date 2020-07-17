public class whileLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {



       turnOnOffLight();
        int i = 1;
        while(isTurnOnLight && i<=10) {
            printSos();
            i++;
        }
    }

    public static void printSos(){
        System.out.println("... _ _ _ ...");
    }

    public static boolean turnOnOffLight(){

        // ternario - isTurnOnLight = (isTurnOnLight)?false:true;

        if (isTurnOnLight) {
            isTurnOnLight = false;
        } else {
            isTurnOnLight = true;
        }
        return isTurnOnLight; 
    }
}