public class methodoverloading {
    public static void main(String[] args) {
        Calculator cal =new Calculator();
        cal.add(2,3);
    }
}
class Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(float a,float b){
        System.out.println(a+b);
    }
}
