package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Geraldo");
        Consumidor consumidor2 = new Consumidor("Itachi");
        Manga manga1 = new Manga(5L, "Haikyuu", 18.99);
        Manga manga2 = new Manga(3L, "One Piece", 19.99);
        Manga manga3 = new Manga(1L, "Dragon Ball", 6.82);
        Manga manga4 = new Manga(2L, "Berserk", 13.65);
        Manga manga5 = new Manga(4L, "Pokemon", 12.12);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga4);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga5);
        Map<Consumidor, List<Manga>> map = new HashMap<>();
        map.put(consumidor1, mangaConsumidor1List);
        map.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> consumidorListEntry: map.entrySet()){
            System.out.println("----"+consumidorListEntry.getKey().getNome());
            for (Manga manga : consumidorListEntry.getValue()) {
                System.out.println("----------"+manga.getNome());
            }

        }

    }
}
