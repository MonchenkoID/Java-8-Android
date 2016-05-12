package com.github.monchenkoid.java_eight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.monchenkoid.java_eight.function.JavaBiConsumer;
import com.github.monchenkoid.java_eight.function.JavaBiFunction;
import com.github.monchenkoid.java_eight.function.JavaBiPredicate;
import com.github.monchenkoid.java_eight.function.JavaBinaryOperator;
import com.github.monchenkoid.java_eight.function.JavaConsumer;
import com.github.monchenkoid.java_eight.function.JavaFunction;
import com.github.monchenkoid.java_eight.function.JavaPredicate;
import com.github.monchenkoid.java_eight.function.JavaSupplier;
import com.github.monchenkoid.java_eight.methodreference.ReferenceBoundNonStatic;
import com.github.monchenkoid.java_eight.methodreference.ReferenceConstructors;
import com.github.monchenkoid.java_eight.methodreference.ReferenceStaticMethod;
import com.github.monchenkoid.java_eight.methodreference.ReferenceUnBoundNonStatic;

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
            switch (strings){
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

                    //        <item> FUNCTIONS</item>
             //   <item>METHOD REFERENCE</item>

            }
        });
    }
}
