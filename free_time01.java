// import java.util.*;

// public class free_time01 {

//     public static void main(String[]args){

//             System.out.println("Enter 2 Numbers: ");
//             Scanner sc = new Scanner(System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();

//             System.out.println("Press the Key:\n1 = sum\n2 = subtract\n3 = Devide\n4 = Multiply");
//             int button = sc.nextInt();

//             switch(button){
//                 case 1: System.out.println("The sum is: "+ (a+b));
//                 break;
//                 case 2: System.out.println("The Subtract Result is: ");
//                         System.out.println(a-b);
//                 break;
//                 case 3 : System.out.println("The Devision is: "+ a/b);
//                 break;
//                 case 4 : System.out.println("The Multiply is: "+ a*b);
//                 break;
//                 default: System.out.println("Opps - Invalid key is pressed");


//             }

            
            

//     }
    
// }





import java.util.*;
public class free_time01 {

        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome \nPlease Enter Your Marks: ");
        int marks = sc.nextInt();

        if(marks<35){
            System.out.println("You are Fail\nYour Grade is F");
        }else{
            if(marks<60){
                System.out.println("Your Grade is D");
            }else{
                if(marks<75){
                    System.out.println("Your Grade is C");
                }else{
                    if(marks<85){
                        System.out.println("Your Grade is B");
                    }else{
                        if(marks<99){
                            System.out.println("Your Grade is A");
                        }else{
                            System.out.println("Invalid");
                        }
                    }
                }
            }
        }
}

}





