import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Rules for the game are as follows:-");
		System.out.println("0 for rock");
		System.out.println("1 for paper");
		System.out.println("2 for scissor");
		System.out.println("1 point if you win and 0.5 for draw ");
		System.out.println("Paper loses to scissor");
		System.out.println("Rock loses to paper ");
		System.out.println("Scissor loses to rock");
		System.out.println("Input except these values would be considered invalid");
		System.out.println("So here you go GOOD LUCK!!!");
		Random r=new Random();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of sets you want to play");
		int t=sc.nextInt();
		int c=t;
		double count=0;
		while(t!=0)
		{
		    System.out.println("Enter your input");
		    int a =r.nextInt(3);
		    int b=sc.nextInt();
		   
		        if(b==0) //rock
		       { 
		           if(a==0)//rock
		        {
		            System.out.println("Well that's a draw");
		            count=count+0.5;
		        }
		      else  if(a==1)//paper
		        {
		            System.out.println("Its a paper you lost 1 point");
		           
		        }
		      else if(a==2)
		        {
		            System.out.println("Its a scissor you scored 1 point");
		            count=count+1;
		        }
		    }
		   
		    if(b== 1)//paper
		       { 
		           if(a==0)//rock
		        {
		            System.out.println("Its a rock you scored 1 point");
		            count++;
		        }
		        if(a==1)//paper
		        {
		            System.out.println("Its a draw");
		           count=count+0.5;
		        }
		        if(a==2)
		        {
		            System.out.println("Its a scissor you lost 1 point");
		        }
		    }
		   if(b== 2)//scissor
		       { 
		           if(a==0)//rock
		        {
		            System.out.println("Its a rock you lost 1 point");
		        if(a==1)//paper
		        {
		            //count++;
		        }
		            System.out.println("Its paper you scored 1 point");
		           count=count+1;
		        }
		        if(a==2)
		        {
		            System.out.println("Its a draw");
		            count=count+0.5;
		        }
		    }
		    
		t--;
}
	    System.out.printf("Your score is %.2f out of %d",count,c);
	}
    
}
