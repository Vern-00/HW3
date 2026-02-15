class WordFreq {
    String word;
    int frequency;

    WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }
}

public class MaxHeapExample {
    static void maxHeapify(WordFreq[] arr, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heapSize && arr[left].frequency > arr[largest].frequency) {
            largest = left;
        }
        if (right < heapSize && arr[right].frequency > arr[largest].frequency) {
            largest = right;
        }
    }

    // Standard BUILD-MAX-HEAP (bottom-up)
    static void buildMaxHeap(WordFreq[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    public static void main(String[] args) {

    }
}
