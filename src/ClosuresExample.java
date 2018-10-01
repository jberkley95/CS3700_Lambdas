/**
 * @author John Berkley
 * CPP Class: <Insert Class Here>
 * Date Created: Oct 01, 2018
 */
public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(a, (i) -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
