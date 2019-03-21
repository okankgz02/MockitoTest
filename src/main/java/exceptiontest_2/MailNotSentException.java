package exceptiontest_2;

public class MailNotSentException extends RuntimeException {
    public MailNotSentException(String mesaj) {
        super(mesaj);
    }
}
