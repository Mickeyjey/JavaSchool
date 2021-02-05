package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel{
    private String studentName;
    private Level level;
    List<Double> list = new ArrayList<Double>();

    public String getName(){
        return studentName;
    }

    public Student(String name, Level level, List<Double> list) {
        this.studentName = name;
        this.level = level;
        this.list = list;
    }

    @Override
    public Level getLevel() {
        return level;
    }

    public double getAverageGrade(){
      return 7.0;
    }
}
