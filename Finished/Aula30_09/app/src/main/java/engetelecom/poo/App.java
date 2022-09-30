package engetelecom.poo;

public class App {

    public static void main(String[] args) {
        BuzzLightYear boneco1 = new BuzzLightYear();
        BuzzLightYear boneco2 = new BuzzLightYear();

        boneco1.abrirCapacete();
        System.out.println("Capacete está " + ((boneco1.isCapaceteAberto()) ? "aberto" : "fechado"));
        System.out.println("Asa está " + ((boneco1.isAsaAberta()) ? "aberta" : "fechado"));
        System.out.println(boneco1.dispararLaser());
        System.out.println(boneco1.falarFrase());
    }
}
