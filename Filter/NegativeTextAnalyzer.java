/**
 * Created by Valentin on 20.06.2017.
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{

    public NegativeTextAnalyzer() {
    }

    private String[] keywords=new String[]{":(","=(",":|"};


    @Override
    public Label processText(String text) {
        int c=0;
        for(int i=0;i<3;i++){
            if(text.contains(keywords[i]))c++;
        }
        if(c!=0)return Label.NEGATIVE_TEXT;
        else return Label.OK;
    }
    @Override
    protected Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords(){
        return keywords;
    }
}
