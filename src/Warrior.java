public class Warrior extends Character {
private Object Weapon;
    public Warrior(String name, Object Weapon){
        super(name,"Warrior",10,10 );
        this.Weapon = new Weapon(5,"Hache");
    }

    public Object getWeapon() {
        return Weapon;
    }

    public void setWeapon(Object weapon) {
        Weapon = weapon;
    }
}
