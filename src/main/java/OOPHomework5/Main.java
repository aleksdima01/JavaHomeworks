package OOPHomework5;

import OOPHomework5.Controller.Controller;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Сидоров", "Петр", "Андреевич");
        controller.createStudent("Петренко", "Иван", "Федорович");
        controller.createStudent("Комаров", "Александр", "Игоревич");
        controller.createTeacher("Петров", "Владимир", "Николаевич");
        controller.createTeacher("Колчанов", "Иван", "Федорович");
        controller.getAllTeachersOnConsole();
        controller.getAllStudentsOnConsole();
        controller.createGroup(controller.getTeachersOnID(2), controller.getAllStudents());
        controller.getGroupOnConsole();
    }

}
