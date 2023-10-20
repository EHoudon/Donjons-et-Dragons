package Character;

public class Warrior extends Character {
   private String type = "Warrior";
private Object Weapon;
    public Warrior(String name){
        super(name,10,10 );
//        this.Weapon = new Weapon(5,"Hache");
    }
    public Object getWeapon() {
        return Weapon;

    }

    public void setWeapon(Object weapon) {
        Weapon = weapon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
