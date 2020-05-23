package koschei.models;

import koschei.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Island2 {

    @Autowired
    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }


    @Override
    public String toString() {
        return "на том острове дуб стоит, " + wood.toString();
    }
}
