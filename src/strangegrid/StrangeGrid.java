/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strangegrid;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class StrangeGrid {

    /**
     * @param args the command line arguments
     */
    public static int findNumber(int r, int c) {
        if (r % 2 == 1) {
            return (r - 1) * 5 + (c - 1) * 2;
        } else {
            return (r - 2) * 5 + 1 + (c - 1) * 2;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Doc input row and colum
        System.out.print("Enter row and collume: ");
        int r = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        System.out.println("Output: " + findNumber(r, c));
    }

}
