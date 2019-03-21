package exceptiontest_2;

public class MailServis {
    public void mailGönder(){
        System.out.println("mail gönderildi");
    }
    public void adminMailGönder(){
        throw new MailNotSentException("gönderilmedi");
    }

    public void adminHataliİslen(){
        throw new HataliException("hatali");
    }
}
