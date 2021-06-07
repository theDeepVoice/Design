package State;

public class ClientClass {
    public static void main(String[] args) {
        ThreadContext tc =new ThreadContext();
        tc.start();
        tc.getCPU();
        tc.stop();
    }
}
