import com.shinco.learnjava.composition.pcdemo.*;

public class CompositionMain {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("HV_190","Dell","230",dimensions);
        Monitor monitor = new Monitor("27inch beast ", "Shinco" , 27, new Resolution(1920,1080));
        Motherboard motherboard = new Motherboard("AMD Ryzen", "AMD", 8, 3,"2.44");
        PC pc = new PC(theCase,monitor,motherboard);
        pc.powerUp();
    }
}
