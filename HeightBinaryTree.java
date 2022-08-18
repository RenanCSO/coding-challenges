
class Node {
        int data;
        Node left;
        Node right;
}

public class HeightBinaryTree {
    public static void main(String[] args) {
        // TEST CASE 1 - 3
        Node root = new Node();
        root.data = 3;

        Node one = new Node();
        one.data = 1;

        Node two = new Node();
        two.data = 2;

        Node four = new Node();
        four.data = 4;

        Node five = new Node();
        five.data = 5;

        Node six = new Node();
        six.data = 6;

        Node seven = new Node();
        seven.data = 7;

        root.left = two;
        root.right = five;
        two.left = one;
        five.left = four;
        five.right = six;
        six.right = seven;

        System.out.println(height(root));
    }

    private static int max(int number1, int number2) {
        if (number1 >= number2) {
            return number1;
        }

        return number2;
    }
    private static int height(Node root) {

        int count = 0;
        if (root == null) {
            return 0;
        } else if (root.right == null && root.left == null) {
            return 0;
        } else {
            count++;
            count += max(height(root.left), height(root.right));
        }

        return count;
    }
}
