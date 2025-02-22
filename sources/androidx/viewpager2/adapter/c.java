package androidx.viewpager2.adapter;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2839a;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f2839a = fragmentStateAdapter;
    }

    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f2839a;
        fragmentStateAdapter.F = false;
        fragmentStateAdapter.r();
    }
}
