class Calculator{
    int a;
    public int add(){
        System.out.println("Hello from add");
        return 0;
    }
}
public class ClassObj {
    public static void main(String args[]){
        Calculator C= new Calculator();
        C.add();
    }
}
