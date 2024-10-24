# JP-Zajecia2
Języki Programowania: Zajęcia nr 2 - Kolekcje w Javie
Polecenie:
Wymagane jest wykonanie przynajmniej trzech zadań obejmujących tematykę zbiorów, list i map. Każde zadanie powinno implementować inny rodzaj kolekcji.
1. Zaimplementuj program, który przyjmuje od użytkownika ciąg liczb i przechowuje je w zbiorze typu HashSet i TreeSet. Następnie wyświetl różnice między HashSet a TreeSet w kontekście kolejności elementów.
2. Stwórz program, który dodaje, usuwa i modyfikuje elementy w dwóch listach typu ArrayList i LinkedList. Następnie zmierz czas wykonywania tych operacji i porównaj wyniki.
3. Stwórz aplikację, która umożliwia użytkownikowi przechowywanie par klucz-wartość w mapie typu HashMap i TreeMap. Po dodaniu kilku elementów, zwróć uwagę na różnice w kolejności kluczy w obu mapach.
4. Zaprojektuj klasę reprezentującą produkt z identyfikatorem (np. numerem seryjnym) i ceną. Zaimplementuj nadpisywanie metod equals() i hashCode(). Następnie stwórz zbiór HashSet i dodaj kilka produktów. Spróbuj dodać ten sam produkt ponownie i zobacz, jakie będą wyniki.
5. Stwórz listę obiektów reprezentujących osoby, gdzie każda osoba ma imię i wiek. Napisz komparator, który sortuje tę listę na podstawie wieku. Następnie posortuj listę za pomocą komparatora i wyświetl wynik.
6. Stwórz mapę TreeMap, w której klucze reprezentują nazwy miast, a wartości ilości ludności. Napisz komparator, który sortuje mapę według ilości ludności. Wyświetl posortowaną mapę.
7. Zaimplementuj klasę reprezentującą książkę z polami takimi jak: tytuł, autor i numer ISBN. Napisz metody equals() i hashCode(), aby porównywały książki na podstawie numeru ISBN. Następnie stwórz HashSet i dodaj kilka książek o tym samym numerze ISBN, a także kilka różnych. Przeanalizuj wynik.
8. Stwórz klasę reprezentującą produkt z polami, takimi jak nazwa i cena. Zaimplementuj interfejs Comparable, aby produkty były porównywane na podstawie ceny. Stwórz listę produktów i posortuj ją za pomocą Collections.sort(). Następnie wyświetl posortowaną listę.
  * Zmodyfikuj zadanie, aby tym razem użyć własnego komparatora do sortowania produktów według nazwy. Wyświetl wynik i porównaj go z poprzednim.
9. Stwórz mapę, w której kluczami są niestandardowe obiekty, np. reprezentujące adresy. Nadpisz metody equals() i hashCode() tych obiektów, aby zapewnić poprawne porównywanie. Dodaj kilka elementów do mapy i przetestuj, czy możesz znaleźć elementy za pomocą tych niestandardowych kluczy.
10. Stwórz klasę reprezentującą samochód z polami, takimi jak marka, model i rok produkcji. Napisz komparator, który sortuje samochody najpierw według marki, a następnie według modelu. Stwórz listę samochodów i posortuj ją za pomocą tego komparatora. Wyświetl posortowaną listę.
  * Rozwiń zadanie, aby tym razem użyć niestandardowego komparatora, który sortuje samochody na podstawie rocznika od najstarszego do najnowszego. Wyświetl wynik i porównaj go z poprzednim.
11. Stwórz klasę reprezentującą rzekę. Rzeka ma nazwę w języku polskim, niemieckim i czeskim, nazwę rzeki, do której wpływa oraz przebieg (pole typu String). Następnie stwórz kolekcję (typ do samodzielnego wyboru) umożliwiającą przechowywanie rzek i wyświetlanie ich w zadanym porządku (wg. języka nazw).
  *przebieg jest kolekcją punktów (double lat,lon;), a nie opisem słownym
  *zaproponuj rozwiązanie umożliwiające wyświetlanie bez konieczności każdorazowego sortowania przy zmianie języka
  *dodaj możliwość filtracji rzek umożliwiając wyświetlanie dorzecza danej rzeki
