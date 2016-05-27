public class FootBallTeam extends Team{
    
    FootBallTeam(String name){
        
        super(name);
    }
    
    public String toString(){
        
        return "Our name is " + super.name + "\nwe play Football";
    }
}