public class PracticeException {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int[] arr= {1,2,34,5,6,6,0};
        try {
//            System.out.println(a / b);
            System.out.println(arr[8]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Endha payanum ila");
        }
    }
}
//Exception: An exception is an event that disrupts the normal flow of
// a program's instruction during execution
