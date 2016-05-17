package com.github.monchenkoid.java_eight.annotations.repetableannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Iryna Monchanka
 * @version on 5/17/2016
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToDos {
    ToDo[] value();
}