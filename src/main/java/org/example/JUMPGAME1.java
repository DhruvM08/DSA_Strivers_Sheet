package org.example;
//here Use The max Distance Concept Always Remember if The Jump Game Comes So Mst of The times the MAx Distance is the main Factor of The Problem
//So Always Focus on the max Distance and (i > maxDistance) it's Suggest that the not reachable position at that point return false 
public class JUMPGAME1 {


    public static boolean canJump(int[] array) {
        int maxDist = 0;
        boolean flag = true;

        for(int i=0;i<array.length;i++)
        {
            if(i > maxDist)
            {
                flag = false;

            }

            maxDist = Math.max(maxDist,array[i] + i);

        }
        return flag;
    }




    public static void main(String[] args)
    {

      int [] array = {5, 4, 0, 0, 0, 3, 0, 0, 1, 0, 1};
     boolean ret = canJump(array);
      System.out.println(ret);

    }
}

