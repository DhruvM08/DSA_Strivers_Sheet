package org.example.DailyProblems;

import java.util.ArrayList;
import java.util.List;

//Graphs Problem

public class Day_3July_LeetCode3620 {

    public static int network(int[][] edges, boolean[] online, long boundary)
    {
        int target = 0;
        int start = 0;

        List<Integer> list = new ArrayList<>();

        for(int i =0; i< edges.length; i++)
        {
            for(int j =0; j <= 1; j++)
            {
                if (target < edges[i][j])
                {
                    target = edges[i][j];
                }

            }
        }

        int Next = 0;
        int cost = 0;
        for(int k =0; k < edges.length; k++)
        {
            for(int p =0; p < 1; p++)
            {

                    if (edges[k][p] == start && online[start]) {
                        cost = 0;
                        list = new ArrayList<>();
                        cost = cost + edges[k][p + 2];
                        list.add(edges[k][p+2]);
                        if(Next != target) {
                            Next = edges[k][p + 1];
                        }else {
                            Next = edges[k][p+1];
                        }
                    } else if (Next == edges[k][p] && online[Next]) {
                        cost = cost + edges[k][p + 2];
                        list.add(edges[k][p+2]);
                        if(Next != target) {
                            Next = edges[k][p + 1];
                        }else {
                            Next = 0;
                        }
                    }
                }

        }
        System.out.println(cost);
        System.out.println(list);




//        System.out.println(cost);
        return target;
    }

    public static void main(String[] args)
    {

        int[][] edges = {{0,1,5},{1,3,10},{0,2,3},{2,3,4}};
        boolean online[] = {true,true,true,true};
        int k = 10;
        int result = network(edges,online,k);

//        System.out.println(result);
    }

}
