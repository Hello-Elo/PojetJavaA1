public class Player {
    private int nbr ;
    private String name ;

    public static class Builder() {
        
        private final int nbr ;
        private final String name  ;
        public Builder(int nbr){this.nbr = nbr ; }
        public Builder name(String name ){this.name = name ; return this ; }
        public Player build(){ return new Player(this) ; }
        public Player(Builder builder){nbr = builder.nbr ; name = builder.name ; }
        
    }
    
}
