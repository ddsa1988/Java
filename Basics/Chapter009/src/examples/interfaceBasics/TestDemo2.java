package examples.interfaceBasics;

import java.util.Arrays;
import java.util.List;

public class TestDemo2 {
    public static void userMain() {
        Client client = new Client();
        AnotherClient anotherClient = new AnotherClient();

        List<ICallback> objs = Arrays.asList(client, anotherClient);

        for (int i = 0; i < objs.size(); i++) {
            ICallback obj = objs.get(i);
            obj.callback(10 + i);
        }
    }
}
