class threads implements Runnable
{//     private  boolean exit = false;
        int id;
        public threads(int i)
        {
        id = i;
        }
//      public void stop() {
  //       exit = true;
   //     }
        public void run()
        {
//      while(!exit)
//      {
        try{
        System.out.println("Executing this thread - "+Thread.currentThread().getId());
        System.out.println("Executing this thread - "+Thread.currentThread().getId());
        System.out.println("Executing this thread - "+Thread.currentThread().getId());
        if(id==1)
        Thread.sleep(1000);
        System.out.println("Executing this thread - "+Thread.currentThread().getId());
        System.out.println("Executing this thread - "+Thread.currentThread().getId());
        }
        catch (InterruptedException e)
        {
        System.out.println("Exception occured ");
        }
        }
//      }
        public static void main(String a[])
        {
                Thread p1 = new Thread(new threads(1));
                Thread p2 = new Thread(new threads(0));
                Thread p3 = new Thread(new threads(0));
               // Thread p4 = new Thread(new threads());
                p1.start();
                Thread.yield();
                p2.start();
                p3.start();
                p1.stop();
                p2.stop();
                p3.stop();
        //      p2.stop();
        //      p4.start();
        }
}
          
