public class OffensifEquipement {

    private String TypeWeapon;
    private int attackLevel;
    private String name;
    public OffensifEquipement(String TypeWeapon, int attackLevel, String name) {
        this.TypeWeapon = TypeWeapon;
        this.attackLevel = attackLevel;
        this.name = name;

    }


    public String getTypeWeapon() {
        return TypeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        TypeWeapon = typeWeapon;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

