/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * @author Spencer Gilbert collab with probably Prof. Challen
 */

public class ReclamationProject {

    /**
     *
     * @param args main string argument
     */
    public static void main(final String[]args) {
        System.out.println(doIt("hello", "helloworld"));
    }

    /**
    *
    * @param str1 the first string parameter
    * @param str2 the second string parameter
    * @return String
    */

    public static String doIt(final String str1, final String str2) {
        String higher = "";
        String lower = "";
        if (str1.length() > str2.length()) {
            higher = str1;
            lower = str2;
        } else {
            higher = str2;
            lower = str1;
        }
        String r = "";
        //Loop through the larger string
        for (int i = 0; i < higher.length(); i++) {
            //Loop through the amount of characters to check in region matches
            for (int j = higher.length() - i; j > 0; j--) {
                //Looping through the offset of the string argument in region matches
                for (int k = 0; k < lower.length() - j + 1; k++) {
                    if (higher.regionMatches(i, lower, k, j) && j > r.length()) {
                        r = higher.substring(i, i + j); //Finds the largest common substring
                    }
                }
            }
        }
        return r;
    }
}
