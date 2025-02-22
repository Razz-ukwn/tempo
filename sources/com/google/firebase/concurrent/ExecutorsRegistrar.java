package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.fragment.app.q;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import q9.a;
import q9.c;
import q9.d;
import s0.b0;
import t9.b;
import t9.h;
import t9.p;
import t9.u;
import u9.k;
import u9.l;
import u9.m;
import u9.n;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final p<ScheduledExecutorService> f6324a = new p<>(new h(1));

    /* renamed from: b  reason: collision with root package name */
    public static final p<ScheduledExecutorService> f6325b = new p<>(new k());

    /* renamed from: c  reason: collision with root package name */
    public static final p<ScheduledExecutorService> f6326c = new p<>(new l());

    /* renamed from: d  reason: collision with root package name */
    public static final p<ScheduledExecutorService> f6327d = new p<>(new m());

    public final List<b<?>> getComponents() {
        b[] bVarArr = new b[4];
        Class<a> cls = a.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        u uVar = new u(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        u[] uVarArr = {new u(cls, cls3), new u(cls, cls4)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(uVar);
        int length = uVarArr.length;
        int i8 = 0;
        while (i8 < length) {
            if (uVarArr[i8] != null) {
                i8++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, uVarArr);
        String str = "Null interface";
        bVarArr[0] = new b((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new q(), hashSet3);
        Class<q9.b> cls5 = q9.b.class;
        u uVar2 = new u(cls5, cls2);
        u[] uVarArr2 = {new u(cls5, cls3), new u(cls5, cls4)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(uVar2);
        int length2 = uVarArr2.length;
        int i10 = 0;
        while (i10 < length2) {
            if (uVarArr2[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException(str);
            }
        }
        Collections.addAll(hashSet4, uVarArr2);
        bVarArr[1] = new b((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new n(0), hashSet6);
        Class<c> cls6 = c.class;
        u uVar3 = new u(cls6, cls2);
        u[] uVarArr3 = {new u(cls6, cls3), new u(cls6, cls4)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(uVar3);
        int length3 = uVarArr3.length;
        int i11 = 0;
        while (i11 < length3) {
            if (uVarArr3[i11] != null) {
                i11++;
            } else {
                throw new NullPointerException(str);
            }
        }
        Collections.addAll(hashSet7, uVarArr3);
        bVarArr[2] = new b((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new k6.q(0), hashSet9);
        u uVar4 = new u(d.class, cls4);
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(uVar4);
        Collections.addAll(hashSet10, new u[0]);
        bVarArr[3] = new b((String) null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new b0(), hashSet12);
        return Arrays.asList(bVarArr);
    }
}
