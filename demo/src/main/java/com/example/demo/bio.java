package com.example.demo;
import javax.swing.*;
class Biodata{
   public static void main(String[] args){
       JFrame window = new JFrame("Registration Form");
 
       JLabel candidate_name = new JLabel("Name : ");
       candidate_name.setBounds(45,20,180,50);
       window.add(candidate_name);
 
       JTextField tf1 = new JTextField();
       tf1.setBounds(160,30,180,30);
       window.add(tf1);
 
       JLabel candidate_dob = new JLabel("Date of Birth: ");
       candidate_dob.setBounds(45,70,180,50);
       window.add(candidate_dob);
 
       JTextField tf2 = new JTextField();
       tf2.setBounds(160,75,180,30);
       window.add(tf2);
 
       JLabel gender = new JLabel("Gender: ");
       gender.setBounds(45,120,180,50);
       window.add(gender);
 
       JRadioButton male = new JRadioButton("A) Male");
       male.setBounds(150,130,200,20);
    
       window.add(male);
 
       JRadioButton female = new JRadioButton("B) Female");        
       female.setBounds(150,160,200,20); 
       window.add(female);
 
       JLabel qualification = new JLabel("Qualification: ");
       qualification.setBounds(45,170,180,50);
       window.add(qualification);
 
       JCheckBox cb1 = new JCheckBox("Graduate");
       cb1.setBounds(150,190,200,20);
       window.add(cb1);
 
       JCheckBox cb2 = new JCheckBox("UnderGraduate");
       cb2.setBounds(150,220,200,20);
       window.add(cb2);
 
       JLabel address = new JLabel("Address: ");
       address.setBounds(45,230,180,50);
       window.add(address);
 
       JTextField tf3 = new JTextField();
       tf3.setBounds(150,245,200,70);
       window.add(tf3);
 
       JButton submit = new JButton("Submit");
       submit.setBounds(120,350,200,30);
       window.add(submit);
 
       window.setSize(500,450);
       window.setLayout(null); 
       window.setVisible(true);
 
 
   }
}

    

