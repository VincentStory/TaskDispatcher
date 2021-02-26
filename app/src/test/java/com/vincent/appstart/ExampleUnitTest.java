package com.vincent.appstart;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    ArrayList<String> list = new ArrayList<>();

    @Test
    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);

        list.add(0, "aaa");
        list.add(1, "bbb");
        System.out.println(list.toString());
    }

    @Test
    public void test() {
        int intA[][] = {{1, 2}, {3, 4}, {5, 6}};
        find(4, intA);
//        System.out.println(intA[0][0]);
//        System.out.println(find(7, intA));
//        int[][] nn = new int[][]{2, 3, 1, 0, 2, 5, 3},{2, 3, 1, 0, 2, 5, 3};
//        System.out.println(duplicate1(nn));
    }

    public boolean find(int target, int[][] array) {
        int rowCount = array.length;
//        System.out.println(rowCount);
        int colCount = array[0].length;
//        System.out.println(colCount);
        int y, x;

        for (x = rowCount - 1, y = 0; x >= 0 && y < colCount; ) {
            if (target == array[x][y]) {
                System.out.println("true:" + array[x][y]);
                return true;
            } else if (target > array[x][y]) {
                y++;
                System.out.println("y==:" + y);
                continue;
            } else if (target < array[x][y]) {
                x--;
                System.out.println("x==" + x);
                continue;
            }
        }
        System.out.println(false);
        return false;
    }


    public int duplicate1(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return 0;
    }

    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {

        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}