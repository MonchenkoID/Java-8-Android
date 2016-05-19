package com.github.monchenkoid.java_eight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.monchenkoid.java_eight.annotations.functionalinterface.FunctionalInterfaceSample;
import com.github.monchenkoid.java_eight.annotations.repetableannotation.ToDo;
import com.github.monchenkoid.java_eight.function.JavaBiConsumer;
import com.github.monchenkoid.java_eight.function.JavaBiFunction;
import com.github.monchenkoid.java_eight.function.JavaBiPredicate;
import com.github.monchenkoid.java_eight.function.JavaBinaryOperator;
import com.github.monchenkoid.java_eight.function.JavaConsumer;
import com.github.monchenkoid.java_eight.function.JavaFunction;
import com.github.monchenkoid.java_eight.function.JavaPredicate;
import com.github.monchenkoid.java_eight.function.JavaSupplier;
import com.github.monchenkoid.java_eight.interfacemethods.defaultmethods.Car;
import com.github.monchenkoid.java_eight.interfacemethods.defaultmethods.CarDefaultDrivableChildOfChild;
import com.github.monchenkoid.java_eight.interfacemethods.defaultmethods.CarDefault;
import com.github.monchenkoid.java_eight.interfacemethods.defaultmethods.CarDefaultChildOfChild;
import com.github.monchenkoid.java_eight.interfacemethods.staticmethods.Circle;
import com.github.monchenkoid.java_eight.interfacemethods.staticmethods.Drawable;
import com.github.monchenkoid.java_eight.methodreference.ReferenceBoundNonStatic;
import com.github.monchenkoid.java_eight.methodreference.ReferenceConstructors;
import com.github.monchenkoid.java_eight.methodreference.ReferenceStaticMethod;
import com.github.monchenkoid.java_eight.methodreference.ReferenceUnBoundNonStatic;
import com.github.monchenkoid.java_eight.streams.Server;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.listFeatures);
        String[] arrayList = getBaseContext().getResources().getStringArray(R.array.features);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(adapter);
        list.setOnItemClickListener((adapterView, view, i, l) -> {
            String strings = arrayList[i];
            switch (strings) {
                case Constants.CONSUMER:
                    JavaConsumer.run();
                    break;
                case Constants.BICONSUMER:
                    JavaBiConsumer.run();
                    break;
                case Constants.FUNCTION:
                    JavaFunction.run();
                    break;
                case Constants.BIFUNCTION:
                    JavaBiFunction.run();
                    break;
                case Constants.PREDICATE:
                    JavaPredicate.run();
                    break;
                case Constants.BIPREDICATE:
                    JavaBiPredicate.run();
                    break;
                case Constants.SUPPLIER:
                    JavaSupplier.run();
                    break;
                case Constants.BINARY_OPERATOR:
                    JavaBinaryOperator.run();
                    break;
                case Constants.REF_STATIC_METHOD:
                    ReferenceStaticMethod.run();
                    break;
                case Constants.REF_BOUND_NONSTATIC_METHOD:
                    ReferenceBoundNonStatic.run();
                    break;
                case Constants.REF_UNBOUND_NONSTATIC_METHOD:
                    ReferenceUnBoundNonStatic.run();
                    break;
                case Constants.REF_CONSTRUCTOR:
                    ReferenceConstructors.run();
                    break;
                case Constants.INTERFACE_DEFAULT:
                    Car car = new Car();
                    car.demo();
                    CarDefault carDefault = new CarDefault();
                    carDefault.demo();
                    CarDefaultChildOfChild tessst = new CarDefaultChildOfChild();
                    tessst.demo();
                    CarDefaultDrivableChildOfChild omg = new CarDefaultDrivableChildOfChild();
                    omg.demo();
                    break;
                case Constants.INTERFACE_STATIC:
                    Circle circle = new Circle(10, 20, 5);
                    circle.draw(Drawable.rgb(0x80, 0x60, 0x40));
                    break;
                case Constants.FUNCTIONAL_INTERFACE:
                    FunctionalInterfaceSample.calculate();
                    break;
                case Constants.RUN_STREAMS:
                    try {
                        Server.serverListExample();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case Constants.REPEATABLE_ANNOTATIONS:
                    ToDo[] annotations = new ToDo[0];
                    try {
                        annotations = Class.forName("com.github.monchenkoid.java_eight.annotations.repetableannotation.Account").getAnnotationsByType(ToDo.class);
                        for (ToDo annotation: annotations)
                            Log.i("Repeatable annotation: ", annotation.value());
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        });
    }
}
