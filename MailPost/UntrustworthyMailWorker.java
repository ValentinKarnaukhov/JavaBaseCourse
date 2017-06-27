/**
 * Created by Valentin on 23.06.2017.
 */
public class UntrustworthyMailWorker implements MailService{
    RealMailService mailService=new RealMailService();
    MailService[] mailServices;
    @Override
    public Sendable processMail(Sendable mail) {
        Sendable smail=mail;
        for(MailService service:mailServices){
            smail=service.processMail(smail);
        }
        return  mailService.processMail(smail);
    }

    public UntrustworthyMailWorker(MailService[] mailServices){
        this.mailServices = mailServices;
    }
    public RealMailService getRealMailService(){
        return mailService;
    }


}
