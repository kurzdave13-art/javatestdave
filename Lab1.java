import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StopWatch watch = new StopWatch();

        System.out.print("Please enter start1: ");
        input.nextLine();
        watch.start();

        System.out.print("Please enter stop1: ");
        input.nextLine();
        watch.stop();
        long storedElapsedTime1 = watch.getElapsedTime();

        System.out.print("Please enter start2: ");
        input.nextLine();
        watch.start();

        System.out.print("Please enter stop2: ");
        input.nextLine();
        watch.stop();
        long storedElapsedTime2 = watch.getElapsedTime();

        System.out.println("Time elapsed between start1 and stop1: " + storedElapsedTime1 + " milliseconds.");
        System.out.println("Time elapsed between start2 and stop2: " + storedElapsedTime2 + " milliseconds.");
    }
}

class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}

