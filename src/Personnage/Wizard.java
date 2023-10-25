package Personnage;

public class Wizard extends Personnage {
    private String type = "Wizard";
private Object Sort;
    public Wizard(String name){
        super(name,3,8);

    }

    public Object getSort() {
        return Sort;
    }

    public void setSort(Object sort) {
        Sort = sort;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}

