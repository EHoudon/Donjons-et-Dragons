public class Character {
    private String name;
    private String type;
    private int life;
    private int attackStrength;
    private int playerPosition;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, String type, int life, int attackStrength) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.attackStrength = attackStrength;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
            this.type = type;
    }


    public int getLife() {
        return life;
    }

    public void setLife(int life) {
            this.life = life;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
}
