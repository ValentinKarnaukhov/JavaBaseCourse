/**
 * Created by Valentin on 25.06.2017.
 */
public class Inspector implements MailService {
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage) {
            MailPackage pack = (MailPackage) mail;
            if(pack.getContent().getContent().equals(WEAPONS)||pack.getContent().getContent().equals(BANNED_SUBSTANCE))
                throw new IllegalPackageException();
            else if(pack.getContent().getContent().contains("stones"))throw new StolenPackageException();
        }
        return mail;

    }
}
