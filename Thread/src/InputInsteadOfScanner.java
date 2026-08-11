import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InputInsteadOfScanner {
    public static void main(String[] args) {
        FastBufferReader in=new FastBufferReader();
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
    static class FastBufferReader{
        BufferedReader br;
        StringTokenizer st;
        public FastBufferReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st==null || !st.hasMoreElements()){
                try {
                    String line=br.readLine();
                    if (line==null) return null;
                    st=new StringTokenizer(line);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
