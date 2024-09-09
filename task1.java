import java.util.*;
class task1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int i;
        int num=0;
        boolean again=true;
        int r=ran.nextInt(100);
        while(again==true){
            System.out.println("Guess the number between 1 to 100");
            boolean valid;
            for(i=1;i<=5;i++){
                valid=false;
                while(!valid){
                    try{
                        num=sc.nextInt();
                        valid=true;
                    }
                    catch(InputMismatchException e){
                        System.out.println("Invalid input:Please enter a number.");
                        sc.next();
                    }
                }
                if(num>r){
                    System.out.println("Too High");
                }
                else if(num<r){
                    System.out.println("Too Low");
                }
                else{
                    System.out.println("Congratulations! You have guessed the number.");
                    System.out.println("Number of attempts:"+i);
                    break;
                }
            }
            if(i>5){
                System.out.println("You have exhausted all your attempts.");
                System.out.println("The number was:"+r);
                System.out.println("Do you want to play again? (y/n)");
                char yn=sc.next().charAt(0);
                yn=Character.toLowerCase(yn);
                if(yn=='n')
                again=false;
                else if(yn=='y')
                {
                    again=true;
                    r=ran.nextInt(100);
                }
                else{
                    again=false;
                    System.out.println("Invalid input. Please enter y or n.");
                    sc.next();
                }
            }
        }
    }
}