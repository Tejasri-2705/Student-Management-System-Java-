import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    
                    Student newStudent = new Student(0, name, email, course, age);
                    service.addStudent(newStudent);
                    break;
                    
                case 2:
                    List<Student> students = service.getAllStudents();
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter ID of student to update: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    
                    Student existingStudent = service.getStudentById(updateId);
                    if (existingStudent != null) {
                        System.out.print("Enter New Name (" + existingStudent.getName() + "): ");
                        String newName = scanner.nextLine();
                        if (!newName.isEmpty()) existingStudent.setName(newName);
                        
                        System.out.print("Enter New Email (" + existingStudent.getEmail() + "): ");
                        String newEmail = scanner.nextLine();
                        if (!newEmail.isEmpty()) existingStudent.setEmail(newEmail);
                        
                        System.out.print("Enter New Course (" + existingStudent.getCourse() + "): ");
                        String newCourse = scanner.nextLine();
                        if (!newCourse.isEmpty()) existingStudent.setCourse(newCourse);
                        
                        System.out.print("Enter New Age (" + existingStudent.getAge() + "): ");
                        String newAgeStr = scanner.nextLine();
                        if (!newAgeStr.isEmpty()) existingStudent.setAge(Integer.parseInt(newAgeStr));
                        
                        service.updateStudent(existingStudent);
                    } else {
                        System.out.println("Student with ID " + updateId + " not found.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter ID of student to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    service.deleteStudent(deleteId);
                    break;
                    
                case 5:
                    exit = true;
                    System.out.println("Exiting System. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please select between 1-5.");
            }
        }
        scanner.close();
    }
}
