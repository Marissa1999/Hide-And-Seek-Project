package HideAndSeekPackage;

/**
 * @author Marissa Gonçalves
 * Date: April 18, 2018
 * Purpose: Specifies two methods named hide() and seek() for other implemented classes to use.
 */
interface HideAndSeek
{
    
    /**
     * Returns an encrypted version of a message as a ciphertext String
     * @param message The message as a plaintext.
     * @return The encrypted code of the plaintext.
     */
    String hide(String message);

    /**
     * Returns a decrypted version of a message as a plaintext String
     * @param message The message as a ciphertext.
     * @return The decrypted code of the ciphertext.
     */
    String seek(String message);
       
}