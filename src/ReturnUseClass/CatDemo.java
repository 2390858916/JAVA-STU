package ReturnUseClass;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator cp = new CatOperator();
        Cat c = new Cat();
        cp.useCat(c);

        Cat c2 = cp.getCat();
        c2.eat();
    }
}
