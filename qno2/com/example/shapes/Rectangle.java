package com.example.shapes;

 class Rectangle {
    int length;
    int breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area() {
        return length * breadth;
    }
}
