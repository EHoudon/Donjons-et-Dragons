package Character;

public class Enemy extends Character{

    public Enemy(String name,int life,int attackStrength){
    super(name,life,attackStrength);
}

    @Override
    public String toString() {
        String type = "Enemy";
        return "Enemy" + '\n' +
                "type: " + type + '\n' +
                "name: " + getName() + '\n' +
                "vie: " + getLife() + '\n' +
                "Attaque: " + getAttackStrength() + '\n'
                ;
    }

    @Override
    public String getType() {
        return null;
    }
}
