package Lab1;

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Alice");
        s1.setCity("New York");
        s1.setMarks1(80);
        s1.setMarks2(85);
        s1.setMarks3(90);
        s1.setFeePerMonth(1000.0f);
        s1.setIsEligibleForScholarship(true);

        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setStudentName("Bob");
        s2.setCity("Los Angeles");
        s2.setMarks1(70);
        s2.setMarks2(75);
        s2.setMarks3(65);
        s2.setFeePerMonth(800.0f);
        s2.setIsEligibleForScholarship(false);

        Student s3 = new Student();
        s3.setStudentId(3);
        s3.setStudentName("Charlie");
        s3.setCity("Chicago");
        s3.setMarks1(90);
        s3.setMarks2(88);
        s3.setMarks3(92);
        s3.setFeePerMonth(1200.0f);
        s3.setIsEligibleForScholarship(true);

        Student highestTotal = s1;
        if (s2.getTotalMarks() > highestTotal.getTotalMarks()) {
            highestTotal = s2;
        }
        if (s3.getTotalMarks() > highestTotal.getTotalMarks()) {
            highestTotal = s3;
        }

        System.out.println("Student with highest total marks: " + highestTotal.getStudentName());

        Student leastFee = s1;
        if (s2.getFeePerMonth() < leastFee.getFeePerMonth()) {
            leastFee = s2;
        }
        if (s3.getFeePerMonth() < leastFee.getFeePerMonth()) {
            leastFee = s3;
        }

        System.out.println("Student with least monthly fee: " + leastFee.getStudentName() + ", Fee: " + leastFee.getFeePerMonth());

        Student[] students = {s1, s2, s3};
        for (Student s : students) {
            System.out.println("Name: " + s.getStudentName());
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.println("Average Marks: " + s.getAverage());
            System.out.println("Result: " + s.getResult());
            System.out.println("Scholarship: " + (s.getIsEligibleForScholarship() ? "Yes" : "No"));
            System.out.println();
        }
    }
}

