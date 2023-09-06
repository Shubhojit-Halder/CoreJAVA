class Calculator{
    int a;
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    //method over loading
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}
public class ClassObj {
    public static void main(String args[]){
        Calculator C= new Calculator();
       System.out.println( C.add(3,4));
    }
}
