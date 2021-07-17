package io.github.himankbatra.java9.trywithresources;

public class App {

    public static void main(String[] args) {

        MyWorker worker = new MyWorker();

        try (worker) {
            worker.doSomething();
        } catch (Exception ignored) {
        }
    }
}
