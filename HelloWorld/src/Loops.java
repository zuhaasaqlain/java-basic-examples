import java.util.Scanner;

public class Loops {

    public static void main(String []args){

        char ch = 'a';
        int c = 0;

//        System.out.println("Please enter a character :");
//        Scanner in = new Scanner(System.in);
//
//        while(ch != 'p'){
//            ch = in.next().charAt(0);
//            c++;
//        }



        // prints 0 as he runs the body before checking the condition
        do{
            System.out.println(c);
            c++;
        } while(c > 5);




      for(int j= 0 ; j < 5 ; j++){
          System.out.println(j);
      }

      for(int i = 0 , j = 0 ; i < 10 || j < 5 ; i++ , j++ ){
          System.out.println("i="+ i+ "\t" + "j ="+j );
      }
    }
}
