package com.bumptech.glide.load.data;

import com.bumptech.glide.j;

public interface d<T> {

    public interface a<T> {
        void c(Exception exc);

        void f(T t2);
    }

    Class<T> a();

    void b();

    void cancel();

    p4.a d();

    void e(j jVar, a<? super T> aVar);
}
