package by.it.burov.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> structureString = String.class;
        Method[] methods = structureString.getDeclaredMethods();
        for (Method method : methods) {
            if(!Modifier.isStatic(method.getModifiers())){
                System.out.println(method.getName());
            }
        }
    }
}
