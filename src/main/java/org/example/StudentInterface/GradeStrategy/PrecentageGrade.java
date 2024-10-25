package org.example.StudentInterface.GradeStrategy;

public class PrecentageGrade implements PercentageGrade{
    @Override
    public Object correctOnes(int corrects, int maxsize) {
        int percentage =100 -(Math.abs(corrects-maxsize)/maxsize*100);

        return percentage;
    }
}
