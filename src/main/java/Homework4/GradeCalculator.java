//@author <Dimitri Zhvania>
package Homework4;

public class GradeCalculator {
    public static void main(String[] args) {

        int month = 1;

        if (month == 12) {
            System.out.println("Grade: A");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Grade: B");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Grade: C");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Grade: D");
        } else if (month >= 1 && month <= 2) {
            System.out.println("Grade: F");
        }
    }
}

//ბრენჩის გაკეთება დამავიწყდა და ახლა შევქმენი, ყველაფერი მეინზე ვაკეთე თურმე.