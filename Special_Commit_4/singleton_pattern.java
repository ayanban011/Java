import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private Singleton() {  };
    public String str = "Hello I am a singleton! Let me say hello world to you";
    static public Singleton getSingleInstance() {
        return new Singleton();
    }
}