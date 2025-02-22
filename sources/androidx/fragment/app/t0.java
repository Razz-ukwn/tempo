package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import y1.e;

public final class t0 extends x0 {

    public class a implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2141a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2142b;

        public a(View view, ArrayList arrayList) {
            this.f2141a = view;
            this.f2142b = arrayList;
        }

        public final void onTransitionCancel(Transition transition) {
        }

        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2141a.setVisibility(8);
            ArrayList arrayList = this.f2142b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((View) arrayList.get(i8)).setVisibility(0);
            }
        }

        public final void onTransitionPause(Transition transition) {
        }

        public final void onTransitionResume(Transition transition) {
        }

        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    public class b extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f2143a;

        public b(Rect rect) {
            this.f2143a = rect;
        }

        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2143a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean s(Transition transition) {
        return !x0.h(transition.getTargetIds()) || !x0.h(transition.getTargetNames()) || !x0.h(transition.getTargetTypes());
    }

    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i8 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i8 < transitionCount) {
                    b(transitionSet.getTransitionAt(i8), arrayList);
                    i8++;
                }
            } else if (!s(transition) && x0.h(transition.getTargets())) {
                int size = arrayList.size();
                while (i8 < size) {
                    transition.addTarget(arrayList.get(i8));
                    i8++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new a(view, arrayList));
    }

    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new u0(this, obj2, arrayList, obj3, arrayList2));
    }

    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            x0.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new s0(rect));
        }
    }

    public final void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new b(rect));
    }

    public final void o(Object obj, e eVar, l lVar) {
        ((Transition) obj).addListener(new v0(lVar));
    }

    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            x0.d(arrayList.get(i8), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            t(transitionSet, arrayList, arrayList2);
        }
    }

    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i8 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i8 < transitionCount) {
                t(transitionSet.getTransitionAt(i8), arrayList, arrayList2);
                i8++;
            }
        } else if (!s(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i8 < size) {
                transition.addTarget(arrayList2.get(i8));
                i8++;
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    transition.removeTarget(arrayList.get(size2));
                } else {
                    return;
                }
            }
        }
    }
}
