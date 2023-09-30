package fatecfranca.lista8;

public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Filme objF1 = new Filme ("Vingadores Ultimato", 178, 56.900f);
        Filme objF2 = new Filme ("Barbie", 120, 56.240f);
        
        Cinema cinemaObj = new Cinema("Cinemark", "São Paulo");
        cinemaObj.addFilme(objF1);
        cinemaObj.addFilme(objF2);
        cinemaObj.removeFilme(objF1);
        
        System.out.println(cinemaObj.toString());
    }
    
}
