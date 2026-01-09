public class LimitedAwesomeString extends AwesomeString  {

    int limit;
    LimitedAwesomeString(int inputLimit){
        super(5);
        this.limit = inputLimit;
    }

    LimitedAwesomeString(String inputString , int inputLimit){
        super(inputString);
        this.limit = inputLimit;
    }
}
