import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Student firstS = new Student("Aidan", "536 Sterling Way", "970-555-8942",
                "athom830@smail.org", "Sophomore");
        Student secondS = new Student("Kyrie", "118 Willow Dr", "970-555-6208",
                "knash515@smail.org", "Sophomore");
        Faculty firstF = new Faculty("Mr. Kenway", "1421 Oak St.", "970-555-9901",
                "ekenway625@smail.org", "History", "$11000", "4/21/04",
                "4:30-5:30pm", "Senior");
        Faculty secondF = new Faculty("Ms. Aimi", "671 Poplar St.", "970-424-2564",
                "saimi75@smail.org", "Science", "$9000", "6/16/15",
                "5-6pm", "Junior");
        Staff firstSt = new Staff("Bruce", "1528 Eagle Dr", "970-555-8019",
                "bruce115@smail.org", "Engineering", "$7000", "9/27/19",
                "Janitor");
        Staff secondSt = new Staff("Ms.O'Neal", "492 Grand Way", "970-555-6643",
                "roneal@smail.org", "Natural Science", "$8000", "3/18/24",
                "Advisor");

        persons.add(firstS);
        persons.add(secondS);
        persons.add(firstF);
        persons.add(secondF);
        persons.add(firstSt);
        persons.add(secondSt);

        for (Person person : persons) {
            System.out.println(person.toString());
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(findEmployee(persons));
        }

    }

    public static List<Object> findEmployee(List<Person> thisList) {
        List<Object> newList = new ArrayList<>();
        for (Object person : thisList) {
            //?????
            if (person == Faculty.class || person == Staff.class) {
                newList.add(person);
            }
        }
        return newList;
    }

}