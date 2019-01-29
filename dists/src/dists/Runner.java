package dists;

public class Runner {
    private String name, club,raceTime,distance ;
    
    Dists distances;
    
    public Runner (String n, String c, String d, String r){
        name =n;
        club = c;
        raceTime = r;
        distance = d;  
        distances = new Dists(distance);
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
        
public String getTimeinSecs() {   
 int sec =0;  

    sec = Integer.parseInt(raceTime.substring(0, 1)) * (60*60)+ Integer.parseInt(raceTime.substring(2, 4)) * 60 + Integer.parseInt(raceTime.substring(5));
return sec + "" ; 
}
    @Override
    public String toString () {
 return name + " ran a total of " + distances.getTotalkms() + "\n" + "Race Time : "  + raceTime + " club: " + club;
}
   
}