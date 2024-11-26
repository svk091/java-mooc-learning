package org.example;

import java.util.ArrayList;

public class GradePoints {
    private ArrayList<Integer> gradePointsArray;
    public GradePoints() {
        this.gradePointsArray = new ArrayList<>();
    }
    public void addPoint(int point) {
        this.gradePointsArray.add(point);
    }
    public void pointAvgs() {
        int sum = 0;
        int count = 0;
        int passSum = 0;
        int numOfPasssum = 0;
        for(Integer point: this.gradePointsArray) {
            sum += point;
            count++;
            if(point >= 50) {
                passSum += point;
                numOfPasssum++;
            };
        }
        double avg = sum/(double) this.gradePointsArray.size();
        double passAvg = passSum/ (double) numOfPasssum;
        System.out.println("Point average(all)" + avg);
        if(numOfPasssum > 0) {
            System.out.println("Point average(passing):" + passAvg);
        } else {
            System.out.println("Point average(passing): - ");
        }
        System.out.println("Pass percentage:" + 100 * (passSum /(double) count));
    }
}
