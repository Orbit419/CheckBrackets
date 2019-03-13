public class CheckBrackets {
    public static boolean checkBrackets(String text) {
        boolean result = true;
        if (text == null)
            return true;
        char[] arr = text.toCharArray();

        for(int x = 0; x < arr.length; x++) {
            if (arr[x] == ')')
                return false;
            if (arr[x] == '(') {
                result = false;
                for(int y = x; y < arr.length; y++) {
                    if (arr[y] == ')') {
                        arr[x] = '.';
                        arr[y] = '.';
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
