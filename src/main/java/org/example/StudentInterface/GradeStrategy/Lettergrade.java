package org.example.StudentInterface.GradeStrategy;

public class Lettergrade implements  PercentageGrade{
    @Override
    public Object correctOnes(int corrects, int maxsize) {
        int percentage =100 -(Math.abs(corrects-maxsize)/maxsize*100);

        if (percentage>90){
            return "A";
        }
        if (percentage<90&&percentage>80){
            return "B";
        }
        if (percentage<80&&percentage>70){
            return "C";
        }if (percentage<70&&percentage>60){
            return "D";
        }else {
            return "E";
        }

    }
}
