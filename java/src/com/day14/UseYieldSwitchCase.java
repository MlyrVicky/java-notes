package com.day14;

public class UseYieldSwitchCase {
    public static void main(String[] args) {
        int i = 0;
        int J = switch (i) {
            case 1:
                yield i;

            default:
                yield i;

        };
    }
}
