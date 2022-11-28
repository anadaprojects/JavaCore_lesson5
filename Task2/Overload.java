package Task2;

public class Overload {
    int a;
    int b;
    int c;

    public Overload(int a) {
        this.a = a;
    }
    public Overload(int a,int b){
        this(a);
        this.b=b;
    }
    public Overload(int a,int b,int c){
        this(a,b);
        this.c=c;
    }
}
