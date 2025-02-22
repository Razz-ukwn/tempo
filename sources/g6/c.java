package g6;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f8880a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8881b;

    public enum a implements ma.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f8886a;

        /* access modifiers changed from: public */
        a(int i8) {
            this.f8886a = i8;
        }

        public final int a() {
            return this.f8886a;
        }
    }

    public c(long j10, a aVar) {
        this.f8880a = j10;
        this.f8881b = aVar;
    }
}
