package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }
    public void intialize() {
        GradePoints gradePoints = new GradePoints();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(this.scanner.nextLine());
            if(point == -1) {
                gradePoints.pointAvgs();
                break;
            }
            if(point < 0 || point > 100) continue;
            gradePoints.addPoint(point);
        }
    }
}
