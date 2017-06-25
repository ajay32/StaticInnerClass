package ajaymehta.staticinnerclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {  // its not an outer class of Tyre or Engine but you can access them..


    // There are 2 reasons why we create inner class static
    // 1. ) we can create object of any class in any other class... but we can not create object of any inner class in other classes except its outer class..so if you make it static u can access that class..from any other classes simple...
    // 2.) if you are creating object of that class from a static method ( even if you create that static method in its own class) ..then you have to create that class static otherwise you will not be able to create object of that class..

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car.Engine engine = new Car.Engine();  // if it gives u error that its not enclosing class..means its not static..

        //TODO .... uncomment below line of code..n u will get to know..u cant access that inner class because it not static
        //   Car.Tyre tyre = new Car.Tyre();
    }
}
