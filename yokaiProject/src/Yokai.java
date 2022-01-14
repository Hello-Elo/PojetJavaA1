
public class Yokai {
    private Player currentPlayer;

    import java.util.Scanner;


    public void play() {
        while (true) {
            createPlayers();
            /* initialiseBoard();
            while (!isPartyOver()) {
                printBoard();
                String move;
                do {
                    move = askMove();
                }
                while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
            */
        }
    }
    public void createPlayers(){

            int nbplayers;
            System.out.println("Combien de joueurs y aura t-il ?");
            nbplayers = scan.nextInt();
    
            if (nbplayers <= 4 + nbplayers >= 2){
    
                for (int i = 0 ; i < nbplayers ; i++){
    
                    System.out.println("Joueur numéro " + i);
                    System.out.println("Comment vous appelez vous ?");
                    Player player = new Player.Builder(i).name(scanner.nextLine()).build() ;
                }
            
               
            } else {
                System.out.println("Nombre de joueurs invalides")
            }
        }
    
    
    
    
   /* public void createPlayersVersion1(){
        Scanner scanner = new Scanner(System.in);

        int nbplayers;
        System.out.println("Combien de joueurs y aura t-il ?");
        nbplayers = scan.nextInt();
        if (nbplayers <= 4) {
                    
            final Player player1 = new Player();
            System.out.println("Comment s'appelle le joueur commençant la partie?");
            player1.setName(scanner.nextLine());
            
            final Player player2 = new Player();
            System.out.println("Comment s'appelle le second joueur ?");
            player2.setName(scanner.nextLine());

            if (nbplayers >= 4) {
                final Player player3 = new Player();
                System.out.println("Comment s'appelle le troixieme joueur ?");
                player3.setName(scanner.nextLine());
            }

            if (nbplayers == 4) {
                final Player player4 = new Player();
                System.out.println("Comment s'appelle le dernier joueur ?");
                player4.setName(scanner.nextLine());
            }
            currentPlayer = player1;


        } else {
            System.out.println("nombre de joueur invalide");

        }
        */


       
        
        


        
    }
}
