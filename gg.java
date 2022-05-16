import hh.SomeClass;
import jdk.internal.access.JavaLangInvokeAccess;

import java.lang.reflect.*;


public class gg {


    private static Constructor[] constructors;
    private static Object method;

    public static void main(String[] args) throws Exception {
            SomeClass someClass = new SomeClass();
            Class clss = someClass.getClass();
        System.out.println(clss.getName());

            Constructor constructor =clss.getDeclaredConstructor();


        
       

        System.out.println("");
        System.out.println("Methods");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
            System.out.println(method.getReturnType().getName());
        }
        System.out.println("");
        System.out.println("fields");
        Field[] fields = clss.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            field.setAccessible(true);
            System.out.println(field.getInt(someClass));
          




            System.out.println("Гриша Лох");
            Field[] fields1 = clss.getDeclaredFields();
            for (Field field1 : fields);
            System.out.println(fields1.getClass());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
        }

        }
    }
    class SomeClas{
    private static transient  int i;
    String s;
    public void SomeClass(){
    }
    SomeClas(String s){
        this.s = s;
    }
    public  String someMethod (String s){
        System.out.println("this is" +s);
        return s;
    }
    }

