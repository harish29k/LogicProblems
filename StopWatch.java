package logicalproblems;

/*
*Simulate Stopwatch Program
*/
public class StopWatch {
	private long start;
    public void Stopwatch() {
        start = System.currentTimeMillis();
    }
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StopWatch timer1 = new StopWatch();
        double sum1 = 0.0;
        for (int i = 1; i <= n; i++) {
            sum1 += Math.sqrt(i);
        }
        double time1 = timer1.elapsedTime();
        System.out.println("the elapsedTime is " +sum1 +time1);

        StopWatch timer2 = new StopWatch();
        double sum2 = 0.0;
        for (int i = 1; i <= n; i++) {
            sum2 += Math.pow(i, 0.5);
        }
        double time2 = timer2.elapsedTime();
        System.out.println("the elapsedTime is " +sum2 +time2);
       
    }
}
