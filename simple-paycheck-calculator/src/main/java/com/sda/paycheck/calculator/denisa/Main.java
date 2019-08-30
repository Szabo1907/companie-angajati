package com.sda.paycheck.calculator.denisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Entity> entityList = createEntities();
        List<Entity> rearrangedEntityList = rearrangeEntityList(entityList);

        System.out.println(rearrangedEntityList);

        double salariesFromCluj = computeAmountRecevedPerCity(entityList, "Cluj-Napoca");
        System.out.println(salariesFromCluj);

    }


    public static List<Entity> createEntities() {

        Student student1 = new Student("Cluj-Napoca", 2000);
        Student student2 = new Student("Cluj-Napoca", 8000);
        Student student3 = new Student("Dej", 1800);

        Professor professor = new Professor("Huedin", 3200);
        Professor professor1 = new Professor("Zalau", 3400);

        List<Entity> entityList = new ArrayList<>();

        entityList.add(student1);
        entityList.add(student2);
        entityList.add(student3);
        entityList.add(professor);
        entityList.add(professor1);

        return entityList;

    }

    public static List<Entity> rearrangeEntityList(List<Entity> entityList) {
        List<Entity> students = new ArrayList<>();
        List<Entity> professors = new ArrayList<>();

        for (Entity e : entityList) {
            if (e instanceof Student) {
                students.add(e);
            } else if (e instanceof Professor) {
                professors.add(e);
            }

        }
        Collections.sort(students, new EntityComparator());
        Collections.sort(professors, new EntityComparator());

        entityList.clear();
        entityList.addAll(professors);
        entityList.addAll(students);

        return entityList;


    }

    public static double computeAmountRecevedPerCity(List<Entity> entityList, String city) {

        double sum = 0;
        for (Entity e : entityList) {
            if (e.getCity().equals(city)) {
                sum = sum + e.amountReceived();
            }
        }

        return sum;
    }


}
