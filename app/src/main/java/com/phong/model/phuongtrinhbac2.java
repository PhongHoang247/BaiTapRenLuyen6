package com.phong.model;

public class phuongtrinhbac2 {
    private double a;
    private double b;
    private double c;

    public phuongtrinhbac2() {
    }

    public phuongtrinhbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public String giai()
    {
        if (a==0)//trở thành pt bậc 1:bx+c=0
        {
            if (b==0 && c==0)
            {
                return "Phương trình vô số nghiệm!";
            }
            if (b==0 && c!=0)
            {
                return  "Phương trình vô nghiệm!";
            }
            else
            {
                return "x = " + (-b/c);
            }
        }
        else
        {
            double delta = Math.pow(b,2)-4*a*c;
            if (delta < 0)
            {
                return "Phương trình vô nghiệm!";
            }
            if (delta == 0)
            {
                double x = -b/(2*a);
                return "Phương trình có nghiệm kép: x1 = x2 = " + x;
            }
            else
            {
                double x1 = (-b-Math.sqrt(delta)/(2*a));
                double x2 = (-b+Math.sqrt(delta)/(2*a));
                return "Phương trình có 2 nghiệm phân biệt \n" +
                        "x1 = " + x1 + "\n" +
                        "x2 = " + x2 + "\n";
            }
        }
    }
}
