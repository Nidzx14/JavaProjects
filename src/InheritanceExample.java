class InheritanceExample
{
      int result1;
      int ppt1=2;
      int ppt2=3;
      int result = ppt1+ppt2;

}

class Child extends InheritanceExample
{

     public static void main(String[] args)
     {

          Child sum=new Child();
          sum.result1 = sum.result + 4;
          System.out.println("The result is "+ sum.result1);
     }
}