/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import view.MenyView;

/**
 *
 * @author Zsombor
 */
public class Main {
    
    public static void main(String[] args) {
        MenyView meny = new MenyView();
        meny.setVisible(true);
        meny.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
              
    }
}
