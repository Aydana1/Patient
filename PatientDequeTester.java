/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientdeque.impl;

import patientdeque.adt.PatientDequeInterface;

/**
 *
 * @author Home
 */
public class PatientDequeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
               
        PatientDequeInterface dq = new PatientDeque();
       
        Patient p4 = new Patient("Kamila", true);
        Patient p8 = new Patient("Zhanna", true);
        Patient p1 = new Patient("Asel", true);
        Patient p2 = new Patient("Aidana", false);
        Patient p3 = new Patient("Aizhan", true);
        Patient p5 = new Patient ("Nazerke", true);
        Patient p6 = new Patient ("Bolat", false);
        Patient p7 = new Patient ("Vova", false);
       
        dq.pushToFront(p1);
        dq.pushToFront(p2);
        dq.pushToFront(p3);
        dq.pushToFront(p8);
          
        dq.pushToBack(p5);
        dq.pushToBack(p6);
        dq.pushToBack(p7);
        dq.pushToFront(p4);
           
        System.out.println(dq);
        System.out.println("Size= " + dq.getSize());
        
        dq.popFromBack();
        dq.popFromBack();
        
        dq.popFromFront();
        dq.popFromFront();
        
        System.out.println(dq);
        System.out.println("Size= " + dq.getSize());
      
    }
    
}
