package OnlineShopping;

import java.io.IOException;

public class InvaildExpection extends IOException {
    public InvaildExpection(String errorMassage){
        super(errorMassage);
    }
}
