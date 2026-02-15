import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

//AGREGACJA
//   - Album zawiera wiele Zdjęć
//   - Zdjęcie ma: nazwę, rok wykonania
//   - Zdjęcie ma atrybut opcjonalny: opis
//   - Album powinien mieć metody:
//    - Dodaj zdjęcie
//    - Usuń zdjęcie
//    - Policz zdjęcia
//    - Zwróć listę zdjęć
//   - Zdjęcie może być przeniesione do innego albumu
//   - W main: stwórz albumy, dodaj zdjęcia, przenieś zdjęcie między albumami
    System.out.println("Zadanie 1");
    System.out.println();

    Album familyAlbum = new Album("Family Album");
    Album vacationAlbum = new Album("Vacation Album");

    Photo familyPhoto = new Photo("Family Photo", 2020, "This is a family photo in Croatia");
    Photo vacationPhoto = new Photo("Vacation", 2020);
    Photo bielikiPhoto = new Photo("Bieliki", 2020, "Sonia Bielykova and Lukas Bielik");
    Photo ciriAndLukas = new Photo("Ciri And Lukas", 2023);
    Photo pineapplePhoto = new Photo("Pineapple", 2022);

    familyAlbum.addPhoto(vacationPhoto);
    familyAlbum.addPhoto(familyPhoto);
    familyAlbum.addPhoto(bielikiPhoto);
    familyAlbum.addPhoto(pineapplePhoto);

    vacationAlbum.addPhoto(vacationPhoto);
    vacationAlbum.addPhoto(familyPhoto);

    System.out.println(vacationAlbum.countPhotos());
    System.out.println(familyAlbum.countPhotos());

    familyAlbum.deletePhoto(pineapplePhoto);
    familyAlbum.addPhoto(ciriAndLukas);
    vacationAlbum.addPhoto(pineapplePhoto);
    System.out.println();

    System.out.println(vacationAlbum.countPhotos());
    System.out.println(familyAlbum.countPhotos());

    System.out.println(familyAlbum.getAlbum());
    System.out.println(vacationAlbum.getAlbum());

    System.out.println();
    System.out.println("Zadanie 2");
    System.out.println();
    //KOMPOZYCJA
        //Polecenie: Zamodeluj tort weselny składający się z pięter.
        //
        //   - Tort składa się z wielu Pięter (ułożonych jedno na drugim)
        //   - Tort ma opcjonalny atrybut: dedykacja (napis na torcie), obsłużony przez przeciążenie
        //  konstruktora
        //   - Tort ma datę przygotowania - ile godzin temu został zrobiony ma być wyliczane (nie
        //  przechowywane)
        //   - Piętra są tworzone TYLKO przez Tort (piętro tortu nie może istnieć bez tortu)
        //   - WAŻNE: Piętro NIE ma publicznego konstruktora
        //   - Piętro ma:
        //    - Numer piętra (nadawany automatycznie od dołu: 1, 2, 3...)
        //    - Średnica w cm
        //    - Smak (czekoladowe, waniliowe, truskawkowe)
        //   - Tort powinien mieć metody:
        //    - addLayer(int diameter, String flavor) - tworzy nowe piętro
        //    - removeTopLayer() - usuwa górne piętro (przestaje istnieć)
        //    - Obliczanie całkowitej wysokości tortu (każde piętro = 8cm) - wyliczane
        //    - Liczba pięter - wyliczane
        //    - Zwracanie listy pięter (niemutowalnej!)
        //   - W main pokaż:
        //    - Tworzenie tortu (z dedykacją i bez)
        //    - Dodawanie pięter do tortu (od największego na dole)
        //    - Usuwanie górnego piętra
        //    - Wyświetlanie całkowitej wysokości tortu
        //    - Próba stworzenia piętra poza tortem (nie powinno być możliwe)

        Cake chocolateCake = new Cake();
        Cake vanilaCake = new Cake("And they lived happly ever after");

        chocolateCake.addLayer(8, "chocolate layer");
        chocolateCake.addLayer(6,  "chocolate layer");
        chocolateCake.addLayer(4, "chocolate layer");

        vanilaCake.addLayer(10, "vanila layer");
        vanilaCake.addLayer(12, "vanila layer");

        System.out.println(chocolateCake);
        System.out.println(vanilaCake);
        System.out.println();

        System.out.println("Height of the cake: " + chocolateCake.getHeight() + " centimeters");
        System.out.println("Number od layers: " + chocolateCake.getLayers().size());
        System.out.println("Height of the cake: " + vanilaCake.getHeight()+ " centimeters");
        System.out.println("Number od layers: " + vanilaCake.getLayers().size());


        chocolateCake.removeTopLayer();
        System.out.println("Height of the cake: " + chocolateCake.getHeight() + ", number od layers:  " +  chocolateCake.getLayers().size());

        System.out.println(chocolateCake.timePassed().toHours());
        System.out.println(vanilaCake.timePassed().toMinutes());

     //   CakeLayer applepie = new CakeLayer(1, 10, "applePie");  NIE DA SIE STWORZYC


}
}
