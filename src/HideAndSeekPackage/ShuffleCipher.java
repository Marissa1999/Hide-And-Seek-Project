package HideAndSeekPackage;

/**
 * @author Marissa Gonçalves
 * Date: April 18, 2018
 * Purpose: Shuffles the message from plaintext to ciphertext, and vice versa.
 */
public class ShuffleCipher implements HideAndSeek
{

    /**
     * Encrypts the String message from plaintext to ciphertext in a shuffled method.
     * @param message The plaintext called from the driver class.
     * @return The String array of the encrypted plaintext (shuffled).
     */
    @Override
    public String hide(String message) 
    {
        
        char[] plainArray = message.toCharArray();
        char[] cipherArray = new char[plainArray.length];
        int middle = plainArray.length / 2;
        
       
             for (int k = 0; k < plainArray.length; k++)
             {    
            
                 if (k % 2 != 0)
                 {
                    cipherArray[k] = plainArray[(k / 2)];
                 }
            
                 else
                 {
                    cipherArray[k] = plainArray[middle + (k / 2)];
                 }
               
             
             }  
        
        return new String(cipherArray);
        
    }

    /**
     * Decrypts the String message from ciphertext to plaintext in a shuffled method.
     * @param message The plaintext called from the driver class.
     * @return The String array of the decryption from the called plaintext/message.
     */
    @Override
    public String seek(String message) 
    {
        
        char[] cipherArray = message.toCharArray();
        char[] plainArray = new char[cipherArray.length];
        int middle = plainArray.length / 2;
        
       
             for (int k = 0; k < cipherArray.length; k++)
             {    
            
                 if (k < middle)
                 {
                    plainArray[k] = cipherArray[(k * 2) + 1];
                 }
            
                 else
                 {
                    plainArray[k] = cipherArray[(k - middle) * 2];
                 }
                 
             } 
             
         return new String(plainArray);
    }
    
    
    
}

   