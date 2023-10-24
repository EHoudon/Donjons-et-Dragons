package Defensif;

public class DefensifEquipement {
    private String typeDefense;
    private int levelDefense;
    private String name;
    public DefensifEquipement(String typeDefense, int levelDefense, String name) {
        this.typeDefense = typeDefense;
        this.levelDefense = levelDefense;
        this.name = name;
    }

    @Override
    public String toString() {
        return"▂▃▅▇█▓▒░ Defensif Equipement ░▒▓█▇▅▃▂" + '\n' +
                "typeDefense: " + typeDefense + '\n' +
                "levelDefense: " + levelDefense + '\n' +
                "name: " + name + '\n';
    }

    public String getTypeDefense() {
        return typeDefense;
    }
    public void setTypeDefense(String typeDefense) {
        this.typeDefense = typeDefense;
    }
    public int getLevelDefense() {
        return levelDefense;
    }

    public void setLevelDefense(int levelDefense) {
        this.levelDefense = levelDefense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
