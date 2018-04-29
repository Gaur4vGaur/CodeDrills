package ps.thread;

public class Countries {

    public static void main(String[] args) {
	String[] countries = {"India", "UK", "Canada", "USA", "France", "Germany"};
	
	for(String c : countries) {
	    ThreadGreetings g = new ThreadGreetings(c);
	    g.start();
	}

	System.out.println("---------------------------");

	for(String c : countries) {
	    RunnableGreetings rg = new RunnableGreetings(c);
	    new Thread(rg).start();
	}
    }

}

class ThreadGreetings extends Thread {

    private String country;

    public ThreadGreetings(String country) {
        this.country = country;
    }

    public void run() {
	System.out.println("Hi: " + country);
    }
}

class RunnableGreetings implements Runnable {
    private String country;

    public RunnableGreetings(String country) {
        this.country = country;
    }

    public void run() {
	System.out.println("Hi: " + country);
    }
}
