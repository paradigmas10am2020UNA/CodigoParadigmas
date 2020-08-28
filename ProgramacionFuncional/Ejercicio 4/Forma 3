record EState(int i, int x, int y){
       public static EState initial(int x, int y){
           return new EState(0, x, y);
       }
       public EState update(){
           return new EState( i + 1, x - y,  y );
       }
       public boolean isFinal(){
           return x < y;
       }
       public List<Integer> listita(){
           return Arrays.asList(i, x);
       }
   }
List<Integer> euclid(int x, int y){
 return    Stream.iterate( EState.initial( x, y ), EState::update  )
 .filter( state -> state.isFinal() )
 .findFirst()
.get()
.listita();}

//autora: Natalia Solano Azofeifa
