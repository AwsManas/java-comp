class prio implements Runnable
{
        int ii;
        public prio(int i)
        {
        ii = i;
        }
        public void run()
        {
        System.out.println(Thread.currentThread().getId()+"  ---  "+Thread.currentThread().getPriority() );
        System.out.println(Thread.currentThread().getId()+"  ---  "+Thread.currentThread().getPriority() );
        Thread.currentThread().setPriority(ii);
        try
        {
        Thread.sleep(1000);
        }
        catch (Exception e)
        {
        System.out.println("F");
        }
         System.out.println(Thread.currentThread().getId()+"  ---  "+Thread.currentThread().getPriority() );
        System.out.println(Thread.currentThread().getId()+"  ---  "+Thread.currentThread().getPriority() );

        }
 public static void main(String a[])
        {
        Thread p1 = new Thread(new prio(4));
        Thread p2 = new Thread(new prio(5));
        Thread p3 = new Thread(new prio(6));
        Thread p4 = new Thread(new prio(1));
        p1.start();
        p2.start();
        p3.start();
        p4.start();

        }
}
              
