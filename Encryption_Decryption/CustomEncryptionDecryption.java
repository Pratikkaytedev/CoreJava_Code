package Encryption_Decryption;

public class CustomEncryptionDecryption {

    public static void main(String[] args) {

        String value="Hello World";

        int secret_key= 8;
        System.out.println("before encryption "+ value);
        String encrypt = forEncryption(value,secret_key);
        System.out.println("after Encryption "+ encrypt);

        String decrypt = forDecryption(encrypt,secret_key);
        System.out.println("after decryption "+ decrypt);


    }

    private static String getDencryptedValue(String encrypt,int secret_Key){

        String decrypt ="";

        for(int i=0;i<encrypt.length();i++){
            char ch = encrypt.charAt(i);
            ch -= secret_Key;
            decrypt = decrypt+ch;
        }

        return decrypt;
    }

    private static String getEncryptedValue(String value,int secret_key){
        String encrypt = "";
        for(int i=0;i<value.length();i++){
            char ch = value.charAt(i);
            ch +=secret_key;
            encrypt = encrypt+ch;
        }

        return encrypt;
    }


    public static  String forEncryption(String value,int secret_key){

        String encrypted="";

        for(int i=0;i<value.length();i++){
            char ch = value.charAt(i);
            ch += secret_key;
            encrypted = encrypted+ch;
        }

        return encrypted;
    }

    private static String forDecryption(String encypted,int secret_key){

        String decrypted="";

        for(int i=0;i<encypted.length();i++){
            char ch = encypted.charAt(i);
            ch -= secret_key;
            decrypted = decrypted+ch;

        }


        return decrypted;
    }




}
