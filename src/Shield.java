public class Shield extends DefensifEquipement {
    public Shield(int levelDefense, String name) {
        super("Shield", levelDefense, name);
    }

    public String toString() {
        return "type: Shield" + " " + "defenselevel: " + getLevelDefense() + " " + "nom du bouclier: " + getName();
    }
}
