package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.loading.PrivateClassLoader;

public class Tablero {
	private Map<Byte, Casilla> tablero = new HashMap<>();
	public Tablero() {
		inicializar();
	}
	
	private void inicializar() {
		for(byte indice = 1; indice <= 9; indice++) {
			tablero.put(indice, new Casilla(indice));
		}
	}
	public Map<Byte, Casilla> cloneTablero(){
		Map<Byte, Casilla> tablero = new HashMap<>();
		for(byte indice = 1; indice <= 9; indice++) {
			tablero.put(indice, this.tablero.get(indice).getCasilla());
		}
		return tablero;
	}
	
	private boolean ternaEsValida(byte posicionUno,byte posicionDos,byte posicionTres) {
		List<String> valoresTernaList = new ArrayList<>();
		valoresTernaList.add(tablero.get(posicionUno).getSimbolo());
		valoresTernaList.add(tablero.get(posicionDos).getSimbolo());
		valoresTernaList.add(tablero.get(posicionTres).getSimbolo());
		
		return casilla.stream().map(Casilla::getSimbolo).distinct().count() == 1 && casillas.get(0).estaMarcada();
	}
}
