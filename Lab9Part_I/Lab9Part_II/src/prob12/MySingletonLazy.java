package prob12;

import java.util.Optional;
import java.util.function.Supplier;

public class MySingletonLazy {

    private static MySingletonLazy instance = null;

    private MySingletonLazy(){

    }

    public static MySingletonLazy getInstance(){
//       instance = new MySingletonLazy();
//       return instance;

        return Optional.ofNullable(instance).orElseGet(() -> new MySingletonLazy());
    }

    public static void main(String[] args) {

//        System.out.println(Optional.ofNullable(instance).orElseGet(MySingletonLazy::getInstance));
        System.out.println(MySingletonLazy.getInstance());
    }
}
