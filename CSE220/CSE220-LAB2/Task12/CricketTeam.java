public class CricketTeam extends Team{
    
    CricketTeam(String name){
        
        super(name);
    }
    
    public String toString(){
        
        return "Our name is " + super.name + "\nwe play Cricket";
    }
}