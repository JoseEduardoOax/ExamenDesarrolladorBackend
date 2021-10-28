package utils;

public enum Peso {
	FALTA_PESO(-1),
	IDEAL(0),
	SOBREPESO(1);

    private int valor;

    private Peso(int i) {
        this.valor = i;
    }
    
    public int getValor() {
    	return valor;
    }
    
    public String toString() {
    	switch(valor) {
    	case -1: return "Falta de Peso";
    	case 0: return "Peso Normal";
    	case 1: return "Sobrepeso";
    	default: return "";
    	}
    }
}
