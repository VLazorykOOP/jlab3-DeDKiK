public class Main {

    public static void main(String[] args) {
        System.out.println(" Lab 3");
	public class Main {
    static class employee {
        String name;
        String surname;
        int age;
        String post;

        public void Show() {
            System.out.println("Ім'я: " + name);
            System.out.println("Прізвище: " + surname);
            System.out.println("Вік: " + age);
            System.out.println("Посада: " + post);
        }
    }

    static class Person extends employee {
        String sex;

        public void Show() {
            super.Show();
            System.out.println("Стать: " + sex);
        }
    }

    static class Worker extends employee {
        int payment;

        public void Show() {
            super.Show();
            System.out.println("Зарплата: " + payment);
        }
    }

    static class Engenier extends employee {
        String Specialization;

        public void Show() {
            super.Show();
            System.out.println("Спеціалізація: " + Specialization);
        }
    }

    public static void main(String[] args) {
        employee[] employee = new employee[3];

        Person Person = new Person();
        Person.name = "Іван";
        Person.surname = "Іванов";
        Person.age = 30;
        Person.post = "Менеджер";
        Person.sex = "Чоловіча";
        Person.Show();
        System.out.println(" ");

        Worker Worker = new Worker();
        Worker.name = "Олександра";
        Worker.surname = "Петренко";
        Worker.age = 25;
        Worker.post = "Офіціант";
        Worker.payment = 10000;
        Worker.Show();
        System.out.println(" ");

        Engenier Engenier = new Engenier();
        Engenier.name = "Максим";
        Engenier.surname = "Сидоренко";
        Engenier.age = 35;
        Engenier.post = "Інженер";
        Engenier.Specialization = "Електротехніка";
        Engenier.Show();
    }
}
	    
	    

	    
	    
	    
    }
}
