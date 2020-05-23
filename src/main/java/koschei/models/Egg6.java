package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private final Needle7 needle7;

    @Autowired
    public Egg6(Needle7 needle71) {
        this.needle7 = needle71;
    }

    @Override
    public String toString() {
        return "в яйце — игла,  " + needle7.toString();
    }
}
