// first hv to import scanner    ==> import java.util.Scanner;      ==>  Scanner is class which is stored in java.util library
// write traditional line        ==> Scanner sc = new Scanner(System.in);   ==>  sc is obect of scanner class, new is used coz we create a new object of scanner
// sc.next(),, these are the meathods in sc




import java.util.Scanner;   
class scanner {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Enter a number ");
        a = sc.nextInt();
        
        System.out.println("Your num is : "+ a);

    }

}
