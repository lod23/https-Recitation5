public class EmailValidator {
    public static final String PRINTABLE_CHAR = "!#$%&'*+-/=?^_`{|}~";
    public static final char DOT = '.';
    public static final char HYPHEN = '-';
    public static final char AT = '@';

    // Add your enumerated states after this line
//    private static final Pattern EMAIL_PATTERN = Pattern.compile(
//            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
//    );

    public static boolean isEmailValid(String address) {
        // TODO: replace this line with your code
        int count = 0;
        int totalDomainCount = 0;
        char ch;

        for (int index = 0; index < address.length(); index++){
            ch = address.charAt(index);


            if (index == 0 && ch == DOT) {
                return false;

            }
            //if ch is a DOT and next is also a DOT
            if (index == 0 && ch == DOT){
                if(address.charAt(index + 1) == DOT || (address.charAt(index + 1) == AT){
                    return false;
                }

            }
            count++;

        }
        return false;
    }
}