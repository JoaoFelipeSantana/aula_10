public class App {
    public static void main(String[] args) throws Exception {
        Relogio r1 = new Relogio();
        r1.setHora(11);
        r1.setMin(15);
        r1.setSeg(30);

        System.out.println(String.format("%d:%d:%d", r1.getHora(), r1.getMin(), r1.getSeg()));

        Relogio r2 = new Relogio(11);
        System.out.println(String.format("%d:%d:%d", r2.getHora(), r2.getMin(), r2.getSeg()));

        Relogio r3 = new Relogio(11, 22);
        System.out.println(String.format("%d:%d:%d", r3.getHora(), r3.getMin(), r3.getSeg()));

        Relogio r4 = new Relogio(11, 23, 30);
        System.out.println(String.format("%d:%d:%d", r4.getHora(), r4.getMin(), r4.getSeg()));

        Relogio r5 = new Relogio();
        System.out.println(String.format("%d:%d:%d", r5.getHora(), r5.getMin(), r5.getSeg()));

    }
}
