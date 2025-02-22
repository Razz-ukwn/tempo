package gf;

import cb.d;
import d.a;
import d2.f1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import rf.l;
import sf.j;

public class q extends o {
    public static String A0(Iterable iterable, String str, String str2, String str3, l lVar, int i8) {
        if ((i8 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i8 & 2) != 0 ? "" : str2;
        String str6 = (i8 & 4) != 0 ? "" : str3;
        int i10 = (i8 & 8) != 0 ? -1 : 0;
        String str7 = (i8 & 16) != 0 ? "..." : null;
        l lVar2 = (i8 & 32) != 0 ? null : lVar;
        j.f(iterable, "<this>");
        j.f(str4, "separator");
        j.f(str5, "prefix");
        j.f(str6, "postfix");
        j.f(str7, "truncated");
        StringBuilder sb2 = new StringBuilder();
        y0(iterable, sb2, str4, str5, str6, i10, str7, lVar2);
        String sb3 = sb2.toString();
        j.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final <T> T B0(List<? extends T> list) {
        j.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(d.H(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T C0(List<? extends T> list) {
        j.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Comparable D0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final float E0(Iterable<Float> iterable) {
        j.f(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    public static final float F0(Iterable<Float> iterable) {
        j.f(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    public static final ArrayList G0(Iterable iterable, Collection collection) {
        j.f(collection, "<this>");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        o.p0(iterable, arrayList2);
        return arrayList2;
    }

    public static final ArrayList H0(Collection collection, Object obj) {
        j.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final <T> List<T> I0(Iterable<? extends T> iterable) {
        j.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return O0(iterable);
        }
        List<T> Q0 = Q0(iterable);
        Collections.reverse(Q0);
        return Q0;
    }

    public static final <T> List<T> J0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return O0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            j.f(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return l.R(array);
        }
        List<T> Q0 = Q0(iterable);
        n.o0(Q0, comparator);
        return Q0;
    }

    public static final <T> List<T> K0(Iterable<? extends T> iterable, int i8) {
        j.f(iterable, "<this>");
        int i10 = 0;
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(a.a("Requested element count ", i8, " is less than zero.").toString());
        } else if (i8 == 0) {
            return s.f8978a;
        } else {
            if (iterable instanceof Collection) {
                if (i8 >= ((Collection) iterable).size()) {
                    return O0(iterable);
                }
                if (i8 == 1) {
                    return d.O(t0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i8);
            for (Object add : iterable) {
                arrayList.add(add);
                i10++;
                if (i10 == i8) {
                    break;
                }
            }
            return d.W(arrayList);
        }
    }

    public static final byte[] L0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            bArr[i8] = ((Number) it.next()).byteValue();
            i8++;
        }
        return bArr;
    }

    public static final void M0(Iterable iterable, AbstractCollection abstractCollection) {
        j.f(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static final int[] N0(Collection<Integer> collection) {
        j.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i8 = 0;
        for (Integer intValue : collection) {
            iArr[i8] = intValue.intValue();
            i8++;
        }
        return iArr;
    }

    public static final <T> List<T> O0(Iterable<? extends T> iterable) {
        j.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return d.W(Q0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.f8978a;
        }
        if (size != 1) {
            return P0(collection);
        }
        return d.O(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final ArrayList P0(Collection collection) {
        j.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> Q0(Iterable<? extends T> iterable) {
        j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return P0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        M0(iterable, arrayList);
        return arrayList;
    }

    public static final <T> Set<T> R0(Iterable<? extends T> iterable) {
        j.f(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        u uVar = u.f8980a;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return uVar;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(f1.B(collection.size()));
                M0(iterable, linkedHashSet);
                return linkedHashSet;
            }
            Set<T> singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            j.e(singleton, "singleton(element)");
            return singleton;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        M0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return uVar;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        Set<T> singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
        j.e(singleton2, "singleton(element)");
        return singleton2;
    }

    public static final <T> boolean s0(Iterable<? extends T> iterable, T t2) {
        int i8;
        j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t2);
        }
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i8 = -1;
                    break;
                }
                Object next = it.next();
                if (i10 < 0) {
                    d.i0();
                    throw null;
                } else if (j.a(t2, next)) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            i8 = ((List) iterable).indexOf(t2);
        }
        return i8 >= 0;
    }

    public static final <T> T t0(Iterable<? extends T> iterable) {
        j.f(iterable, "<this>");
        if (iterable instanceof List) {
            return u0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T u0(List<? extends T> list) {
        j.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T v0(List<? extends T> list) {
        j.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object w0(Set set) {
        if (set instanceof List) {
            List list = (List) set;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final Object x0(int i8, List list) {
        j.f(list, "<this>");
        if (i8 < 0 || i8 > d.H(list)) {
            return null;
        }
        return list.get(i8);
    }

    public static final void y0(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, l lVar) {
        j.f(iterable, "<this>");
        j.f(charSequence, "separator");
        j.f(charSequence2, "prefix");
        j.f(charSequence3, "postfix");
        j.f(charSequence4, "truncated");
        sb2.append(charSequence2);
        int i10 = 0;
        for (Object next : iterable) {
            i10++;
            if (i10 > 1) {
                sb2.append(charSequence);
            }
            if (i8 >= 0 && i10 > i8) {
                break;
            }
            d.l(sb2, next, lVar);
        }
        if (i8 >= 0 && i10 > i8) {
            sb2.append(charSequence4);
        }
        sb2.append(charSequence3);
    }
}
