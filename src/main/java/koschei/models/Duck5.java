package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private final Egg6 egg6;

    @Autowired
    public Duck5(Egg6 egg61) {
        this.egg6 = egg61;
    }

    @Override
    public String toString() {
        return "в утке — яйцо, " + egg6.toString();
    }
}
