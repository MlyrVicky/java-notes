package com.day_4.loose_coupling;

public class Test  {

    public static void main(String[] args) {
     Branch branch = new Store();
         branch.branch();  //--> this called loose coupling
      //  branch.store (); this method not dealer in parent class.

        /*note: if I am mention to object.(accessing the child class method.) the method already declare the Parent class area.
        So that method called override that why we are accessing the method.*/

                Store store = new Store();
         store.branch(); // --> this called tight coupling

    }
}
