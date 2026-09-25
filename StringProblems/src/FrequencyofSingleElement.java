public class FrequencyofSingleElement {
    public static void main(String[] args) {
        int[] arr={75,80, 75, 90, 85, 75, 60, 80};
        int freq=75,freqcount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==freq) freqcount++;
        }
        System.out.println(freqcount);
    }
}
