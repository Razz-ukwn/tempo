package wg;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface h extends i0, ReadableByteChannel {
    long C0();

    InputStream D0();

    String G(long j10);

    String P(Charset charset);

    e a();

    boolean c0(long j10);

    String j0();

    i k(long j10);

    int l0();

    long r(g gVar);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    long t0();

    int w(x xVar);

    boolean y();

    void z0(long j10);
}
