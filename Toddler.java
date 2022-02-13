/**
  * Toddler.java
  *@desciption A class for managing data on Toddlers
  *@author Sakeena Younus
  *@VERSION 1.0 2022-01-21
*/

public class Toddler {

  //____attributes:____
  private String firstName;
  private String lastName;
  private String birthday;
  private double height;
  private double weight;

  //____methods:____

  /** Constructor of class */
  public Toddler(String fn, String ln) {
    firstName = fn;
    lastName = ln;
    birthday = "Jan 01"; //start values
    height = 1.0;  //starter values
    weight = 20.0; //starter values

  } //end of constructor of class

  /** resets height */
public void setHeight (double newHeight) {
  height = newHeight;
}

public void setBirthday(String newBirthday) {
  birthday = newBirthday;
}

/** returns height */
public double getHeight () {
  return height;
}

/** prints information of the object (summary of object)*/
public String toString() {
  String s;
  s = "This toddler, " + firstName + " " + lastName;
  s += " was born on " + birthday + " and is " + height + " feet, ";
  s += " and " + weight + " pounds.";

  return s;
}

public static void main (String[] args) {
  Toddler annie;
  annie = new Toddler ("Annie", "Salazar"); //Birthday: "Jul 20")
  annie.setHeight(2.8); //set height of annie
  annie.setBirthday ("Jul 20");
  System.out.println(annie.toString()); //prints what method returns
}


} //end of class
