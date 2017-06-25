package ajaymehta.staticinnerclass;

/**
 * Created by Avi Hacker on 6/25/2017.
 */

public class Car {

    // if method is not static ..it doesnt have any effect on it...


    public static void usingTyre() {
        Engine engine = new Engine();   // static class object

        //TODO...un comment below line n u will get to know why u cant create object of Tyre class..if you have a static method...then only u can create object of static class in that...otherwise u cant..
      //  Tyre tyre = new Tyre();

    }


    // inner class 1
  static  class Engine {


    }


    //  inner class 2
    class Tyre {


    }


}
