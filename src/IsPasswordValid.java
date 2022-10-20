import java.util.Scanner;

public class IsPasswordValid {

    public static boolean isValid(String password){
        boolean result = false;
        if(password.length() >= 8 && password.length() <= 16){
            int credentialRequirementCount = 0;
            for(int i = 97; i <= 122; i++ ){
                String lowercaseChar = Character.toString((char) i);
                if(password.contains(lowercaseChar)){
                    credentialRequirementCount++;
                    break;
                }
            }
            for(int i = 65; i <= 90; i++){
                String upperCaseChar = Character.toString((char) i);
                if(password.contains(upperCaseChar)){
                    credentialRequirementCount++;
                    break;
                }
            }
            for(int i = 48; i<= 57; i++){
                String numChar = Character.toString((char) i);
                if(password.contains(numChar)){
                    credentialRequirementCount++;
                    break;
                }
            }
            for(int i = 33; i <=47; i++){
                String ranChar = Character.toString((char) i);
                if(password.contains(ranChar)){
                    credentialRequirementCount++;
                    break;
                }
            }

            if(credentialRequirementCount > 2){
                result = true;
                System.out.println(credentialRequirementCount);
            }
            return result;
        }else{
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner newPassword = new Scanner(System.in);
        System.out.println("Please input a new password");
        String passWord = newPassword.nextLine();
        newPassword.close();
        if(isValid(passWord)){
            System.out.println(passWord +  " is a strong password ");
        }else{
            System.out.println(passWord + " is not a strong password - please try again");
        }

    }
}
