import java.util.Stack;

public class Pila {
    private Stack<Integer> pila;

    public Pila() {
        pila = new Stack<Integer>();
    }

    public void insertar(Integer dato) {
        pila.push(dato);
    }

    public Integer eliminar() throws Exception {
        if (pila.empty()) {
            throw new Exception("Pila vacia");
        }
        return pila.pop();
    }

    public Integer consultaTope() throws Exception {
        if (pila.empty())
            throw new Exception("Pila vacia");
        return pila.peek();
    }

    @Override
    public String toString() {
        String resultado= "===PILA===\n";
        for (int i=pila.size() ; i>=0 ; i--){

            resultado+=pila.get(i)+"\n";
        }
        return  resultado;
    }
}

