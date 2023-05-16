import java.util.*;
public class FascinatingNumber {
    public static void main(String args[]) {
      Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();
     
      String concatstr=" "+n+n*2+n*3;
      System.out.println(concatstr);
      int flag=0;
      for(char c='1';c<='9';c++)
      {
          int count=0;
          for(int i=0;i<concatstr.length();i++)
          {
              char ch=concatstr.charAt(i);
              if(ch==c)
              {
                  count++;
                  flag++;
              }
          }
          if(count>1||count==0)
          {
              System.out.println("Not fascinating number");
              break;
          }
          
      
      }
      if(flag==9)
      {
           System.out.println("Fascinating number");
      }
    }
}