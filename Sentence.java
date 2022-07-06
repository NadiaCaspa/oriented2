public class Sentence {
    private String sentence;

    public Sentence(String sentence){
      this.sentence = sentence;
    }
    public String getSentence(){
        return this.sentence;
    }
    @Override
    public boolean equals( Object s ){
        if(this.sentence ==  s){
           return true;
        }
        else{
            return false;
        }
    }

}
