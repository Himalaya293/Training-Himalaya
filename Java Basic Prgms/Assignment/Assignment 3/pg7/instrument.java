abstract class instrument{
abstract void play();
}
class piano extends instrument{
  void play(){System.out.print("Piano is playing tan tan tan tan for Piano class");}
}
class flute extends instrument{
 void play(){System.out.print("Flute is playing toot toot toot toot" );}
}
class guitar extends instrument{
void play(){System.out.print("Guitar is playing tin tin");}
}
class imp{
public static void main(String []args){
instrument ins= new piano();
ins.play();
ins= new flute();
ins.play();
ins= new guitar();
ins.play();
}
}