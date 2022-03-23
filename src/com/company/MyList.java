package com.company;

import java.util.Arrays;

public class MyList<T> {

   Object[] array;
   int dimension;
  public int size;

    public MyList(int dimension) {
       this.dimension=dimension;
        array = new Object [this.dimension];
        size=0;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void add(T element)  {

        array[size++]=element;

    }
    public void print(){

        System.out.println(Arrays.toString(array));
    }

    public boolean lookup(T element){

        for(var obj:array){
            if(obj.equals(element))
                return true;
        }
        return false;
    }

}
