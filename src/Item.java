
public abstract class Item implements Comparable {
    
    protected String name;
    protected int attack;
    protected int defense;
    protected int amount;
    protected int cost;
    
    public Item(){
        
    }
    
    public String getItemName(){
        return name;
    }
    
    public int getItemAttack(){
        return attack;
    }
    
    public int getItemDefense(){
        return defense;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void removeAmount(){
        amount --;
    }  
    
    public int getCost(){
        return cost;
    }
    
    public int test(){
        String te = String.valueOf(name.charAt(0));
        int et = 0;
        if (te.equals("A")){
        et = 0;
        }
        return et;
    }
    
    @Override
    public int compareTo(Object o) {
        int id = -1;
        String tempname = ((Item)o).getItemName();
        tempname = String.valueOf(tempname.charAt(0));
        id = tempname.hashCode();
        return id;
    }

}
