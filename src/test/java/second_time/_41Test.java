package second_time;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class _41Test {

    @Test
    public void findContinuousSequence() {
        _41 test = new _41();
        ArrayList<ArrayList<Integer>> list = test.FindContinuousSequence(100);
        for (int i=0;i<list.size();i++){
            ArrayList<Integer> list1 = list.get(i);
            for (int j=0;j<list1.size();j++){
                System.out.print(list1.get(j)+" ");
            }
            System.out.println();
        }
    }
}