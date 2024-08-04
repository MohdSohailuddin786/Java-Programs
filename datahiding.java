public class datahiding {
        private double length;
        private double breadth;
        //setter and getter methods
        public  double getlength()
        {
            return length;
        }
        public double  getbreadth()
        {
            return breadth;
        }
        public void setlength(double l)
        {
           if(l>=0)
           length=1;
           else
            length=0;   
        }
        public void setbreadth(double b)
        {
           if(b>=0)
           breadth=1;
           else
            breadth=0;   
        }
        public double area()
        {
            return getlength()*getbreadth();
        }
        public double perimeter()
        {
            return 2*(length+breadth);
        }
        public boolean isSquare()
        {
            if(length==breadth)
            return true;
            else
            return false;
        }
}
  class my{ 
    public static void main(String[] args) {
            datahiding r=new datahiding();
            r.setlength(5);
            r.setbreadth(4);
            System.out.println("area"+r.area());
            System.out.println("perimeter"+r.perimeter());
            System.out.println("issquare"+r.isSquare());
            System.out.println("length"+r.getlength());
            System.out.println("breadth"+r.getbreadth());
        }
    }

