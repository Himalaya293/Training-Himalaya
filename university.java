class university{
    static class department{
   void announcement(){
    System.out.println("exam date has to be announced");
    }
    static void result(){
    System.out.println("result kept in website");
    }
    }
}
class nested{
  public static void main(String []args)
    {
       university.department  uni=new university.department(); 
       uni.announcement();
       university.department.result();
   }
}