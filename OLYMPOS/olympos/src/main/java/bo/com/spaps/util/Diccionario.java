package bo.com.spaps.util;

public class Diccionario {
	
	public String valores[];
    public Diccionario(){
        String val[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
		"U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d",
		"e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
		"o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
		"y", "z", "+", "/"};
        valores=val;
    }
    public String getValor(int posicion){
        return valores[posicion];
    }

	
}
