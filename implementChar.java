/**
 * Created by Valentin on 20.06.2017.
 */
public class AsciiCharSequence implements CharSequence{
    private byte[] data;
    public  AsciiCharSequence(byte[] data){
        this.data=data;
    }
    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int i) {
        return (char) data[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        byte[] newbyte=new byte[i1-i];
        for(int k=0, j=i;j<i1;j++,k++){
            newbyte[k]=data[j];
        }
        return new AsciiCharSequence(newbyte);
    }

    @Override
    public String toString() {

        return new String(data);
    }
}
