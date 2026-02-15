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

        if (largest != i) {
            WordFreq tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            maxHeapify(arr, heapSize, largest);
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
        WordFreq[] data = {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700)
        };

        buildMaxHeap(data);
    }
}
