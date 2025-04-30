package org.example.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SingletonLazy {
    public static SingletonLazy Instance= new SingletonLazy();

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        return Instance;
    }
}