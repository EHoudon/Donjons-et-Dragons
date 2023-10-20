package Character;

public class Wizard extends Character {
    private String type = "Wizard";
private Object Sort;
    public Wizard(String name){
        super(name,6,15);

    }

    public Object getSort() {
        return Sort;
    }

    public void setSort(Object sort) {
        Sort = sort;
    }
}
