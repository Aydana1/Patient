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
public class PatientDeque implements PatientDequeInterface {
    
    private DoublyLinkedNode<Patient> front;
    private DoublyLinkedNode<Patient> back;
    private int size;
    
    public PatientDeque(){
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public void pushToFront(Patient value) {
        
        DoublyLinkedNode<Patient> newNode = new DoublyLinkedNode(value);

        if(size==0){
           front = newNode;
           back = front;
        } else {
            if(value.isSenior()){
                if(front.getValue().isSenior()!=true){
                    
                    if(size==1){
                       newNode.setNext(front);
                       front.setPrevious(newNode);
                       front = newNode;   
                    } else {
                      newNode.setPrevious(front);
                      front.getNext().setPrevious(newNode);
                      newNode.setNext(front.getNext());
                      front.setNext(newNode);
                    }      
                    
                } else {
                    if(size==1){
                        back.setNext(newNode);
                        newNode.setPrevious(back);
                        back = newNode; 
                    } else {
                        newNode.setPrevious(front);
                        front.getNext().setPrevious(newNode);
                        newNode.setNext(front.getNext());
                        front.setNext(newNode);
                      }
                  }    
            } else {
                    back.setNext(newNode);
                    newNode.setPrevious(back);    
                    back = newNode;
              }
        } 
        size++;
    }
    
    @Override
    public void pushToBack(Patient value) {
       
        DoublyLinkedNode<Patient> newNode = new DoublyLinkedNode(value);
      
        if(size==0){
           back = newNode;
           front = back;
        } else {
            if(value.isSenior()){
               if(back.getValue().isSenior()!=true){
                   
                  if(size==1){
                  newNode.setNext(back);
                  back.setPrevious(newNode);
                  front = newNode;
                  } else {
                       newNode.setNext(back);
                       back.getPrevious().setNext(newNode);
                       newNode.setPrevious(back.getPrevious());
                       back.setPrevious(newNode);
                    }
               } else {
                 
                   back.setNext(newNode);
                   newNode.setPrevious(back);
                   back = newNode; 
                }
            } else {
                    back.setNext(newNode);
                    newNode.setPrevious(back);
                    back = newNode; 
            }
        }
        size++;
    }

    @Override
    public Patient popFromFront() throws Exception {
        
        if (size == 0){
            throw new Exception ("The queue is empty!");
        }
        
        Patient result = front.getValue();
        
        if(size==1){
            front = null;
            back = null;
            size = 0;
        } else {
           front.getNext().setPrevious(null);
           front = front.getNext(); 
        }
    
        size--;
        
        return result;
        
    }

    @Override
    public Patient popFromBack() throws Exception {
       
        if (size == 0){
            throw new Exception ("The queue is empty!");
        }
        
        Patient result = front.getValue();
        
        if(size==1){
           front = null;
           back = null;
           size = 0;
        } else {
            back.getPrevious().setNext(null);
            back = back.getPrevious();
        }
        
        size--;
        
        return result;
        
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        front = null;
        back = null;
        size = 0;
    }
    
    @Override
    public String toString(){
          
        String lque = "";
        
        DoublyLinkedNode<Patient> temp = front;
        
        while(temp != null){
            lque+= temp.getValue() + " ";
            temp = temp.getNext();
        }
        
        return "front[ " + lque + "]back";
    }

}
