package ub;

import java.util.Comparator;

public final class a implements Comparator<x> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15960a;

    public a(int i8) {
        this.f15960a = i8;
    }

    public final int compare(Object obj, Object obj2) {
        x xVar = (x) obj;
        x xVar2 = (x) obj2;
        int i8 = xVar.f15991a * xVar.f15992b;
        int i10 = this.f15960a;
        int abs = Math.abs(i8 - i10);
        int abs2 = Math.abs((xVar2.f15991a * xVar2.f15992b) - i10);
        if (abs < abs2) {
            return -1;
        }
        return abs == abs2 ? 0 : 1;
    }
}
