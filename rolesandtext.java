
//Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
import static java.lang.Math.abs;

public class Hello {

    public static void main(String[] args) throws Exception {
        String[] roles={"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич"};
        String[] text={"Лука Лукич:","Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.","Аммос Федорович: Как ревизор?","Артемий Филиппович: Как ревизор?","Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.","Аммос Федорович: Вот те на!","Артемий Филиппович: Вот не было заботы, так подай!","Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(pali(roles,text));



    }

    public static String pali(String[] a, String[] b) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<a.length;i++){
            String name=a[i]+":";
            res=res.append(name+"\n");
            for(int j=0;j<b.length;j++) {
                if(b[j].startsWith(name)){
                    res=res.append(String.valueOf(j+1)+")"+b[j].substring(name.length())+"\n");
                }
            }
            res=res.append("\n");
        }
        return res.toString();

    }
}