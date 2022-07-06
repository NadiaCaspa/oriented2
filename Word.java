public class Word extends Sentence{
    private String noVowelsWord;
    public Word(String s, String w){
        super(s);
        // we do this to take out all the vowels in the sentence
        this.noVowelsWord = w.replaceAll("[aeiouAEIOU]","" );

    }
    public String getNoVowelsWord(){
        return this.noVowelsWord;
    }

    public boolean isSubString(){
        return getSentence().contains(this.noVowelsWord);
    }
}
