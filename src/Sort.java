public class Sort extends OffensifEquipement{
    public Sort( int attackLevel, String name) {
        super("Sort", attackLevel, name);
    }
    public String toString() {
        return "type: Sort" + " " + "attacklevel: " + getAttackLevel() + " " + "nom de l'arme: " + getName();
    }
}
