package ObjectOrientedProgramming;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);

    }
}

class Point {
    int x = 10;
    int y = 30;

    Point() {
        // ����Ʈ�Ҷ� ��������� ���� �ʱⰪ���� ���õȴ�.
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
        // ����Ŭ������ ����Ʈ �����ڰ� ���� ���!
        // ���� Ŭ������ ����Ʈ ���� 10,30���� �ʱ�ȭ�ǰ�
        // z���� �Ķ���ͷ� ���� 300���� �ʱ�ȭ�ȴ�.

        // ����Ŭ������ ����Ʈ �����ڰ� ���� ���!
        // super(x,y);
        // super�� ��� Point Ŭ������ �θ� ��,
        // x�� y�� 10�� 30���� �ʱ�ȭ�ǰ�
        // Print3D�� ����Ʈ �����ڸ� �θ���
        // ����Ʈ �����ڰ� �Ķ���Ͱ� �ִ� �����ڸ� �θ���.
        // �ű⿡�� Point Ŭ������ �Ķ���Ͱ� �ִ� �����ڸ� �θ���
        // �׷��� Point3D�� �������� �ʱⰪ�� �Ķ���ͷ� ����
        // 100,200,300�� �Ҵ�ȴ�.

        this.z = z;

    }
}