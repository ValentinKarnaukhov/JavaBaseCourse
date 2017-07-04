
public class Pair<A,B> {
    private A a;
    private B b;
    private  Pair(A a, B b){
        this.a=a;
        this.b=b;
    }
    public static <A,B> Pair<A,B> of(A a, B b){
        return new Pair<A,B>(a,b);
    }
    public A getFirst(){
        return a;
    }
    public B getSecond(){
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (a != null ? !a.equals(pair.a) : pair.a != null) return false;
        return b != null ? b.equals(pair.b) : pair.b == null;

    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }
}
