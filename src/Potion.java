
public class Potion extends Item {
    
    int heal;
    
    public Potion(String n, int h, int am, int c){
        heal = h;
        name = n;
        amount = am;
        cost = c;
    }

    
    public int Use(){
        return heal;  
    }
}
