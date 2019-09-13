package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        //implement here
        for (int j = 1; j < array.length; j++) {
            int min = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > min)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = min;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }




    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int a = array.length;
        int temp = 0;

        for (int i = 0; i < a; i++) {
            for (int b = 1; b < (a - i); b++) {
                if (array[b - 1] > array[b]) {
                    temp = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }



    public int [] mergeSort(int [] array, int size){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (size >= 2) {
            int mid = size / 2;
            int[] left = new int[mid];
            int[] right = new int[size - mid];
            for (int i = 0; i < left.length; i++)
                left[i] = array[i];
            for (int j = mid; j < size; j++)
                right[j - mid] = array[j];
            mergeSort(left, mid);
            mergeSort(right, size - mid);
            merge(array, left, right, mid, size - mid);
        }
        final long endTime = (int) System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        

        return list;
    }
    public void merge(int[] array, int[] left, int[] right, int low, int high) {
        int i = 0, j = 0, k = 0;

        while (i < low && j < high) {
            if (left[i] <= right[j])
                array[k++] = left[i++];
            else
                array[k++] = right[j++];
        }
        while (i < low) {
            array[k++] = left[i++];
        }
        while (j < high) {
            array[k++] = right[j++];
        }

    }
    

    public int [] quickSort(int [] array, int low, int high) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if(low < high){
            int next = partition(array, low, high);
            quickSort(array, low, next-1);
            quickSort(array, next+1, high);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int partition(int array[], int p, int r){
        int part = p-1;
        int pivot = array[r];
        for(int i=p; i <= r; i++){
            if(array[i] <= pivot){
                part++;
                if(part != i){
                    array[part] = array[part] ^ array[i];
                    array[i] = array[part] ^ array[i];
                    array[part] = array[part] ^ array[i];
                }
            }
        }
        return part;
    }


    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        

        return list;
    }


    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
