package HideAndSeekPackage;

/**
 * @author Marissa Gonçalves
 * Date: April 18, 2018
 * Purpose: Reverses the message from plaintext to ciphertext, and vice versa.
 */
public class ReverseCipher implements HideAndSeek
{
    /**
     * The number of characters that be reversed in every sequence.
     */
    private int key;
    
    /**
     * Initializes the instance variable key, with the value from the driver class.
     * @param key The called key value from the driver class.
     */
    public ReverseCipher(int key) 
    {
        if (key > 0)
        {
            this.key = key;
        }

        else
        {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Encrypts the String message from plaintext to ciphertext in a reverse method.
     * @param message The plaintext called from the driver class.
     * @return The String array of the encrypted plaintext (reversed).
     */
    @Override
    public String hide(String message) 
    {
        
         char[] array = message.toCharArray();
         
         for (int i = 0; i < array.length; i += this.key)
         {
             int left = i;
             int right = Math.min(i + this.key - 1, array.length - 1);
             
             reverse(array, left, right);          
         }
         
         return new String(array);
        
    }

    /**
     * Decrypts the String message from ciphertext to plaintext in a reverse method.
     * @param message The plaintext called from the driver class.
     * @return The String array of the decryption from the called plaintext/message.
     */
    @Override
    public String seek(String message) 
    {
        return hide(message);
    }
    
    /**
     * Using recursion, reverses the text segment starting form a left index to a right index, inclusively.
     * @param str The string that includes the segment to be reversed.
     * @param left The index of the left end of the segment.
     * @param right The index of the right end of the segment.
     * @return The reversed message of the text segment from the driver class.
     */
    private static String reverse(char[] array, int left, int right)
    {  
       
       while (left <= right)
       {
           char temp = array[left];
           array[left] = array[right];
           array[right] = temp;
           ++left;
           --right;
       }
        
       return new String(array);

    }
    
}
