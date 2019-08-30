package com.sda.paycheck.calculator.denisa;

import java.util.Comparator;

public class EntityComparator implements Comparator<Entity> {


    @Override
    public int compare(Entity entity1, Entity entity2) {

        if (entity1.amountReceived()== entity2.amountReceived()){
            return 0;

        }else if (entity1.amountReceived()> entity2.amountReceived()){
            return 1;
        }else{
            return -1;
        }

        //mai simplu am putea face
      // return Double.compare(entity1.amountReceived(),entity2.amountReceived());


    }
}
