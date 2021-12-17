public class yokaiCards {
    
    //voici nos différentes cartes //

    //Kappa//
    //Kitsune//
    //Oni//
    //Rokurokubi//

    private final int Type;

    public String toString() {
        if (this.Type == 0) {
            return ("Kappa");
        } else if (this.Type == 1) {
            return ("Kitsune");
        } else if (this.Type == 2) {
            return ("Oni");
        } else if (this.Type == 3) {
            return ("N");
        } else if (this.Type == 4) {
            return ("R");
        } else if (this.Type == 5) {
            return ("P");
        } else {
            return (" ");
        }
}
