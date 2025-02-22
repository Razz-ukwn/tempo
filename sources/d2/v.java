package d2;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f7280a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f7281b;

    /* renamed from: c  reason: collision with root package name */
    public final View f7282c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7283d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f7284e;

    public v(View view) {
        this.f7282c = view;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent f12;
        if (!this.f7283d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return a1.a(f12, this.f7282c, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.f7283d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return a1.b(f12, this.f7282c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i8, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent f10;
        int i12;
        int i13;
        int[] iArr3;
        int i14 = i8;
        int i15 = i10;
        int i16 = i11;
        int[] iArr4 = iArr2;
        if (!this.f7283d || (f10 = f(i16)) == null) {
            return false;
        }
        if (i14 != 0 || i15 != 0) {
            View view = this.f7282c;
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                i13 = iArr4[0];
                i12 = iArr4[1];
            } else {
                i13 = 0;
                i12 = 0;
            }
            if (iArr == null) {
                if (this.f7284e == null) {
                    this.f7284e = new int[2];
                }
                iArr3 = this.f7284e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view2 = this.f7282c;
            if (f10 instanceof w) {
                ((w) f10).o(view2, i8, i10, iArr3, i11);
            } else if (i16 == 0) {
                try {
                    a1.c(f10, view2, i14, i15, iArr3);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedPreScroll", e10);
                }
            }
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i13;
                iArr4[1] = iArr4[1] - i12;
            }
            return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final void d(int i8, int i10, int i11, int[] iArr) {
        e(0, i8, 0, i10, (int[]) null, i11, iArr);
    }

    public final boolean e(int i8, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent f10;
        int i14;
        int i15;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i16 = i13;
        if (!this.f7283d || (f10 = f(i16)) == null) {
            return false;
        }
        if (i8 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        View view = this.f7282c;
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            i15 = iArr4[0];
            i14 = iArr4[1];
        } else {
            i15 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            if (this.f7284e == null) {
                this.f7284e = new int[2];
            }
            int[] iArr5 = this.f7284e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f7282c;
        if (f10 instanceof x) {
            ((x) f10).j(view2, i8, i10, i11, i12, i13, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i11;
            iArr3[1] = iArr3[1] + i12;
            if (f10 instanceof w) {
                ((w) f10).k(view2, i8, i10, i11, i12, i13);
            } else if (i16 == 0) {
                try {
                    a1.d(f10, view2, i8, i10, i11, i12);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i15;
            iArr4[1] = iArr4[1] - i14;
        }
        return true;
    }

    public final ViewParent f(int i8) {
        if (i8 == 0) {
            return this.f7280a;
        }
        if (i8 != 1) {
            return null;
        }
        return this.f7281b;
    }

    public final boolean g(int i8, int i10) {
        boolean z10;
        if (f(i10) != null) {
            return true;
        }
        if (this.f7283d) {
            View view = this.f7282c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z11 = parent instanceof w;
                if (z11) {
                    z10 = ((w) parent).l(view2, view, i8, i10);
                } else {
                    if (i10 == 0) {
                        try {
                            z10 = a1.f(parent, view2, view, i8);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    z10 = false;
                }
                if (z10) {
                    if (i10 == 0) {
                        this.f7280a = parent;
                    } else if (i10 == 1) {
                        this.f7281b = parent;
                    }
                    if (z11) {
                        ((w) parent).m(view2, view, i8, i10);
                    } else if (i10 == 0) {
                        try {
                            a1.e(parent, view2, view, i8);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i8) {
        ViewParent f10 = f(i8);
        if (f10 != null) {
            boolean z10 = f10 instanceof w;
            View view = this.f7282c;
            if (z10) {
                ((w) f10).n(view, i8);
            } else if (i8 == 0) {
                try {
                    a1.g(f10, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i8 == 0) {
                this.f7280a = null;
            } else if (i8 == 1) {
                this.f7281b = null;
            }
        }
    }
}
