public class method_overriding {
    int add(){
        int a =10, b=20, c=30;
        int sum = a+b+c;
        return sum;
    }
}

class feroz extends method_overloading{
    int add(){
        int a=20, b=1, c=30;
        int sum=a+b+c;
    return sum;}
    public static void main(String[] args){
    feroz f= new feroz();
    System.out.println(f.add());
    }
}

