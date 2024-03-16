/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.util.List;

/**
 *
 * @author sumit
 */
public class DepthFirst {
    public static boolean searchPath(int [][]maze ,int x , int y , List<Integer> path ){
        if(maze[y][x] == 9){
            path.add(x);
            path.add(y);
            return true;
        }
        
        if(maze[y][x] == 0){
            maze[y][x] = 2;
            int deltaY [] = {-1,0,1,0};
            int deltaX [] = {0,1,0,-1};
            for(int i = 0 ; i < 4 ; i++){
                int dx = x + deltaX[i];
                int dy = y + deltaY[i];
                if(searchPath(maze , dx , dy , path)){
                    path.add(x);
                    path.add(y);
                    return true;
                }
            }
        }
        
        return false;
    }
}
