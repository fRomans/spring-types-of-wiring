package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private final Deth8 deth8;

    @Autowired
    public Needle7(Deth8 deth81) {
        this.deth8 = deth81;
    }

    @Override
    public String toString() {
        return "— "+ deth8.toString();
    }
}
