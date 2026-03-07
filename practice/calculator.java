import java.util.Scanner;
class calculator {
    public static void main(String[] args){
        int a;
        int b; 
        String c; 

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first number ");
        a = sc.nextInt();

        System.out.println("Enter your second number ");
        b = sc.nextInt();
        
        System.out.println("Choose number  method : ");
        System.out.println("1 for +");
        System.out.println("2 for -");
        System.out.println("3 for *");
        System.out.println("4 for /");

        c = sc.next();
        


        if (c == "1"){
            System.out.println("Your ans is " + a+b);
        }

        else if(c == "2"){
            System.out.println("Your ans is " + (a-b));
        }
        
        else if(c == "3"){
            System.out.println("Your ans is " + a*b);
        }
        
        else if(c == "4"){
            System.out.println("Your ans is " + a/b);
        }
        
        else{
            System.out.println("Invalid Operator");
        }
       
    }
    
}
