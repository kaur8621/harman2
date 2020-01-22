/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2;

/**
 *
 * @author DELL
 */

public class student{
private String name;
public String getName()
{  return name;

}
public void setName(String n){
name=n;
}
    public static void main(String[] args){
    student[] st= new student[5];
    st[0]=new student();
    st[0].setName("student");
    }

}




