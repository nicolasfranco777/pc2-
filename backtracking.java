public class BacktrackingEjemplo {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        backtracking(numeros, 0, new java.util.ArrayList<>());
    }

    // Método principal de backtracking
    public static void backtracking(int[] arr, int index, java.util.List<Integer> camino) {

        // 1. Caso base: si llegamos al final, mostramos la combinación
        if (index == arr.length) {
            System.out.println(camino);
            return;
        }

        // --- Decisión 1: NO incluir el elemento actual ---
        backtracking(arr, index + 1, camino);

        // --- Decisión 2: SÍ incluir el elemento actual ---
        camino.add(arr[index]);             // Elegimos
        backtracking(arr, index + 1, camino); // Recursemos
        
        camino.remove(camino.size() - 1);   // Deshacemos la elección (backtrack)
    }
}
