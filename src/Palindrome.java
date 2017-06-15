public class palindrome {
    public static void main(String[] args) {
        String word = "racecar";
        char[] wordArray = word.toCharArray(); 
        System.out.println(isPalindrom(wordArray));       
    }

    public static boolean isPalindrom(char[] word){
        boolean palindrom = false;
        if(word.length%2 == 0){
            for(int i = 0; i < word.length/2-1; i++){
                if(word[i] != word[word.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }else{
            for(int i = 0; i < (wort.length-1)/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}