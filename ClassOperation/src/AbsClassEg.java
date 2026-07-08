public class AbsClassEg {
    public static void main(String[] args) {
        Virtus v=new Virtus();
        v.engine();
        v.gear();
        I20 i=new I20();
        i.engine();
        i.gear();
        i.seat();
    }
}
abstract class Cars{
    abstract void engine();
    abstract void gear();
    public void seat(){
        System.out.println("Contains 4 seat");
    }
}
class Virtus extends Cars{
    @Override
    void engine() {
        System.out.println("Virtus contain 1.0 TSI engine");
    }

    @Override
    void gear() {
        System.out.println("Virtus contains 6 speed MT");
    }
}
class I20 extends Cars{
    @Override
    void engine() {
        System.out.println("I20 contain 1.0 TSI engine");
    }

    @Override
    void gear() {
        System.out.println("I20 contains 6 speed MT");
    }
}
