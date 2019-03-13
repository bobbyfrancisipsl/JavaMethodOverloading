public class MethodOverloading {

   // static int add(int a,int b){
     //   return a+b;
   // }


    static void addValue(int a,int b) {

        System.out.println(a + b);
    }
    static void addValue(int a,int b,int c){

        System.out.println(a+b+c);

    }

    static void addValue(int a,int b,int c,int d) {

        System.out.println(a + b + c + d);

    }
    public static void main(String[] args) {

       // System.out.println("Method with return value: " + add(3, 5));

        addValue(12,3);
        addValue(50,90,100);
        addValue(50,90, 200,  200 );

    }

}
