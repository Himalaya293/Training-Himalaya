class animals{
   void dog(){
    System.out.println("it barks");
     birds pea=new birds();
     pea.peacock();
     }
    class birds{
      void peacock(){System.out.println("national bird");}
    }
}
class nested{
  public static void main(String []args)
    {
       animals ani=new animals();
       ani.dog();
   }
}