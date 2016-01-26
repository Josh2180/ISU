
public class Potion extends Item {
    
    int heal;
    
    public Potion(int h){
        heal = h;
    }
    
    public int Use(){
        return heal;  
    }
}
