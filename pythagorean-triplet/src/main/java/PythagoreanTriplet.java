import java.util.*;
class PythagoreanTriplet{
    private int a,b,c;
    public PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTripletBuilder makeTripletsList(){
        return new PythagoreanTripletBuilder();
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        else if(obj instanceof PythagoreanTriplet){
            PythagoreanTriplet PythagoreanTripletObject = (PythagoreanTriplet)obj;
            if(this.a==PythagoreanTripletObject.a && this.b == PythagoreanTripletObject.b && this.c == PythagoreanTripletObject.c)
                return true;
        }
        return false;
    }
}
class PythagoreanTripletBuilder{
    int maxSum;
    public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int limit){
        return this;
    }
    public PythagoreanTripletBuilder thatSumTo(int maxSum){
        this.maxSum = maxSum;
        return this;
    }
    public List<PythagoreanTriplet> build(){
        List<PythagoreanTriplet> list = new ArrayList<>();
        for(int a=1;a<maxSum;a++){
            for(int b=a+1;b<maxSum;b++){
                int c = maxSum-(a+b);
                if(((a*a)+(b*b))==(c*c))
                    list.add(new PythagoreanTriplet(a,b,c));
            }
        }
        return list;
    }
}