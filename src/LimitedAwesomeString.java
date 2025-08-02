public class LimitedAwesomeString extends AwesomeString {
    int limit;

    LimitedAwesomeString(int inputLimit) {
        this.limit = inputLimit;
    }

    LimitedAwesomeString(String inputString, int inputLimit) {
        this.limit = inputLimit;
    }
}
