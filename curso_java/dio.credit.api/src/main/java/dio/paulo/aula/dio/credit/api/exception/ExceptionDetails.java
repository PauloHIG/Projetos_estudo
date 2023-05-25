package dio.paulo.aula.dio.credit.api.exception;

import java.time.LocalDateTime;
import java.util.Map;

public class ExceptionDetails {
    public String title;
    public LocalDateTime timeStamp;
    public int status;
    public String exception;
    public Map<String,String> details;
}
