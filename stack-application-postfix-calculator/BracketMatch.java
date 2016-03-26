import java.util.Scanner;

public class BracketMatch{ 
  public static void main(String[]args){ 
    ArrayStack a = new ArrayStack(); 
    Scanner k=new Scanner(System.in);
    System.out.println("Input ur ____");
    String s=k.nextLine();
    try
    {
      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if(c=='(' ||c== '{'||c== '[')
        {
          a.push(c);
        }
        if(c==')' || c=='}'|| c==']')
        {
          char c2=(Character)a.pop(); 
          
          if(c2=='(' && c==')') 
          { 
            System.out.println("Bracket match");   
          } 
          
          else if(c2=='{'&& c=='}') 
          { 
            System.out.println("Bracket match!!!");   
          } 
          else if(c2=='['&& c==']') 
          { 
            System.out.println("Bracket match!!!");   
          } 
          else 
          {
            System.out.println("oh error found at " + i + ": " + c2 + " Bracket dosent closed"); 
            break; 
          }
        }
      }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    
//    boolean b=true;
//    if(a.isEmpty())
//    {
//       System.out.println("No error found");
//    }
//    else
//    {
//          System.out.println("error found");
//    }
  }
}

