package Task1;

public abstract class Pet {
    private String name;
    Pet (String name){
        this.name=name;
    }
 abstract void voice();

    public String getName() {
        return name;
    }
}
