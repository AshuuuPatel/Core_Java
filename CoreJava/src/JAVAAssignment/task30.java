//

package JAVAAssignment;

abstract class Marks {
    abstract double getPercentage();
}

class StudentA extends Marks {
    double subject1, subject2, subject3;

    StudentA(double s1, double s2, double s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}

class StudentB extends Marks {
    double subject1, subject2, subject3, subject4;

    StudentB(double s1, double s2, double s3, double s4) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}

public class task30 {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(80, 90, 75);
        StudentB studentB = new StudentB(85, 88, 92, 78);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
