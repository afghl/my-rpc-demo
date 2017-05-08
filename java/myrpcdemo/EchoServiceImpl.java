package myrpcdemo;

public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String input)  {
        return String.format("echo: %s", input);
    }
}
