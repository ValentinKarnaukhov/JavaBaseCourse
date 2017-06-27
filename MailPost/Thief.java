/**
 * Created by Valentin on 23.06.2017.
 */
public class Thief implements MailService {
    int stolenValue=0;
    int cost;
    public Thief(int cost) {
        this.cost=cost;
    }
    public int getStolenValue(){
        return stolenValue;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getPrice() >= cost) {
                stolenValue += mailPackage.getContent().getPrice();
                return new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), new Package("stones instead of " + mailPackage.getContent().getContent(), 0));
            }
        }
        return mail;
    }
}
