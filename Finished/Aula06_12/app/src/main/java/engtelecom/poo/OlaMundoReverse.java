package engtelecom.poo;

public class OlaMundoReverse extends Thread {
    private int x;

    /**
     * @param name
     * @param x
     */
    public OlaMundoReverse(String name, int x) {
        super(name);
        this.x = x;
    }

    @Override
    public void run() {
        if (this.x < 10) {
            this.x++;
            OlaMundoReverse o = new OlaMundoReverse(getName(), this.x);
            o.start();
            try {
                o.join();
                System.err.println(this.getName() + "-" + this.x);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        
    }

}
