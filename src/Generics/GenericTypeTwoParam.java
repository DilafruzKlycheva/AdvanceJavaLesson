package Generics;

public class GenericTypeTwoParam <S, U>{

    private S s;
    private U u;

    //Getter - Setter


    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }
    //main metodu
    public static void main(String[] args) {
        GenericTypeTwoParam<String,Integer> obj1=new GenericTypeTwoParam<>();
    }

}
