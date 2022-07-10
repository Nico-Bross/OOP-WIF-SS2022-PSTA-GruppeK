package Titanic;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TitanicAnalysen {
    @Test
    void sortByAgeAndAlphabet() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        List <Ticket> ticketArray = tickets.stream()
                .sorted(Comparator.comparing(Ticket::getSurname))
                .sorted(Comparator.comparing(Ticket::getAge)).toList();

        assertEquals("Andrew  Mr Frank 2nd -1 male 0", ticketArray.get(0).toString());
        assertEquals("Hagland  Mr Ingvald Olsen 3rd -1 male 0", ticketArray.get(100).toString());
        assertEquals("Makinen  Mr Kalle Edvard 3rd -1 male 0", ticketArray.get(200).toString());
        assertEquals("Odahl  Mr Nils Martin 3rd -1 male 1", ticketArray.get(300).toString());
        assertEquals("Ryan  Mr Patrick 3rd -1 male 0", ticketArray.get(400).toString());
        assertEquals("Todoroff  Mr Lalio 3rd -1 male 0", ticketArray.get(500).toString());
    }

    @Test
    void sortMenByAge() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        List <Ticket> ticketArray = tickets.stream()
                .filter(x -> x.getSex().equals("male"))
                .sorted(Comparator.comparing(Ticket::getSurname))
                .sorted(Comparator.comparing(Ticket::getAge)).toList();

        assertEquals(851, ticketArray.size());
        assertEquals("Andrew  Mr Frank 2nd -1 male 0", ticketArray.get(0).toString());
        assertEquals("Khalil  Mr Saad 3rd -1 male 0", ticketArray.get(100).toString());
        assertEquals("Olsson  Mr Nils Johan 3rd -1 male 0", ticketArray.get(200).toString());
        assertEquals("Sholt  Mr Peter Andreas Lauritz Andersen 3rd -1 male 0", ticketArray.get(300).toString());
        assertEquals("Johnson  Master Harold Theodor 3rd 4 male 1", ticketArray.get(400).toString());
        assertEquals("Johansson  Mr Erik 3rd 22 male 0", ticketArray.get(500).toString());

    }

    @Test
    void sortChildrenByAgeAndAlphabet() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        List<Ticket> ticketArray = tickets.stream()
                .filter(x -> x.getAge() > -1 && x.getAge() < 18)
                .sorted(Comparator.comparing(Ticket::getSurname))
                .sorted(Comparator.comparing(Ticket::getAge)).toList();


        assertEquals(96, ticketArray.size());
        assertEquals("Aks  Master Philip 3rd 0 male 1", ticketArray.get(0).toString());
        assertEquals("Klasen  Miss Gertrud Emilia 3rd 1 female 0", ticketArray.get(10).toString());
        assertEquals("Aspland  Master Edvin Rojj Felix 3rd 3 male 1", ticketArray.get(20).toString());
        assertEquals("Carr  Miss Helen 3rd 16 female 1", ticketArray.get(75).toString());

    }

    @Test
    void averageAgePassengers() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        double averageAge = tickets.stream()
                .filter(Ticket -> Ticket.getAge() != -1)
                .collect(Collectors.averagingDouble(Ticket :: getAge));

        assertEquals(30.3915, averageAge, 0.001);
    }

    @Test
    void averageAgeDeceased() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        double averageAge = tickets.stream()
                .filter(x -> x.getAge() != -1 && x.getSurvived() == 1)
                .collect(Collectors.averagingDouble(Ticket :: getAge));

        assertEquals(29.348, averageAge, 0.001);
    }

    @Test
    void numberOfPassengers() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();
        assertEquals(1313, tickets.size());
    }

    @Test
    void percentageDeceasedPeopleInTwenties() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        long twenties = tickets.stream()
                .filter(x ->x.getAge() > 19 && x.getAge() < 30)
                .count();

        long deceased = tickets.stream()
                .filter(x ->x.getAge() > 19 && x.getAge() < 30 && x.getSurvived() == 0)
                .count();

        double percentage = (double)deceased / (double)twenties;

        assertEquals(0.666, percentage, 0.001);
    }

    @Test
    void averageAgeMen() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        double averageAge = tickets.stream()
                .filter(x -> x.getAge() != -1 && x.getSex().equals("male"))
                .collect(Collectors.averagingDouble(Ticket :: getAge));

        assertEquals(31.00, averageAge, 0.01);
    }

    @Test
    void averageAgeWomen() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        double averageAge = tickets.stream()
                .filter(x -> x.getAge() != -1 && x.getSex().equals("female"))
                .collect(Collectors.averagingDouble(Ticket :: getAge));

        assertEquals(29.39, averageAge, 0.01);
    }

    @Test
    void mostFrequentSurname() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        List<String> mostFrequentSurname= tickets.stream()
                .collect(Collectors.groupingBy(Ticket::getSurname,Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey).toList();

        assertEquals("Sage", mostFrequentSurname.get(0));
        assertEquals("Andersson", mostFrequentSurname.get(1));
        assertEquals("Goodwin", mostFrequentSurname.get(2));
        assertEquals("Asplund", mostFrequentSurname.get(3));
    }

    @Test
    void mostFrequentAge() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        List<Integer> mostFrequentAge= tickets.stream()
                .filter(x -> x.getAge() != -1)
                .collect(Collectors.groupingBy(Ticket::getAge,Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()
                ))
                .map(Map.Entry::getKey).toList();

        assertEquals(22, mostFrequentAge.get(0));
        assertEquals(21, mostFrequentAge.get(1));
        assertEquals(30, mostFrequentAge.get(2));
        assertEquals(18, mostFrequentAge.get(3));

    }

    @Test
    void percentageDeceasedPclass() throws IOException {
        List<Ticket> tickets = TitanicStatistics.loadData();

        List<Long> tracker = tickets.stream()
                .collect(Collectors.groupingBy(Ticket::getPclass, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue).toList();

        List<Long> trackerdeceased = tickets.stream()
                .filter(x -> x.getSurvived() == 0)
                .collect(Collectors.groupingBy(Ticket::getPclass, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue).toList();

        double pclass1 = (double) trackerdeceased.get(0) / tracker.get(0);
        double pclass2 = (double) trackerdeceased.get(1) / tracker.get(1);
        double pclass3 = (double) trackerdeceased.get(2) / tracker.get(2);

        assertEquals(0.4006, pclass1, 0.01);
        assertEquals(0.575, pclass2, 0.01);
        assertEquals(0.806, pclass3, 0.01);

    }


}
