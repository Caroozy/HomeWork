package series3;

import java.time.LocalDateTime;

public class CompanySystemException extends Exception {

    public CompanySystemException(String msg){
        super(msg+" has occurred in: "+Helper.format(LocalDateTime.now()));
    }
}
