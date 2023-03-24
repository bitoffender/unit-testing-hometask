import java.util.*;
import java.util.stream.Collectors;

class Main {

    public static double methodToTest(double a, double b){
        return a / b;
    }

    public static List<String> getWorkList(Collection<Person> source){
        return source.stream()
                .filter(x -> (x.getAge() > 18 && x.getAge() < 60 && x.getSex().equals(Sex.WOMAN) ||
                        (x.getAge() < 65 && x.getSex().equals(Sex.MAN))))
                .filter(x -> x.getEducation().equals(Education.HIGHER))
                .map(x -> x.getName())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public static List<String> getArmyList(Collection<Person> source){
        return source.stream()
                .filter(x -> x.getSex().equals(Sex.MAN))
                .filter(x -> x.getAge() > 18 && x.getAge() < 27)
                .map(x -> x.getName())
                .collect(Collectors.toList());
    }

    public static long getUnder18Amount(Collection<Person> source) {
        return source.stream()
                .filter(x -> x.getAge() < 18)
                .count();
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        persons.forEach(System.out::println);

        long under18 = getUnder18Amount(persons);
        List<String> army = getArmyList(persons);
        List<String> workList = getWorkList(persons);

        System.out.println(under18);
        System.out.println(army);
        System.out.println(workList);
    }

}