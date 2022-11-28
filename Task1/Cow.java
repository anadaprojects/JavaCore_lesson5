package Task1;

public class Cow extends Pet{
    public Cow(String name) {

        super(name);
    }

    @Override
    void voice() {
        System.out.println("Я-корова-"+getName()+","+"мууууу");
    }
}
