package service;

import org.springframework.stereotype.Component;

@Component
public class FooService {
    public void doShortJob() {
        sleep(10l);
    }

    public void doLongJob() {
        sleep(300l);
    }

    public void doSomethingThatThrowsException() {
        throw new RuntimeException("Simulated Exception.");
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
