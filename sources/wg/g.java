package wg;

import java.nio.channels.WritableByteChannel;

public interface g extends g0, WritableByteChannel {
    g A0(long j10);

    g M(String str);

    g O(i iVar);

    g W(long j10);

    e a();

    void flush();

    g write(byte[] bArr);

    g write(byte[] bArr, int i8, int i10);

    g writeByte(int i8);

    g writeInt(int i8);

    g writeShort(int i8);

    long x(i0 i0Var);
}
