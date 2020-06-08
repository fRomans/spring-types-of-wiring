package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private final Deth8 deth8;
    private Needle7 needle7;

    public void setNeedle7(Needle7 needle7) {
        this.needle7 = needle7;
    }





    @Autowired
    public Needle7(Deth8 deth81) {
        this.deth8 = deth81;
    }

    @Override
    public String toString() {
        return "— "+ deth8.toString();
    }
}
