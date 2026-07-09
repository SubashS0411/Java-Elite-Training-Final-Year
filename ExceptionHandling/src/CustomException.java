public class CustomException {
    public static void main(String[] args) {
        try {
            intCheckAge(1);
        } catch (InvalidException e) {
            System.out.println(e.getMessage());;
        }
    }
   public static void intCheckAge(int age) throws InvalidException {
        if(age<18){
            throw new InvalidException("Age should be greater than 18");
        }
   }
}
class InvalidException extends Exception{
    public InvalidException(String message){
        super(message);
    }
}