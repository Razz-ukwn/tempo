package u6;

import java.util.ArrayList;

public final class o {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f15848a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f15849b;

        public /* synthetic */ a(Object obj) {
            q.i(obj);
            this.f15849b = obj;
        }

        public final void a(Object obj, String str) {
            ArrayList arrayList = this.f15848a;
            String valueOf = String.valueOf(obj);
            arrayList.add(str + "=" + valueOf);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f15849b.getClass().getSimpleName());
            sb2.append('{');
            ArrayList arrayList = this.f15848a;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                sb2.append((String) arrayList.get(i8));
                if (i8 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }
}
