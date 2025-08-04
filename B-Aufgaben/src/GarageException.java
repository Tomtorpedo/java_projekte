public class GarageException extends Exception{

    GarageException() {}
    GarageException(String Message) {
        super(Message);
    }
    GarageException(Throwable cause) {
        super(cause);
    }
    GarageException(String message, Throwable cause) {
        super(message,cause);
    }
}
