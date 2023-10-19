public class Main {
    public static void main(String[] args){
        Menu newMenu = new Menu();
        Character joueur = newMenu.start();
        new Game(joueur);
    }

}
