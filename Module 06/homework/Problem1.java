import java.util.Scanner;

public class Problem1{
    public static void main(String[] args){
        // Collect User Data
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the text to analyze: ");
        String total = scan.nextLine();
        scan.close();

        // call method
        System.out.println("The characters in the text are:");
        charList(total); 
    }
    
    /** Prints all unique chars and their frequencies from a string
     * 
     * @param total
     */
    private static void charList(String total) {
        char [] charList = new char[total.length()];
        int [] frequency = new int[total.length()];
        int rptIndex;
        
        /** loop  through each character, check if it is repeat
        * if not, add it to the list and increase frequency
        * if so, increase the correct index of frequency
        */
        for(int i = 0; i < charList.length; i++){
            rptIndex = repeatIndex(charList, total.charAt(i), i);
            if(rptIndex == -1){
                if(total.charAt(i) != ' ' && total.charAt(i) != '.' && total.charAt(i) != '?' && total.charAt(i) != '!')
                    charList[i] = total.charAt(i);
                    frequency[i]++;
            }else
                frequency[rptIndex]++;     
        }

        // print our results formatted for the user
        for(int i = 0; i < total.length(); i++){
            if(charList[i] != 0)
                System.out.printf("%c %d \n", charList[i], frequency[i]);
        }
    }
   
    /**Finds the index of a character in a list, if not there returns -1
     * @param charList
     * @param check
     * @param depth
     * @return Returns index, -1 if N/A
     */
    private static int repeatIndex(char[] charList, char check, int depth) {
        for(int i = 0; i < depth; i++){
            if(charList[i] == check)
                return i;
        }
        return -1;
    }
}