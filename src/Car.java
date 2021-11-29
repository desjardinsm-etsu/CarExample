public class Car
{
    private double speed;
    private int gear;
    private boolean on;
    private int rpm;

    public Car()
    {
        this.speed = 0;
        this.gear = 1;
        on = false;
        rpm = 0;
    }

    public void start()
    {
        rpm = 1500;
        on = true;
    }

    public void accelerate(int peddlePressure)
    {
        if(on)
        {
            if (peddlePressure == 1)
            {
                changeRPM(100);
                speed+= .5;

            }
            else if (peddlePressure == 2)
            {
                changeRPM(200);
                speed += (.5 * 2);
            }
            else
            {
                changeRPM(300);
                speed += (.5 * 3);
            }
        }
    }
    public void checkChangeGear()
    {
        if(rpm >= 3000 && gear < 7 && on)
        {
            gear ++;
            rpm = 1500;
        }
        else if(rpm <= 1500 && gear > 1 && on)
        {
            gear--;
            rpm = 1500;
        }

    }
    public void changeRPM(int input)
    {
        rpm += input;
        checkChangeGear();
    }

    public String toString()
    {
        String msg = "";

        msg += "On: " + on;
        msg += "\nGear:" + gear;
        msg += "\nRPM: " + rpm;
        msg += "\nSpeed: " + (int)Math.round(speed);

       return msg;
    }
}
