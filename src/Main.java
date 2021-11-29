public class Main
{

    public static void main(String[] args)
    {
	    run();
    }

    public static void run()
    {
        Car myCar = new Car();

       myCar.start();

        for (int i = 0; i < 14; i++)
        {
            myCar.accelerate(1);
        }

        for (int i = 0; i < 100; i++)
        {
            myCar.accelerate(3);
        }

        System.out.println(myCar);





    }


}
