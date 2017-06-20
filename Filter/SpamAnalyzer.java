/**
 * Created by Valentin on 20.06.2017.
 */
public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{

    private String[] keywords;



    public SpamAnalyzer(String[] keywords) {
        this.keywords=keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }



    @Override
    public Label processText(String text) {
        int c=0;
        for(int i=0;i<keywords.length;i++){
            if(text.contains(keywords[i]))c++;
        }
        if(c!=0)return Label.SPAM;
        else return Label.OK;

    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;

    }
}
