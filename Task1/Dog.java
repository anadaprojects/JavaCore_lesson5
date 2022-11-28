package Task1;

public class Dog extends Pet{
    public Dog(String name ){
        super(name);
    }

    @Override
    void voice() {
        System.out.println("Я-песик-"+getName()+","+"гааавв");
    }
}
