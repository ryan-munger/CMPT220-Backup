import java.io.File;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-19
 */

public class FolderSize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the folder path: ");
        String folderPath = scan.nextLine();
        scan.close();
        File folder = new File(folderPath);
        System.out.println("The size of the folder is: " + folderSize(folder) + " bytes.");
    }

    private static long folderSize(File folder) {
        // base case
        if (folder.isFile())
            return folder.length();
        // get all the files under the folder
        File[] files = folder.listFiles();
        // add all the sizes
        long size = 0;
        for (File file : files)
            size += folderSize(file);
        // return the total
        return size;
    }
}
