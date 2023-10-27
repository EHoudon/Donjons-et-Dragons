package Board;

import Personnage.*;

public class Casevide implements Case {

    @Override
    public String toString() {
        return "Casevide";
    }

    @Override
    public int interaction(Personnage joueur) {
        return 1;

    }
}
