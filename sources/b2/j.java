package b2;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final d f3016a = new d((a) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f3017b = new d((a) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f3018c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f3019d;

    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3020a = new a();

        public final int a(CharSequence charSequence, int i8) {
            int i10 = i8 + 0;
            int i11 = 2;
            for (int i12 = 0; i12 < i10 && i11 == 2; i12++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i12));
                d dVar = j.f3016a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i11 = 2;
                                break;
                        }
                    }
                    i11 = 0;
                }
                i11 = 1;
            }
            return i11;
        }
    }

    public interface b {
        int a(CharSequence charSequence, int i8);
    }

    public static abstract class c implements i {

        /* renamed from: a  reason: collision with root package name */
        public final b f3021a;

        public c(a aVar) {
            this.f3021a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i8) {
            if (charSequence == null || i8 < 0 || charSequence.length() - i8 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f3021a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(charSequence, i8);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }
    }

    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3022b;

        public d(a aVar, boolean z10) {
            super(aVar);
            this.f3022b = z10;
        }

        public final boolean a() {
            return this.f3022b;
        }
    }

    static {
        a aVar = a.f3020a;
        f3018c = new d(aVar, false);
        f3019d = new d(aVar, true);
    }
}
