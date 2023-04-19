public class ConstConds {
    public int foo() {
      var b = 45 > 23 || true;
      if (!b) return 1;
      if (false || b) return 2;
      if (true) return 3;
      if (false) return 4;
      return 5;
    }
}
