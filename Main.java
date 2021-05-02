import java.io.*;
public class Main
{
    public static boolean isShuffle(String X, String Y, String S)
    {
        if (X.length() == 0 && Y.length() == 0 && S.length() == 0) {
            return true;
        }
        
        if (S.length() == 0) {
            return false;
        }
        
        if (X.length() != 0 && S.charAt(0) == X.charAt(0)) {
            return isShuffle(X.substring(1), Y, S.substring(1));
        }
 
        if (Y.length() != 0 && S.charAt(0) == Y.charAt(0)) {
            return isShuffle(X, Y.substring(1), S.substring(1));
        }
 
        return false;
    }
 
    public static void main(String[] args)
    {
        String X = "egh";
        String Y = "yu";
        String S = "eghyu";
 
        if (isShuffle(X, Y, S)) {
            System.out.print("The third string is valid shuffle of first and second String.");
        }
        else {
            System.out.print("The third string is not valid shuffle of first and second String.");
        }
    }
}