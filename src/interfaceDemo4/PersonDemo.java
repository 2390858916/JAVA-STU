package interfaceDemo4;

//≤‚ ‘¿‡
public class PersonDemo {
    public static void main (String[] args){
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("niubi");
        ppp.setAge(111);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.study();
        ppp.eat();
        ppp.speak();
        System.out.println("-----------------------");

        BasketballPlayer bs = new BasketballPlayer("nbb",12);
        System.out.println(bs.getName() + "," + bs.getAge());
        bs.study();
        bs.eat();

        System.out.println("--------------------------");
        PingPangCoach ppc = new PingPangCoach("jialian",11);
        System.out.println(ppc.getName() + "," + ppc.getAge());
        ppc.eat();
        ppc.teach();
        ppc.speak();
    }
}
