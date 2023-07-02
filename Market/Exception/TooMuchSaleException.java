package Exception;

public class TooMuchSaleException extends Exception {
    public TooMuchSaleException() {
    }

    public TooMuchSaleException(String msg) {
        super(msg);
    }
}
