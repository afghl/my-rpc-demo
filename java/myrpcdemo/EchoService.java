package myrpcdemo;

public interface EchoService {
    default String echo(String input) {
        return String.format("echo: %s", input);
    }
}
