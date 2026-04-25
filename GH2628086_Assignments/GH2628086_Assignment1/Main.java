public class Main {
    public static void main(String[] args) {

        
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println(stock);  // Calls overridden toString()
        System.out.println("Price Change %: " + stock.getChangePercent() + "%");

        System.out.println("\n-------------------\n");

        
        Person person = new Person("John Doe", "Ciceron", "1234567", "john@email.com");
        Student student = new Student("Alice", "Castries", "7654321", "alice@email.com", Student.SENIOR);
        Employee employee = new Employee("Mark", "Gros Islet", "1112222", "mark@email.com",
                                         "A1", 3000, "01-01-2020");
        Faculty faculty = new Faculty("Dr. Smith", "Vieux Fort", "3334444", "smith@email.com",
                                      "B2", 5000, "05-05-2018", "9am-12pm", "Professor");
        Staff staff = new Staff("Jane", "Soufriere", "9998888", "jane@email.com",
                                "C3", 2500, "03-03-2021", "Administrator");

      
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}