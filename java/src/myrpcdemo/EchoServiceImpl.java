package myrpcdemo;

public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String input)  {
        return String.format("echo: %s", input);
    }

    @Override
    public Integer calc(Integer var1, Integer var2) {
        return var1 + var2;
    }
}
