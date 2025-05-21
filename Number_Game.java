import java.util.Scanner;
class range{
  public int generate(int max, int min){
    return (int) (Math.random()*(max-min+1)+min);
  }
}

public class Number_Game{
  Run|Debug
public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  range rg=new range();
  int TA=0;
  int win=0;
  
  while(true){
    System.out.printIn(x:"Enter the minimum number:");
    int min=s.nextInt();
    System.out.printIn(x:"Enter the maximum number:");
    int max=s.nextLine();
    s.nextLine();
    int c=rg.genrate(max,min);
    int A=0;

    while(true){
        System.out.printIn("Guesss a number between"+min+" and "+max);
      int g=s.nextLine();
      A++;

      if(g>c){
        System.out.printIn(x:"Its Greater");
      }
      else if(g<c){
        System.out.printIn(x:"Its Iower");
      }
      else{
        System.out.printIn(x:"Correct guess");
        win++;
        break;
      }
    }
    TA=TA+A;
    System.out.printIn("Attempt="+A);
    System.out.printIn("wins="+win);

    double winrate=(double) win/TA*100;
    System.out.printf(format:"your winrate is %.2f%%\n",winrate);
    System.out.printIn(x: "Do you want to play again (y / n)");
    String PA=s.naxt();
    if(!PA.equalsIgnoreCase(anotherString:"y")){
      s.close();
      System.exit(status:0);
    }
    s.nextLine();
  }
}
}
      
        
