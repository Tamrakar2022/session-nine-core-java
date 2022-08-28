package day8;

public class marksheet {
    public static void main(String[] args) {

        String name = "Reshma Tamrakar";
        int studentclass = 8;

        float maths = 84;
        float science = 79;
        float english = 70;
        float computer = 73;
        float social = 71;

        float percentage = ((maths + science + english + computer + social)/500)*100;

        System.out.println(percentage);

        boolean isDistinction = percentage >= 80;
        boolean isFirstDivision = percentage >= 70 && percentage < 80;
        boolean isSecondDivision = percentage >= 60 && percentage < 70;
        boolean isThirdDivision = percentage >= 50 && percentage < 60;
        boolean isFail = percentage < 50;


        System.out.println("Dinstinction : " + isDistinction);
        System.out.println("First Division : " + isFirstDivision);
        System.out.println("Second Division : " + isSecondDivision);
        System.out.println("Third Division : " + isThirdDivision);
        System.out.println("Fail : " + isFail);



        System.out.println(maths);


    }
}
