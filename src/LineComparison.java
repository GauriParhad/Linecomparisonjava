public class LineComparison {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 4;
        int y1 = 6;
        int y2 = 9;

        double lengthofline1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line1 is :"+lengthofline1);


        int x3 = 4;
        int x4 = 7;
        int y3 = 8;
        int y4 = 11;

        double lengthofline2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of line2 is :"+lengthofline2);

        {
            int a1, a2;

            a1 = (y2 - y1) / (x2 - x1);
            a2 = (y4 - y3) / (x4 - x3);

            if (a1 == a2)
                System.out.println("line1 and line2 are equal");
            else
                System.out.println("line1 and line2 are not equal");
        }

        {

            if (lengthofline1 == lengthofline2)
                System.out.println("It's Equal");
            else
                System.out.println("It's not Equal");
        }

    }
}


