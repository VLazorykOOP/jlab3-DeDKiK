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
	    
	    
// Завдання 2 
	    
abstract class Body {
    abstract double getSurfaceArea();
    abstract double getVolume();
}

class Parallelepiped extends Body {
    private double a, b, c;

    public Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (a * b + b * c + a * c);
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }

    @Override
    public String toString() {
        return "Parallelepiped: a = " + a + ", b = " + b + ", c = " + c +
                ", surface area = " + getSurfaceArea() + ", volume = " + getVolume();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Parallelepiped) {
            Parallelepiped other = (Parallelepiped) obj;
            return this.a == other.a && this.b == other.b && this.c == other.c;
        }
        return false;
    }
}

class Ball extends Body {
    private double radius;
    private static final double PI = 3.14159;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 * PI * radius * radius * radius / 3;
    }

    @Override
    public String toString() {
        return "Ball: radius = " + radius + ", surface area = " + getSurfaceArea() + ", volume = " + getVolume();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ball) {
            Ball other = (Ball) obj;
            return this.radius == other.radius;
        }
        return false;
    }
}

public class dva {
    public static void main(String[] args) {
        Body[] bodies = new Body[] {
                new Parallelepiped(3, 4, 5),
                new Ball(2.5),
                new Parallelepiped(2, 3, 4),
                new Ball(1.5),
        };

        for (Body body : bodies) {
            System.out.println(body);
        }
    }
}

	    
	    
    }
}
