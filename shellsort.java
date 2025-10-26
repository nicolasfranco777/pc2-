public class shellsort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        // Comenzamos con un gap grande y lo reducimos en cada pasada
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Recorremos desde 'gap' hasta el final del arreglo
            for (int i = gap; i < n; i++) {
                int temp = arr[i]; // Guardamos el valor actual
                int j = i;
                // Desplazamos los elementos que están a 'gap' posiciones si son mayores que temp
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            } 
        }
    }
    public static void main(String[] args) {
        int[] arr = {23, 12, 1, 8, 34, 54, 2, 3};
        System.out.println("Arreglo original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        shellSort(arr);
        System.out.println("\n\nArreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
