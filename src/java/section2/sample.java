// What is the code ???
// What do each variable mean ???
// Some variable replaced twice. <- we shouldn't replace because ...

public class sample{
  public static void main(String[] args) {
    double tmp_p=0, tmp_n=0;
    double a=1, b=3, c=-4;

    tmp_n = -b - Math.sqrt(b*b-4*a*c);
    tmp_n /= 2*a;

    tmp_p = -b + Math.sqrt(b*b-4*a*c);
    tmp_p /= 2*a;

    System.out.println("ans_n: "+tmp_n);
    System.out.println("ans_p: "+tmp_p);
  }
}
