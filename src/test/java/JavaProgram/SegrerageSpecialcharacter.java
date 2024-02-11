package JavaProgram;

public class SegrerageSpecialcharacter {
   public static void main(String args[])
   {
       String str= "aabj@3ko&em%9";
       String a =str.replaceAll("[^a-zA-Z0-9]","");
                String b=str.replaceAll("[a-zA-Z0-9]","");
       System.out.println(a);
       System.out.println(b);
      a= a.concat(b);
       System.out.println(a);

   }
}
