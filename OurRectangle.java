public class OurRectangle {
    private int x;
    private int y;
    private int w;
    private int l;

    public OurRectangle(int x, int y, int w, int l) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.l = l;
        if (w < 0) {
            this.w = 0;
        }
        if (l < 0) {
            this.l = 0;
        }
    }

    public String toString() {
        String str = "base: (" + x + "," + y + ") w:" + w + " h:" + l;
        return str;
    }

    public int area() {
        int area = l * w;
        return area;
    }

    public int perimeter() {
        int perimeter = ((l * 2) + (w * 2));
        return perimeter;
    }

    public static OurRectangle intersection(OurRectangle r1, OurRectangle r2) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int w = 0;
        int l = 0;

        // calculate x-coord of the left
        if (r1.x >= r2.x) {
            x1 = r1.x;
        } else {
            x1 = r2.x;
        }

        // calculate y-coord of the bottom
        if (r1.y >= r2.y) {
            y1 = r1.y;
        } else {
            y1 = r2.y;
        }

        // calculate x-coord of the right
        if (r1.x + r1.w <= r2.x + r2.w) {
            x2 = r1.x + r1.w;
        } else {
            x2 = r2.x + r2.w;
        }

        // calculate y-coord of the top
        if (r1.y + r1.l <= r2.y + r2.l) {
            y2 = r1.y + r1.l;
        } else {
            y2 = r2.y + r2.l;
        }
        // calculate width
        w = x2 - x1;
        // calculate length
        l = y2 - y1;

        if (w < 0 || l < 0) {
            return new OurRectangle(0, 0, 0, 0);
        }
        return new OurRectangle(x1, y1, w, l);
    }

    public static int totalPerimeter(OurRectangle r1, OurRectangle r2){
        int perir1 = 0;
        int perir2 = 0;
        int totalperi = 0;
        int sharedperi = intersection(r1,r2).perimeter();
        perir1 = r1.l + r1.l + r1.w + r1.w;
        perir2 = r2.l + r2.l + r2.w + r2.w;
        totalperi = perir1 + perir2 - sharedperi;
        return totalperi;
    }
    public boolean contains(OurRectangle r) {
        boolean tru = false;
        if ((r.x >= x && r.x + r.w <= x + w) && (r.y >= y && r.y + r.l <= y + l)) {
            tru = true;
        }
        return tru;
    }
}
