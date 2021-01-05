package HideAndSeekPackage;

/**
 * @author Marissa Gonçalves
 * Date: April 18, 2018
 * Purpose: Runs the encrypting/decrypting interface. HideAndSeek and classes, ShuffleCipher and RevereseCipher.
 */
public class HideAndSeekDriver 
{

    /**
     * Demonstrates polymorphism throughout variables of the interface, HideAndSeek
     * @param hs References any object that implements the HideAndSeek interface.
     * @param message Prints the message in plaintext.
     */
    public static void testInterfacePolymorphism(HideAndSeek hs, String message)
    {
        System.out.printf("%15s %s length: %d%n", "Who Am I?", hs.getClass().getName(), message.length());
        System.out.printf("%15s: %s%n", "From Plaintext", message);
        
        String encryptedMessage = hs.hide(message);
        System.out.printf("%15s: %s%n", "To Ciphertext", encryptedMessage);
        
        String decryptedMessage = hs.seek(encryptedMessage);
        System.out.printf("%15s: %s%n", "And Back Again", decryptedMessage);
    }
    
    /**
     * Compiles and runs the plaintext/ciphertext program.
     * @param args The classic statement to name an array of String characters in a driver class.
     */
    public static void main(String[] args)
    {
        String message = "You are from Parish";
        
        ReverseCipher rc = new ReverseCipher(3); //key = 3
        //Of course, we can diresctly call rc's hide and seek methods here.
        //However, we want to practice polymorphism.
        //In the following call, rc will be recieved by a HideAndSeek parameter.
        testInterfacePolymorphism((HideAndSeek) rc, message);
        System.out.println();
        
        ShuffleCipher sc = new ShuffleCipher();
        
        //In the following call, sc will be received by a HideAndSeek parameter.
        testInterfacePolymorphism( sc, message);
        System.out.println();
    }
 
}
