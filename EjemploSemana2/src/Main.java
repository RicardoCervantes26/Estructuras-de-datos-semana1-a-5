
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1. DECLARACIÓN E INICIALIZACIÓN
        // Las estructuras estáticas tienen un tamaño que no cambia durante la ejecución.
        int[] pedidos = {101, 102, 103, 104, 105};
        System.out.println("--- Lista Inicial de Pedidos ---");

        // 2. RECORRIDO
        // Implicar acceder a cada elemento usando un bucle, como el for-each.
        for (int p : pedidos) {
            System.out.println("Pedido ID: " + p);
        }

        // 3. ACTUALIZACIÓN
        // Se accede al índice (ej. el segundo pedido, índice 1) y se cambia el valor.
        int indiceActualizar = 1;
        int nuevoId = 120;
        if (indiceActualizar >= 0 && indiceActualizar < pedidos.length) {
            pedidos[indiceActualizar] = nuevoId;
            System.out.println("\nActualización: Pedido en índice " + indiceActualizar + " cambiado a " + nuevoId);
        }

        // 4. COPIA
        // Crear un nuevo arreglo con los mismos elementos que el original.
        // Usamos .clone() como sugiere el material.
        int[] respaldoPedidos = pedidos.clone();
        System.out.println("Copia: Se ha creado un respaldo de los pedidos actuales.");

        // 5. INSERCIÓN (Simulada)
        // En arreglos estáticos, no se puede insertar directamente por el tamaño fijo.
        // Simulamos la inserción creando un nuevo espacio o desplazando elementos.
        int nuevoPedido = 106;
        int[] nuevosPedidos = new int[pedidos.length + 1];
        System.arraycopy(pedidos, 0, nuevosPedidos, 0, pedidos.length);
        nuevosPedidos[nuevosPedidos.length - 1] = nuevoPedido;
        pedidos = nuevosPedidos; // Apuntamos a la nueva estructura
        System.out.println("Inserción: Se agregó el pedido " + nuevoPedido + " al final.");

        // 6. ELIMINACIÓN (Simulada)
        // Se desplazan elementos para cubrir el espacio del eliminado.
        int indiceEliminar = 0; // Eliminaremos el primer pedido
        if (indiceEliminar >= 0 && indiceEliminar < pedidos.length) {
            int[] tempEliminacion = new int[pedidos.length - 1];
            System.arraycopy(pedidos, 0, tempEliminacion, 0, indiceEliminar);
            System.arraycopy(pedidos, indiceEliminar + 1, tempEliminacion, indiceEliminar, pedidos.length - indiceEliminar - 1);
            pedidos = tempEliminacion;
            System.out.println("Eliminación: Se eliminó el pedido en el índice " + indiceEliminar);
        }

        // RECORRIDO FINAL PARA VERIFICAR CAMBIOS
        System.out.println("\n--- Lista Final de Pedidos ---");
        for (int p : pedidos) {
            System.out.println("Pedido ID: " + p);
        }
    }
}
