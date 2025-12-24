public class AdministrativalEmployee extends Employee {

    /**
     *
     * @param ssNo
     * @param name
     * @param email
     */
    public AdministrativalEmployee(int ssNo, String name, String email) {
        super(ssNo, name, email);
    }

    static class Main {
        public static void main(String[] args) {
            Employee admin = new AdministrativalEmployee(1111, "Чернышев Максим", "cmaksim666@gmail.com");
            Faculty faculty = new Faculty(new AdministrativalEmployee(1, "Александр Крыловецкий", "cs@vsu.ru"), "ФКН");
            ResearchEmployee sciEmpl = new ResearchEmployee(2, "Толстобров Александр", "tolstobrov@vsu.ru", "Программирование");
            String adminString = admin.toString();
            String facultyString = faculty.toString();
            String sciEmplString = sciEmpl.toString();
            System.out.println(adminString);
            System.out.println(facultyString);
            System.out.println(sciEmplString);
            sciEmpl.setEmail("tolstobrov@vsu.ru");
            admin.setSsNo(3);
            sciEmpl.setFieldOfStudy("Data base");
            faculty.setName("Факультет компьютерных наук");
            System.out.println();
            System.out.println(admin);
            System.out.println(sciEmpl);
            System.out.println(faculty);
        }
    }
}