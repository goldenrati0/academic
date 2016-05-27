public class Sports{
    
    public static void printDetail(Team t){
        
        System.out.println("----Printing Detail-----");
        System.out.println(t);
    }
    
    public static void main(String [] args){
        
        FootBallTeam f = new FootBallTeam("Brazil");
        CricketTeam c = new CricketTeam("India");
        
        printDetail(f);
        printDetail(c);
    }
}