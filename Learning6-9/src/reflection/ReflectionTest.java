package reflection;
/*
* @author zzl
* @version 2018 6-9
* */
import java.util.*;
import java.lang.reflect.*;
public class ReflectionTest {
    public static void main(String[] args){
        //read class name from command line args or user input
        String name;
        if(args.length>0)
            name=args[0];
        else{
            Scanner in =new Scanner(System.in);
            System.out.println("Enter class name(e.e. java.util.Date):");
            name =in.next();
        }
        try{
            //print class name and superclass name(if!=Object)
            Class c1=Class.forName(name);
            Class superc1=c1.getSuperclass();
            String modifiers=Modifier.toString(c1.getModifiers());
            if(modifiers.length()>0)
                System.out.println("class"+name);
            if(superc1!=null&&superc1!=Objects.class)
                System.out.println("extends"+superc1.getName());
            System.out.print("\n{\n");
            printConstructors(c1);
            System.out.println();
            printMethods(c1);
            System.out.println();
            printField(c1);
            System.out.println("}");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);
    }

public static void printConstructors(Class c1) {
    Constructor[] constructors = c1.getDeclaredConstructors();
    for (Constructor c : constructors) {
        String name = c.getName();
        System.out.print("  ");
        String modifiers = Modifier.toString(c.getModifiers());
        if (modifiers.length() > 0)
            System.out.print(modifiers + " ");
        System.out.print(name + "(");

        //print parameter types
        Class[] paramTypes = c.getParameterTypes();
        for (int j = 0; j < paramTypes.length; j ++) {
            if (j > 0)
                System.out.print(", ");
            System.out.print(paramTypes[j].getName());
        }
        System.out.println(");");
    }
}
public static void printMethods(Class c1){
        Method[] methods=c1.getDeclaredMethods();

        for(Method m:methods){
            Class retType=m.getReturnType();
            String name =m.getName();

            System.out.print("  ");
            String modiiers=Modifier.toString(m.getModifiers());
            if(modiiers.length()>0)
                System.out.println(modiiers+" ");
            System.out.print(retType.getName()+" "+name+"(");
            Class[] paramTypes=m.getParameterTypes();
            for(int j=0;j<paramTypes.length;j++){
                if(j>0)
                    System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
}
public static void printField(Class c1){
        Field[] fileds=c1.getDeclaredFields();
        for(Field f:fileds){
            Class type =f.getType();
            String name=f.getName();
            System.out.print("  ");
            String modifiers=Modifier.toString(f.getModifiers());
            if(modifiers.length()>0)
                System.out.print(modifiers+" ");
            System.out.println(type.getName() +" "+name+";");
        }

}
}