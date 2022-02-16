package com.passwordgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
//		
//		Runtime garbage = Runtime.getRuntime();
//		System.out.println(garbage.totalMemory());
//	    garbage.gc();
//	    System.out.println(garbage.totalMemory());
//	    garbage.gc();
//	    System.out.println(garbage.freeMemory());
//		String alias = Dictionary.cargarAlias();
//		System.out.println(alias);

//		List<String> palabrasAlias = new ArrayList<String>();
//		Random rd = new Random();
//		int opcion = rd.nextInt(124);
//		String alias = "";
//
//		Map<Integer, String> mapaDiccionario = new TreeMap<Integer, String>();
//
//		mapaDiccionario.put(0, "AGUA");
//		mapaDiccionario.put(1, "ARROZ");
//		mapaDiccionario.put(2, "ALMEJA");
//		mapaDiccionario.put(3, "ASADO");
//		mapaDiccionario.put(4, "ARBOL");
//		mapaDiccionario.put(5, "BEBE");
//		mapaDiccionario.put(6, "BATA");
//		mapaDiccionario.put(7, "BARRO");
//		mapaDiccionario.put(8, "BRISA");
//		mapaDiccionario.put(9, "BRONCE");
//		mapaDiccionario.put(10, "CASA");
//		mapaDiccionario.put(11, "CARPA");
//		mapaDiccionario.put(12, "CAMION");
//		mapaDiccionario.put(13, "CONGELADO");
//		mapaDiccionario.put(14, "CRUZ");
//		mapaDiccionario.put(15, "DARDO");
//		mapaDiccionario.put(16, "DIAMANTE");
//		mapaDiccionario.put(17, "DENTAL");
//		mapaDiccionario.put(18, "DEDAL");
//		mapaDiccionario.put(19, "DADO");
//		mapaDiccionario.put(20, "ELFO");
//		mapaDiccionario.put(21, "ESTUFA");
//		mapaDiccionario.put(22, "ESMERALDA");
//		mapaDiccionario.put(23, "ENSAYO");
//		mapaDiccionario.put(24, "EDEN");
//		mapaDiccionario.put(25, "FOCO");
//		mapaDiccionario.put(26, "FRIO");
//		mapaDiccionario.put(27, "FABULOSO");
//		mapaDiccionario.put(28, "FLAUTA");
//		mapaDiccionario.put(29, "FLECHA");
//		mapaDiccionario.put(30, "GRIS");
//		mapaDiccionario.put(31, "GATO");
//		mapaDiccionario.put(32, "GORRA");
//		mapaDiccionario.put(33, "GOMA");
//		mapaDiccionario.put(34, "GRANDE");
//		mapaDiccionario.put(35, "HILO");
//		mapaDiccionario.put(36, "HUELGA");
//		mapaDiccionario.put(37, "HUMO");
//		mapaDiccionario.put(38, "HIMNO");
//		mapaDiccionario.put(39, "HALCON");
//		mapaDiccionario.put(40, "IRIS");
//		mapaDiccionario.put(41, "INDIGO");
//		mapaDiccionario.put(42, "IRRADIANTE");
//		mapaDiccionario.put(43, "IDEA");
//		mapaDiccionario.put(44, "ICONO");
//		mapaDiccionario.put(45, "JAULA");
//		mapaDiccionario.put(46, "JARRON");
//		mapaDiccionario.put(47, "JADE");
//		mapaDiccionario.put(48, "JAMON");
//		mapaDiccionario.put(49, "JAQUE");
//		mapaDiccionario.put(50, "KILO");
//		mapaDiccionario.put(51, "KARMA");
//		mapaDiccionario.put(52, "KARAOKE");
//		mapaDiccionario.put(53, "KAYAK");
//		mapaDiccionario.put(54, "KIWI");
//		mapaDiccionario.put(55, "LUZ");
//		mapaDiccionario.put(56, "LABERINTO");
//		mapaDiccionario.put(57, "LAMPARA");
//		mapaDiccionario.put(58, "LEON");
//		mapaDiccionario.put(59, "LUPA");
//		mapaDiccionario.put(60, "MARTE");
//		mapaDiccionario.put(61, "MARRON");
//		mapaDiccionario.put(62, "MUERCIELAGO");
//		mapaDiccionario.put(63, "MAPA");
//		mapaDiccionario.put(64, "MUDO");
//		mapaDiccionario.put(65, "NADA");
//		mapaDiccionario.put(66, "NARIZ");
//		mapaDiccionario.put(67, "NAVIDAD");
//		mapaDiccionario.put(68, "NOVELA");
//		mapaDiccionario.put(69, "NUBE");
//		mapaDiccionario.put(70, "OBELISCO");
//		mapaDiccionario.put(71, "OSTRA");
//		mapaDiccionario.put(72, "ORCA");
//		mapaDiccionario.put(73, "OREJA");
//		mapaDiccionario.put(74, "OCRE");
//		mapaDiccionario.put(75, "PAIS");
//		mapaDiccionario.put(76, "PAZ");
//		mapaDiccionario.put(77, "PALOMA");
//		mapaDiccionario.put(78, "POLO");
//		mapaDiccionario.put(79, "PALA");
//		mapaDiccionario.put(80, "QUESO");
//		mapaDiccionario.put(81, "QUEBRADO");
//		mapaDiccionario.put(82, "QUIMONO");
//		mapaDiccionario.put(83, "QUISCO");
//		mapaDiccionario.put(84, "QUERUBIN");
//		mapaDiccionario.put(85, "RATON");
//		mapaDiccionario.put(86, "RAIZ");
//		mapaDiccionario.put(87, "RELAMPAGO");
//		mapaDiccionario.put(88, "RARO");
//		mapaDiccionario.put(89, "RADIO");
//		mapaDiccionario.put(90, "SATURNO");
//		mapaDiccionario.put(91, "SABIO");
//		mapaDiccionario.put(92, "SALMON");
//		mapaDiccionario.put(93, "SIERRA");
//		mapaDiccionario.put(94, "SACO");
//		mapaDiccionario.put(95, "TRAMPA");
//		mapaDiccionario.put(96, "TRUENO");
//		mapaDiccionario.put(97, "TRAMO");
//		mapaDiccionario.put(98, "TULIPAN");
//		mapaDiccionario.put(99, "TRENZA");
//		mapaDiccionario.put(100, "UNICORNIO");
//		mapaDiccionario.put(101, "UKELELE");
//		mapaDiccionario.put(102, "UNIVERSISAD");
//		mapaDiccionario.put(103, "UNIFORME");
//		mapaDiccionario.put(104, "URRACA");
//		mapaDiccionario.put(105, "VASO");
//		mapaDiccionario.put(106, "VIDRIO");
//		mapaDiccionario.put(107, "VAMPIRO");
//		mapaDiccionario.put(108, "VACACIONES");
//		mapaDiccionario.put(109, "VACUNA");
//		mapaDiccionario.put(110, "WEB");
//		mapaDiccionario.put(111, "WESTERN");
//		mapaDiccionario.put(112, "WHISKY");
//		mapaDiccionario.put(113, "WATERPOLO");
//		mapaDiccionario.put(114, "WAFLE");
//		mapaDiccionario.put(115, "XILOFONO");
//		mapaDiccionario.put(116, "YATE");
//		mapaDiccionario.put(117, "YEMA");
//		mapaDiccionario.put(118, "YOGA");
//		mapaDiccionario.put(119, "ZAFIRO");
//		mapaDiccionario.put(120, "ZANAHORIA");
//		mapaDiccionario.put(121, "ZAPALLO");
//		mapaDiccionario.put(122, "ZAPATO");
//		mapaDiccionario.put(123, "ZARPAR");
//		palabrasAlias.add(mapaDiccionario.get(opcion));
//
//		for (int i = 0; i < 2; i++) {
//			opcion = rd.nextInt(124);
//			if (palabrasAlias.contains(mapaDiccionario.get(opcion))) {
//
//				if (i == 0) {
//					i = -1;
//				} else if (i > 0) {
//					i--;
//				}
//			}
//
//			else if (!palabrasAlias.contains(mapaDiccionario.get(opcion))) {
//				palabrasAlias.add(mapaDiccionario.get(opcion));
//			}
//
//		}
//
//		for (int i = 0; i < palabrasAlias.size(); i++) {
//			System.out.println("Posicion: " + i + "--- Palabra: " + palabrasAlias.get(i));
//		}
//
//		for (int i = 0; i < palabrasAlias.size(); i++) {
//			if (i == palabrasAlias.size() - 1) {
//				alias += palabrasAlias.get(i);
//			} else {
//				alias += palabrasAlias.get(i) + ".";
//			}
//		}
//
//		System.out.println("Tamaño de la lista de alias: " + palabrasAlias.size());
//		System.out.println(alias);

	}

}
