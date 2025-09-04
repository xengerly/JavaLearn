public class WrongWordsCountException extends RuntimeException{
    int words;
    WrongWordsCountException(int wordsInput){
        this.words = wordsInput;
    }
}
