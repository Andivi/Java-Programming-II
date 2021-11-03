package com.turntabl;


import java.util.Set;

public abstract class Bag<P>{

    public abstract void add( P fresh );
    public abstract void remove(P tired);
    public abstract void clear(Set<P> thatsAll);
    public abstract void clear();

};
