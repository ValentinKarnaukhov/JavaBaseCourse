/**
 * Created by Valentin on 20.06.2017.
 */
public abstract class KeywordAnalyzer implements TextAnalyzer {

   protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text) {
        return null;
    }


}
